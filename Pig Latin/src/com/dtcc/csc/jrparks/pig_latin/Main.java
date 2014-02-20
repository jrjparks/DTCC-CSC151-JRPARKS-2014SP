package com.dtcc.csc.jrparks.pig_latin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("DTCC CSC 151 450 SP14 - JRParks");
		System.out.println(PigLatin.pigLatinize("Pig Latin"));

		Scanner scanner = new Scanner(System.in);
		String sentence = "";
		do {
			System.out.print("Your sentence(quit or exit to stop): ");
			sentence = scanner.nextLine();

			System.out.print("Igpay Atinlay: ");
			System.out.println(PigLatin.pigLatinize(sentence));
		} while (!sentence.toLowerCase().startsWith("exit")
				&& !sentence.toLowerCase().startsWith("quit")
				&& !sentence.toLowerCase().startsWith("stop"));
		scanner.close();
	}

}
