package com.dtcc.csc.jrparks.credit_limit_calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, Double> questions = new HashMap<String, Double>();
		questions.put("Account Number", -1D);
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		do {
			System.out.println("DTCC CSC 151 450 SP14 - JRParks");
			System.out.println("Credit Limit Calculator");
			System.out.println();

			Integer accountNumber = askForNumber(scanner,
					"Account Number(-1 to exit)").intValue();
			run = accountNumber != -1;
			if (!run)
				break;

			UserInfo userInfo = new UserInfo(accountNumber);
			userInfo.setInitBalance(askForNumber(scanner, "Initial Balance"));
			userInfo.setTotalItemCharges(askForNumber(scanner,
					"Total Items Charged"));
			userInfo.setTotalCreditForMonth(askForNumber(scanner,
					"Total Credit for Month"));
			userInfo.setAllowedCredit(askForNumber(scanner,
					"Allowed Credit for Month"));

			System.out.print("Calculating User Balance...");
			userInfo.calculate();
			System.out.println("DONE!");
			System.out.printf("User Information Entered:\n%s\n",
					userInfo.toString());
			System.out.printf("Credit Limit has %sbeen Exceeded\n",
					userInfo.isBalanceValid() ? "not " : "");

		} while (run);
		System.out.println("Goodbye");
	}

	private static Double askForNumber(Scanner scanner, String question) {
		Double val = null;
		do {
			System.out.printf("%s: ", question);
			if (scanner.hasNextDouble())
				val = scanner.nextDouble();
			else
				scanner.next();
		} while (val == null);
		return val;
	}
}
