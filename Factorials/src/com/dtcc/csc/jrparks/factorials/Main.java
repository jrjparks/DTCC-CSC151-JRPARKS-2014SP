/**
 * 
 */
package com.dtcc.csc.jrparks.factorials;

/**
 * @author jrparks
 * 
 */
public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("DTCC CSC 151 450 SP14 - JRParks");
		System.out.println("Factorials");
		
		System.out.println("Number\t\tFactor");
		for (Integer number = 0; number <= 20; ++number)
			System.out.printf("%d\t\t%d\n", number, factorial(number.longValue()));
	}
	
	public static Long factorial(Long number) {
		if (number == 0) return 1L;
		return number * factorial(number - 1);
	}
}
