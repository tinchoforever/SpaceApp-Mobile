package com.spaceapp.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Formatter {

	public static String formatDistance(long meters){
		NumberFormat format = DecimalFormat.getInstance();
		
		return format.format(meters/1000 + "Km");
	}
}
