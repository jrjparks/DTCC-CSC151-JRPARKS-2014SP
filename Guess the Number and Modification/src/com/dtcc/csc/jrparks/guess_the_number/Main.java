/**
 * 
 */
package com.dtcc.csc.jrparks.guess_the_number;

import java.util.Scanner;

import com.dtcc.csc.jrparks.guess_the_number.Guess_The_Number.GuessResponse;
import com.dtcc.csc.jrparks.guess_the_number.Guess_The_Number_Modified.ModifiedGuessResponse;

/**
 * @author jrparks
 * 
 */
public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("DTCC CSC 151 450 SP14 - JRParks");
		switch (menu(scanner, new String[] { "Guess the Number", "Guess the Number Modified" })) {
			default:
			case 1:
				System.out.println("Guess the Number");
				Guess_The_Number gtn = new Guess_The_Number();
				GuessResponse response = null;
				do {
					System.out.print("Guess: ");
					if (scanner.hasNextInt()) System.out.println(response = gtn.guess(scanner.nextInt()));
					else {
						scanner.next();
						System.out.println("You need to guess a NUMBER");
					}
				} while (response != GuessResponse.Success);
				break;
			case 2:
				System.out.println("Guess the Number Modified");
				Guess_The_Number_Modified gtnm = new Guess_The_Number_Modified();
				ModifiedGuessResponse modified_response = null;
				do {
					System.out.printf("Guesses Remaining: %d\n", gtnm.getGuessCount());
					System.out.print("Guess: ");
					if (scanner.hasNextInt()) System.out.println(modified_response = gtnm.guess(scanner.nextInt()));
					else {
						scanner.next();
						System.out.println("You need to guess a NUMBER");
					}
				} while (modified_response != ModifiedGuessResponse.Success || modified_response != ModifiedGuessResponse.Fail);
				break;
		}
	}
	
	public static Integer menu(Scanner scanner, String... options) {
		System.out.println("Would you like to play a game?");
		for (Integer o = 0; o < options.length; ++o)
			System.out.printf("\t(%d) %s\n", o + 1, options[o]);
		System.out.print("Option: ");
		if (scanner.hasNextInt()) {
			Integer n = scanner.nextInt();
			if (0 < n && n <= options.length) return n;
		} else scanner.next();
		return menu(scanner);
	}
}
