/**
 * 
 */
package com.dtcc.csc.jrparks.guess_the_number;

import java.util.Random;

/**
 * @author jrparks
 * 
 */
public class Guess_The_Number_Modified {
	public enum ModifiedGuessResponse {
		Low("Too low. Try Again."), High("Too High. Try Again."), Success("Aha! You know the secret!"), Fail("You should be able to do better!");
		
		private String	value;
		
		private ModifiedGuessResponse(String value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return this.value;
		}
	}
	
	protected Integer	number;
	protected Integer	guessCount;
	
	public Guess_The_Number_Modified() {
		number = new Random().nextInt(999) + 1;
		guessCount = 10;
	}
	
	public ModifiedGuessResponse guess(Integer guess) {
		--guessCount;
		if (guess < number) return ModifiedGuessResponse.Low;
		else if (guess > number) return ModifiedGuessResponse.High;
		else if (guessCount > 0) return ModifiedGuessResponse.Success;
		return ModifiedGuessResponse.Fail;
	}
	
	public Integer getGuessCount() {
		return guessCount;
	}
}
