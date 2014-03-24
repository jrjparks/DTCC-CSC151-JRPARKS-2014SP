/**
 * 
 */
package com.dtcc.csc.jrparks.savings_account_class;

import java.util.LinkedList;

/**
 * @author jrparks
 * 
 */
public class Main {
	
	/**
	 * @param args
	 */
	public static LinkedList<SavingsAccount>	savingsAccounts		= new LinkedList<SavingsAccount>();
	public static Double						annualInterestRate	= 0D;
	
	public static void main(String[] args) {
		System.out.println("DTCC CSCl 151 450 SP14 - JRParks");
		System.out.println("Savings Account Class");
		System.out.println();
		
		modifyIntrestRate(0.04);
		savingsAccounts.add(new SavingsAccount(2000.00, annualInterestRate));
		savingsAccounts.add(new SavingsAccount(3000.00, annualInterestRate));
		
		printYear(0.04);
		printYear(0.05);
	}
	
	public static void printYear(Double annualInterestRate) {
		modifyIntrestRate(annualInterestRate);
		System.out.print("Interest at ");
		System.out.print(annualInterestRate * 100D);
		System.out.print("%\n\t");
		for (Integer saver = 1; saver <= savingsAccounts.size(); ++saver)
			System.out.printf("\tSaver %d\t", saver);
		System.out.println();
		for (Integer month = 1; month <= 12; ++month) {
			System.out.printf("Month %02d", month);
			for (SavingsAccount sa : savingsAccounts)
				System.out.printf("\t$%,.2f", sa.calculateMonthlyInterest());
			System.out.println();
		}
	}
	
	public static void modifyIntrestRate(Double annualInterestRate) {
		Main.annualInterestRate = annualInterestRate;
		for (SavingsAccount sa : savingsAccounts)
			sa.setAnnualInterestRate(annualInterestRate);
	}
}