package com.nslangde.common;

public class Sale {

	private int pricePerProduct;
	
	private int totalQuantity;
	
	/**
	 * 
	 */
	public Sale() {
		super();
	}

	public Sale(int pricePerProduct, int quantity) {
		this.pricePerProduct = pricePerProduct;
		this.totalQuantity = quantity;
	}

	public int getPriceInPence() {
		return pricePerProduct;
	}

	public void setPriceInPence(int priceInPence) {
		this.pricePerProduct = priceInPence;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	@Override
	public String toString() {
		return "Sale [priceInPence=" + pricePerProduct + ", totalQuantity=" + totalQuantity + "]";
	}
	
}
