/**
 * 
 */
package com.dtcc.csc.jrparks.polymorphism;

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
		System.out.println("Polymorphism - BusinessCalc");
		
		Scanner scanner = new Scanner(System.in);
		Double principleAmount = readDouble(scanner, "Input principle amount");
		Double rate = readDouble(scanner, "Input rate");
		Double yearCount = readDouble(scanner, "Number of years");
		
		Guarantee g = new Guarantee(principleAmount);
		g.setData(rate, yearCount);
		CompoundInterest ci = new CompoundInterest(principleAmount);
		ci.setData(rate, yearCount);
		Loan l = new Loan(principleAmount);
		l.setData(rate, yearCount);
		
		System.out.printf("With a principle amount of $%.2f , an interest rate of %.2f, and %.2f years:\n", principleAmount, rate, yearCount);
		System.out.printf("\tGuarantee:\t\t$%.2f\n", g.getData());
		System.out.printf("\tCompound Interest:\t$%.2f\n", ci.getData());
		System.out.printf("\tLoan:\t\t\t$%.2f\n", l.getData());
	}
	
	/**
	 * 
	 * @param input
	 *            - BufferedReader for input
	 * @return
	 */
	public static Double readDouble(Scanner scanner, String text) {
		Double n = null;
		while (n == null) {
			try {
				System.out.printf("%s: ", text);
				n = scanner.nextDouble();
			} catch (Exception ioex) {
				System.out.println("You did not enter a number.\nPlease try again.");
			}
		}
		return n;
	}
}
