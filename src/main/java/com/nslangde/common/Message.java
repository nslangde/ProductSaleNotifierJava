package com.nslangde.common;

import com.nslangde.common.Adjustment;
import com.nslangde.type.MessageType;
import com.nslangde.type.ProductType;

/**
 * Message bean
 * 
 */
public class Message {
	
	private MessageType msgType;
	
	private ProductType productType;
	
	private Sale sale;
	
	private Adjustment adjustment;

	/**
	 * @param msgType
	 * @param sale
	 * @param adjustment
	 */
	public Message(MessageType msgType, ProductType productType, Sale sale, Adjustment adjustment) {
		super();
		this.msgType = msgType;
		this.productType = productType;
		this.sale = sale;
		this.adjustment = adjustment;
	}

	public MessageType getMsgType() {
		return msgType;
	}

	public void setMsgType(MessageType msgType) {
		this.msgType = msgType;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public Adjustment getAdjustment() {
		return adjustment;
	}

	public void setAdjustment(Adjustment adjustment) {
		this.adjustment = adjustment;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Message [msgType=");
		builder.append(msgType);
		builder.append(", productType=");
		builder.append(productType);
		builder.append(", sale=");
		builder.append(sale);
		builder.append(", adjustment=");
		builder.append(adjustment);
		builder.append("]");
		return builder.toString();
	}
	
}
