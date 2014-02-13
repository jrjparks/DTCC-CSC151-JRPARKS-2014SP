/**
 * 
 */
package com.dtcc.csc.jrparks.guess_the_number;

import java.util.Random;

/**
 * @author jrparks
 * 
 */
public class Guess_The_Number {
	public enum GuessResponse {
		Low("Too low. Try Again."), Success("Spot on."), High("Too High. Try Again.");
		
		private String	value;
		
		private GuessResponse(String value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return this.value;
		}
	}
	
	protected Integer	number;
	
	public Guess_The_Number() {
		number = new Random().nextInt(999) + 1;
	}
	
	public GuessResponse guess(Integer guess) {
		if (guess < number) return GuessResponse.Low;
		else if (guess > number) return GuessResponse.High;
		return GuessResponse.Success;
	}
}
