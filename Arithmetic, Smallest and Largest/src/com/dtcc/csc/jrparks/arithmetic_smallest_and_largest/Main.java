/**
 * 
 */
package com.dtcc.csc.jrparks.arithmetic_smallest_and_largest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
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
