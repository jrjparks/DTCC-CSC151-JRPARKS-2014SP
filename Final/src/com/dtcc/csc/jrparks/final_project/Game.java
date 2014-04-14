/**
 * 
 */
package com.dtcc.csc.jrparks.final_project;

import java.io.Console;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jrparks
 * 
 */
public class Game {
	private static final String	ALPHABET	= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String				puzzle, puzzleHint, revealedPuzzle;
	private char[]				guessableLetters, guessedLetters;
	private List<Player> players;
	private int currentPlayerIndex;
	
	public Game(String puzzle, String puzzleHint) {
		guessableLetters = ALPHABET.toCharArray();
		guessedLetters = new char[guessableLetters.length];
		Arrays.fill(guessedLetters, '\0');
		this.puzzle = puzzle.toUpperCase();
		this.puzzleHint = puzzleHint;
		this.revealedPuzzle = "";
		players = new LinkedList<Player>();
		currentPlayerIndex = 0;
	}
	
	/**
	 * @return the revealedPuzzle
	 */
	public String getRevealedPuzzle() {
		return generateRevealedPuzzle();
	}
	
	public void addPlayer(Player player){
		players.add(player);
	}
	
	public Player currentPlayer(){
		return players.get(currentPlayerIndex);
	}
	
	public void drawGame(){
		System.out.println("Welcome to the Wheel of Fortune");
		System.out.println();
		System.out.printf("Available Letters: %s\n", getAvailableLetters());
		System.out.println();
		System.out.printf("Puzzle: (%s)\n", puzzleHint);
		System.out.printf("\t%s", getRevealedPuzzle());
		System.out.println();
		System.out.println();
		System.out.printf("Player %s - would you like to Spin (1) or Guess (2) the puzzle?\n", currentPlayer().getName());
		System.out.println();
		System.out.println();
	}
	
	public String getAvailableLetters() {
		String availableLetters = new String(guessableLetters);
		for (char c : guessedLetters) {
			availableLetters = availableLetters.replace(c, '_');
		}
		return availableLetters;
	}
	
	private String generateRevealedPuzzle() {
		revealedPuzzle = "";
		String[] puzzleWords = puzzle.split(" ");
		for (String puzzleWord : puzzleWords) {
			for (char c : puzzleWord.toCharArray()) {
				if (new String(guessedLetters).indexOf(c) >= 0) revealedPuzzle += c;
				else revealedPuzzle += "_";
			}
			revealedPuzzle += " ";
		}
		revealedPuzzle.trim();
		return revealedPuzzle;
	}
	
	public String guessLetter(char c) {
		c = Character.toUpperCase(c);
		int index = new String(guessableLetters).indexOf(c);
		if (!Arrays.asList(guessedLetters).contains(c)) {
			guessedLetters[index] = guessableLetters[index];
		}
		return getRevealedPuzzle();
	}
	
	public Boolean solvePuzzle(String guess) {
		return guess.equalsIgnoreCase(puzzle);
	}
}
