package com.nslangde.reporting;

import java.util.ArrayList;

import com.nslangde.common.Sale;
import com.nslangde.sale.memory.Memory;

public class SalesReport {

	public static void generateSalesReport() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("------------------------------Sales Details------------------------------");
		System.out.println("-------------------------------------------------------------------------");
		
		
		Memory.salesMemory.forEach((productType, sales) -> System.out.println("Product Type : " + productType 
				+ " and it's total price is : " + computeTotalPrice(sales)));
		
		System.out.println("-------------------------------------------------------------------------");
	}

	private static int computeTotalPrice(ArrayList<Sale> sales) {
		
		int totalPrice = 0;
		
		for (Sale sale : sales) {
			totalPrice+= sale.getPriceInPence() * sale.getTotalQuantity();
		}
		
		
		return totalPrice;
	}

}
