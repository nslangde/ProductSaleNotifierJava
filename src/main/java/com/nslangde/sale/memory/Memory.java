package com.nslangde.sale.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nslangde.common.Adjustment;
import com.nslangde.common.Message;
import com.nslangde.common.Sale;
import com.nslangde.type.ProductType;

public class Memory {
	
	// Store for all notification messages
	public static List<Message> messagesMemory = new ArrayList<Message>();

	// Store for list of sales against particular product
	public static Map<ProductType, ArrayList<Sale>> salesMemory = new HashMap<ProductType, ArrayList<Sale>>();
	
	// Store for all adjustment notification messages
	public static List<Adjustment> adjustmentsMemory = new ArrayList<Adjustment>();
}
