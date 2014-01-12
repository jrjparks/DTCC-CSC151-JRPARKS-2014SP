package com.dtcc.csc.jrparks.comparing_integers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author jrparks
 * @version 1
 * 
 */
public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("DTCC CSC 151 450 SP14 - JRParks");
		System.out.println("Comparing Integers");
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Integer n1 = readInteger(input), n2 = readInteger(input);
		System.out.println(compair(n1, n2));
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
	 * @param n1
	 *            - First Number
	 * @param n2
	 *            - Second Number
	 * @return
	 */
	public static String compair(Integer n1, Integer n2) {
		if (n1 == n2) return "The numbers are equal.";
		else return String.format("%d is larger.", n1 > n2 ? n1 : n2);
	}
}