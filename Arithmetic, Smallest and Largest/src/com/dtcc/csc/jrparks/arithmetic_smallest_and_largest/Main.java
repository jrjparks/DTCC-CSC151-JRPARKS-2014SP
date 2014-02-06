/**
 * 
 */
package com.dtcc.csc.jrparks.arithmetic_smallest_and_largest;

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
		System.out.println("Arithmetic, Smallest and Largest");
		
		Scanner input = new Scanner(System.in);
		Integer n1 = readInteger(input), n2 = readInteger(input), n3 = readInteger(input);
		Integer[] asw = doMaths(n1, n2, n3);
		System.out.printf("Sum: %d\n", asw[0]);
		System.out.printf("Average: %d\n", asw[1]);
		System.out.printf("Product: %d\n", asw[2]);
		System.out.printf("Smallest: %d\n", asw[3]);
		System.out.printf("Largest: %d\n", asw[4]);
	}
	
	/**
	 * 
	 * @param input
	 *            - Scanner for input
	 * @return
	 */
	public static Integer readInteger(Scanner input) {
		Integer n = null;
		while (n == null) {
			System.out.print("Enter an integer:");
			if (input.hasNextInt()) n = input.nextInt();
			else {
				System.out.println("You did not enter a number.\nPlease try again.");
				input.next();
			}
		}
		return n;
	}
	
	/**
	 * 
	 * @param ns
	 *            - Numbers to do maths on
	 * @return Integer array { sum, avg, prod, sm, lg }
	 */
	public static Integer[] doMaths(Integer... ns) {
		Integer sum = 0, avg = 0, prod = 1, sm = Integer.MAX_VALUE, lg = Integer.MIN_VALUE;
		for (Integer n : ns) {
			sum += n;
			prod *= n;
			sm = n < sm ? n : sm;
			lg = n > lg ? n : lg;
		}
		avg = sum / ns.length;
		return new Integer[] { sum, avg, prod, sm, lg };
	}
}
