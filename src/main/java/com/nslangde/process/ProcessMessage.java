package com.nslangde.process;

import java.util.ArrayList;

import com.nslangde.common.Message;
import com.nslangde.common.Sale;
import com.nslangde.reporting.AdjustmentsReport;
import com.nslangde.reporting.SalesReport;
import com.nslangde.sale.memory.Memory;
import com.nslangde.type.ProductType;

public class ProcessMessage {
	
	private final int MAX_MESSAGES = 50;
	private final int SALES_REPORT_COUNTER = 10;
	private final int EXIT_SUCCESS = 0;
	
	public void processMessageAsPerType(Message message) {
		
		ProductType productType = message.getProductType();
		
		switch (message.getMsgType()) {
			
			case TYPE1:
			case TYPE2:
				
				if(Memory.salesMemory.containsKey(productType)) {
					ArrayList<Sale> existingSales = Memory.salesMemory.get(productType);
					existingSales.add(message.getSale());
					
					Memory.salesMemory.replace(productType, existingSales);
				} else {
					ArrayList<Sale> newSale = new ArrayList<Sale>();
					newSale.add(message.getSale());
					Memory.salesMemory.put(productType, newSale);
				}
				
				break;
			
			case TYPE3:
				new AdjustSale().adjustSale(message.getAdjustment());
				break;
		}
		
		Memory.messagesMemory.add(message);
		
		if(Memory.messagesMemory.size() % SALES_REPORT_COUNTER == 0) {
			
			System.out.println("size:" + Memory.messagesMemory.size());
			
			SalesReport.generateSalesReport();

			if(Memory.messagesMemory.size() == MAX_MESSAGES) {
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("----------------------------Notifier stopping----------------------------");
				System.out.println("-------------------------------------------------------------------------");

				AdjustmentsReport.generateAdjustmentsReport();

				System.exit(EXIT_SUCCESS);
			}
		}
	}

}
