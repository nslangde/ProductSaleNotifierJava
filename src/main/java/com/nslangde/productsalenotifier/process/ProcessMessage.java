package com.nslangde.productsalenotifier.process;

import java.util.ArrayList;

import com.nslangde.productsalenotifier.common.Message;
import com.nslangde.productsalenotifier.common.Sale;
import com.nslangde.productsalenotifier.reporting.AdjustmentsReport;
import com.nslangde.productsalenotifier.reporting.SalesReport;
import com.nslangde.productsalenotifier.sale.memory.Memory;
import com.nslangde.productsalenotifier.type.ProductType;

/**
 * 
 * Message processor.
 * 
 * @author nikhillangde
 *
 */
public class ProcessMessage {
	
	private static final int MAX_MESSAGES = 50;
	private static final int SALES_REPORT_COUNTER = 10;
	private static final int EXIT_SUCCESS = 0;
	
	public static void processMessageAsPerType(Message message) {
		
		ProductType productType = message.getProductType();
		
		switch (message.getMsgType()) {
			//For Type 1 an Type 2 messages process is same as these differ only in quantity of sale
			case TYPE1:
			case TYPE2:
				//If sale already recorded for product update sale other wise add new sale entry.
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
			
			//For Type 3 messages adjust sales in Sales store
			case TYPE3:
				new AdjustSale().adjustSale(message.getAdjustment());
				break;
		}
		
		// Add entry in message store
		Memory.messagesMemory.add(message);
		
		if(Memory.messagesMemory.size() % SALES_REPORT_COUNTER == 0) {
			
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
