/**
 * 
 */
package com.dtcc.csc.jrparks.final_project;

/**
 * @author jrparks
 * 
 */
public class Main {
	private static final Game	game	= new Game();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		game.addPuzzles(new Puzzle("SOMEWHERE OVER THE RAINBOW", "Movie Song - The Wizard of Oz"));
		game.addPuzzles(new Puzzle("WHERE THE WILD THINGS ARE", "Book Title - Maurice Sendak"));
		game.addPuzzles(new Puzzle("A CHARLIE BROWN THANKSGIVING", "Movie Title - Thanksgiving Cartoon"));
		game.addPuzzles(new Puzzle("A PENNY SAVED IS A PENNY EARNED", "Phrase"));
		game.addPuzzles(new Puzzle("ALL ROADS LEAD TO ROME", "Phrase"));
		
		game.addPlayers(new Player("Player 1"));
		game.addPlayers(new Player("Player 2"));
		game.addPlayers(new Player("Player 3"));
		while (!game.getQuit()) {
			game.generateNewPuzzle();
			while (!game.getQuit() && !game.getSolved()) {
				game.drawGame();
				game.queryPlayer();
			}
		}
		System.out.print("Thanks for playing the Wheel of Fortune");
	}
}
