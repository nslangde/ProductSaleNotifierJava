package com.nslangde.productsalenotifier.common;

/**
 * Sales bean
 * 
 */
public class Sale {

	private int pricePerProduct;
	
	private int totalQuantity;
	
	/**
	 * 
	 */
	public Sale() {
		super();
	}

	/**
	 * @param pricePerProduct
	 * @param quantity
	 */
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pricePerProduct;
		result = prime * result + totalQuantity;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		if (pricePerProduct != other.pricePerProduct)
			return false;
		if (totalQuantity != other.totalQuantity)
			return false;
		return true;
	}
	
}
