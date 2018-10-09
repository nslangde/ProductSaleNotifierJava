package com.nslangde.common;

import com.nslangde.type.AdjustmentType;
import com.nslangde.type.ProductType;

/**
 * @author nikhillangde
 *
 */
public class Adjustment {
	
	private AdjustmentType adjustmentType;
	
	private ProductType productType;
	
	private int adjustmentFactor;
	
	/**
	 * 
	 */
	public Adjustment() {
		super();
	}

	/**
	 * @param adjustmentType
	 * @param productType
	 * @param adjustmentFactor
	 */
	public Adjustment(AdjustmentType adjustmentType, ProductType productType, int adjustmentFactor) {
		super();
		this.adjustmentType = adjustmentType;
		this.productType = productType;
		this.adjustmentFactor = adjustmentFactor;
	}

	/**
	 * @return the adjustmentType
	 */
	public AdjustmentType getAdjustmentType() {
		return adjustmentType;
	}

	/**
	 * @param adjustmentType the adjustmentType to set
	 */
	public void setAdjustmentType(AdjustmentType adjustmentType) {
		this.adjustmentType = adjustmentType;
	}

	/**
	 * @return the productType
	 */
	public ProductType getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	/**
	 * @return the adjustmentFactor
	 */
	public int getAdjustmentFactor() {
		return adjustmentFactor;
	}

	/**
	 * @param adjustmentFactor the adjustmentFactor to set
	 */
	public void setAdjustmentFactor(int adjustmentFactor) {
		this.adjustmentFactor = adjustmentFactor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Adjustment [adjustmentType=");
		builder.append(adjustmentType);
		builder.append(", productType=");
		builder.append(productType);
		builder.append(", adjustmentFactor=");
		builder.append(adjustmentFactor);
		builder.append("]");
		return builder.toString();
	}
	
}
