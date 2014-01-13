/**
 * 
 */
package com.dtcc.csc.jrparks.factorials;

import java.io.BufferedReader;

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
	
	/**
	 * 
	 * @param input
	 *            - BufferedReader for input
	 * @return
	 */
	public static Integer readInteger(BufferedReader input) {
		Integer n = null;
		while (n == null) {
			try {
				System.out.print("Enter an integer:");
				n = Integer.parseInt(input.readLine());
			} catch (Exception ioex) {
				System.out.println("You did not enter a number.\nPlease try again.");
			}
		}
		return n;
	}
	
	public static Long factorial(Long number) {
		if (number == 0) return 1L;
		return number * factorial(number - 1);
	}
}
