package com.nslangde.productsalenotifier.sale.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nslangde.productsalenotifier.common.Adjustment;
import com.nslangde.productsalenotifier.common.Message;
import com.nslangde.productsalenotifier.common.Sale;
import com.nslangde.productsalenotifier.type.ProductType;

/**
 * 
 * This is storage for this application.
 * 
 * This store will be use to record all messages, sales and adjustments as memory of application.
 * 
 * @author nikhillangde
 *
 */
public class Memory {
	
	// Store for all notification messages
	public static List<Message> messagesMemory = new ArrayList<Message>();

	// Store for list of sales against particular product
	public static Map<ProductType, ArrayList<Sale>> salesMemory = new HashMap<ProductType, ArrayList<Sale>>();
	
	// Store for all adjustment notification messages
	public static List<Adjustment> adjustmentsMemory = new ArrayList<Adjustment>();
}
