/**
 * 
 */
package com.dtcc.csc.jrparks.final_project;


/**
 * @author jrparks
 * 
 */
public class Main {
	private static Game game;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		game = new Game("SOMEWHERE OVER THE RAINBOW", "Song");
		game.addPlayer(new Player("Bob Jones"));
		System.out.println(game.getRevealedPuzzle());
		for(char c : "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()){
			game.drawGame();
			game.guessLetter(c);
		}
	}
	
}
