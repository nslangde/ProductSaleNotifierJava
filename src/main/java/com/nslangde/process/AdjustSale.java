package com.nslangde.process;

import java.util.ArrayList;

import com.nslangde.common.Adjustment;
import com.nslangde.common.Sale;
import com.nslangde.sale.memory.Memory;
import com.nslangde.type.ProductType;

public class AdjustSale {
	
	private ArrayList<Sale> existingSales;

	public void adjustSale(Adjustment adjustment) {

		ProductType productType = adjustment.getProductType();

		existingSales = Memory.salesMemory.get(productType);

		if (null != existingSales) {
			
			ArrayList<Sale> updatedSales = new ArrayList<Sale>();
			
			switch (adjustment.getAdjustmentType()) {
			case ADD:
				addSale(updatedSales, adjustment.getAdjustmentFactor());
				break;
			case SUBTRACT:
				subtractSale(updatedSales, adjustment.getAdjustmentFactor());
				break;
			case MULTIPLY:
				multiplySale(updatedSales, adjustment.getAdjustmentFactor());
				break;
			}
			
			// As adjustment completed add entry for adjustment for adjustment report
			Memory.adjustmentsMemory.add(adjustment);
			
			// Update Sales store with new sales details
			Memory.salesMemory.replace(productType, updatedSales);
		}

	}

	private void addSale(ArrayList<Sale> updatedSales, int adjustmentFactor) {
		for (Sale sale : existingSales) {
			int currentPrice = sale.getPriceInPence();
			sale.setPriceInPence(currentPrice + adjustmentFactor);
			updatedSales.add(sale);
		}
	}

	private void subtractSale(ArrayList<Sale> updatedSales, int adjustmentFactor) {
		for (Sale sale : existingSales) {
			int currentPrice = sale.getPriceInPence();
			sale.setPriceInPence(currentPrice - adjustmentFactor);
			updatedSales.add(sale);
		}
	}

	private void multiplySale(ArrayList<Sale> updatedSales, int adjustmentFactor) {
		for (Sale sale : existingSales) {
			int currentPrice = sale.getPriceInPence();
			sale.setPriceInPence(currentPrice * adjustmentFactor);
			updatedSales.add(sale);
		}
	}
}
