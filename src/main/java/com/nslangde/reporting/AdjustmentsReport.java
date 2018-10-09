package com.nslangde.reporting;

import com.nslangde.common.Adjustment;
import com.nslangde.sale.memory.Memory;

public class AdjustmentsReport {

	public static void generateAdjustmentsReport() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("---------------------------Adjustments Details---------------------------");
		System.out.println("-------------------------------------------------------------------------");
		
		for (Adjustment adjustment: Memory.adjustmentsMemory) {
			
			System.out.println(adjustment);
		}
		
		System.out.println("-------------------------------------------------------------------------");
	}

}
