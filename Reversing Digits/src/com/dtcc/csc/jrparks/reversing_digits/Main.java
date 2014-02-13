/**
 * 
 */
package com.dtcc.csc.jrparks.reversing_digits;

import java.util.Scanner;

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
		System.out.println("Reversing Digits");
		Scanner scanner = new Scanner(System.in);
		Integer value = 0;
		do {
			System.out.print("Number to Reverse (-1 exits): ");
			if (scanner.hasNextInt()) System.out.printf("\t%d\n", reverse(value = scanner.nextInt()));
			else scanner.next();
		} while (value != -1);
		scanner.close();
	}
	
	public static Integer reverse(Integer value) {
		Integer num = value, rev = 0;
		while (num != 0) {
			rev *= 10;
			rev += num % 10;
			num /= 10;
		}
		return rev;
	}
}
