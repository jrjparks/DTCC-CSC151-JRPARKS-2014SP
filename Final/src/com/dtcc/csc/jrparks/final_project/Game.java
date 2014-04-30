/**
 * 
 */
package com.dtcc.csc.jrparks.final_project;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author jrparks
 * 
 */
public class Game {
	private static final String	ALPHABET	= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final Random	rand		= new Random();
	private Scanner				inputScanner;
	private List<Puzzle>		puzzles;
	private String				revealedPuzzle;
	private Boolean				solved, quit, incorrectGuess;
	private char[]				guessableLetters, guessedLetters;
	private List<Player>		players;
	private int					currentPlayerIndex, currentPuzzleIndex;
	private GameWheel			wheel;
	
	/**
	 * Game constructor
	 */
	public Game() {
		this.guessableLetters = ALPHABET.toCharArray();
		this.guessedLetters = new char[guessableLetters.length];
		this.puzzles = new LinkedList<Puzzle>();
		this.revealedPuzzle = "";
		this.solved = this.quit = this.incorrectGuess = false;
		this.players = new LinkedList<Player>();
		this.currentPlayerIndex = this.currentPuzzleIndex = 0;
		
		this.wheel = new GameWheel();
		this.inputScanner = new Scanner(System.in);
		
		generateNewPuzzle();
	}
	
	/**
	 * @return the revealedPuzzle
	 */
	public String getRevealedPuzzle() {
		return generateRevealedPuzzle();
	}
	
	/**
	 * @return whether the puzzle is solved
	 */
	public Boolean getSolved() {
		return this.solved;
	}
	
	/**
	 * @return whether to quit the game
	 */
	public Boolean getQuit() {
		return this.quit;
	}
	
	/**
	 * Add a new puzzle(s) to the game.
	 * @param puzzles
	 */
	public void addPuzzles(Puzzle... puzzles) {
		for (Puzzle puzzle : puzzles)
			this.puzzles.add(puzzle);
		generateNewPuzzle();
	}
	
	/**
	 * Retrieve the current puzzle.
	 * @return Current Puzzle
	 */
	public Puzzle currentPuzzle() {
		return this.puzzles.get(this.currentPuzzleIndex);
	}
	
	/**
	 * Reset game and generate new puzzle.
	 */
	public void generateNewPuzzle() {
		int prevPuzzle = this.currentPuzzleIndex;
		if (this.puzzles.isEmpty()) this.currentPuzzleIndex = 0;
		else do { // Prevent repeat puzzles
			this.currentPuzzleIndex = rand.nextInt(this.puzzles.size());
		} while (prevPuzzle == this.currentPuzzleIndex);
		// Reset game
		this.solved = false;
		// Empty guessed letters
		this.guessedLetters = new char[guessableLetters.length];
	}
	
	/**
	 * Add a new player(s) to the game.
	 * @param players
	 */
	public void addPlayers(Player... players) {
		for (Player player : players)
			this.players.add(player);
	}
	
	/**
	 * Retrieve the current player.
	 * @return Current player.
	 */
	public Player currentPlayer() {
		return this.players.get(this.currentPlayerIndex);
	}
	
	/**
	 * Draw the game screen
	 */
	public void drawGame() {
		for (int i = 0; i < 8; ++i)
			System.out.println();
		
		System.out.println("Welcome to the Wheel of Fortune");
		System.out.println();
		for (Player player : this.players) {
			System.out.printf("%s\t", player.getName());
		}
		System.out.println();
		for (Player player : this.players) {
			System.out.printf("$%10d\t", player.getWinnings());
		}
		System.out.println();
		System.out.printf("Available Letters: %s\n", getAvailableLetters());
		System.out.println();
		System.out.printf("Puzzle: (%s)\n", this.currentPuzzle().getHint());
		System.out.printf("\t%s\n", getRevealedPuzzle());
		System.out.println();
		
		if (this.incorrectGuess) {
			this.incorrectGuess = false;
			System.out.println("The puzzel guess was incorrect.");
			System.out.println();
		}
		
		System.out.printf("Player %s - would you like to Spin (1) or Guess (2) the puzzle?\n", currentPlayer().getName());
		System.out.print("Action (q to quit): ");
	}
	
	/**
	 * Ask the current player for action
	 */
	public void queryPlayer() {
		String action = this.inputScanner.next();
		this.inputScanner.nextLine();
		switch (action) {
			default:
				break;
			
			case "1":
			case "s":
			case "spin":
				int spinPrize = this.spinWheel();
				System.out.printf("You landed on $%d.\n", spinPrize);
				if (spinPrize <= 0) {
					this.currentPlayer().setWinnings(this.currentPlayer().getWinnings() + spinPrize);
					System.out.println("You have lost your turn.");
					++this.currentPlayerIndex;
				} else {
					Object[] letterData = this.guessLetter();
					if ((int) letterData[1] > 0) {
						if ((int) letterData[1] > 1) System.out.printf("There are %d %s's in the puzzle.\n", (int) letterData[1], letterData[0]);
						else System.out.printf("There is %d %s in the puzzle.\n", (int) letterData[1], letterData[0]);
						this.currentPlayer().setWinnings(this.currentPlayer().getWinnings() + (spinPrize * (int) letterData[1]));
					} else {
						System.out.printf("I'm sorry but the letter '%s' is not in the puzzle.\n", letterData[0]);
						++this.currentPlayerIndex;
					}
				}
				sleep(5 * 1000);
				break;
			
			case "2":
			case "g":
			case "guess":
				if (this.querySolve()) {
					System.out.println("The puzzel guess was correct.");
					System.out.printf("Player %s has won the current round.\n", currentPlayer().getName());
				} else {
					System.out.println("The puzzel guess was incorrect.");
				}
				++this.currentPlayerIndex;
				sleep(5 * 1000);
				break;
			
			case "q":
			case "quit":
			case "exit":
			case "stop":
				this.quit = true;
				break;
		}
		if (this.currentPlayerIndex >= this.players.size()) this.currentPlayerIndex = 0;
	}
	
	/**
	 * Ask the current player for a letter
	 * @return [letter, count]
	 */
	public Object[] guessLetter() {
		char letter;
		do {
			System.out.print("Please guess a letter: ");
			letter = this.inputScanner.next().toUpperCase().charAt(0);
		} while (Arrays.asList(this.guessedLetters).contains(letter));
		this.inputScanner.nextLine();
		return new Object[] { letter, this.guessLetter(letter) };
	}
	
	/**
	 * Try for game solve
	 * @return whether puzzle was solved
	 */
	public Boolean querySolve() {
		System.out.print("Please guess the puzzle: ");
		String guess = "";
		guess = this.inputScanner.nextLine();
		return this.solvePuzzle(guess);
	}
	
	/**
	 * Return available letter choices
	 * @return String of letters
	 */
	public String getAvailableLetters() {
		String availableLetters = new String(guessableLetters);
		for (char c : guessedLetters) {
			availableLetters = availableLetters.replace(c, '_');
		}
		return availableLetters;
	}
	
	/**
	 * Get revealed puzzle
	 * @return revealed puzzle
	 */
	private String generateRevealedPuzzle() {
		this.revealedPuzzle = "";
		if (!this.solved) {
			String[] puzzleWords = this.currentPuzzle().getPuzzle().split(" ");
			for (String puzzleWord : puzzleWords) {
				for (char c : puzzleWord.toCharArray()) {
					if (new String(guessedLetters).indexOf(c) >= 0) this.revealedPuzzle += c;
					else this.revealedPuzzle += "_";
				}
				this.revealedPuzzle += " ";
			}
			this.revealedPuzzle.trim();
		} else {
			this.revealedPuzzle = this.currentPuzzle().getPuzzle();
		}
		return this.revealedPuzzle;
	}
	
	
	/**
	 * Guess letter
	 * @param c - Letter to guess
	 * @return letter count
	 */
	public int guessLetter(char c) {
		c = Character.toUpperCase(c);
		int index = new String(guessableLetters).indexOf(c);
		if (!Arrays.asList(guessedLetters).contains(c)) {
			guessedLetters[index] = guessableLetters[index];
		}
		int count = 0;
		for (char _c : this.currentPuzzle().getPuzzle().toCharArray()) {
			if (_c == c) {
				++count;
			}
		}
		return count;
	}
	
	/**
	 * Solve puzzle
	 * @param guess - Puzzle guess
	 * @return whether guess was correct
	 */
	public Boolean solvePuzzle(String guess) {
		Boolean solve = guess.equalsIgnoreCase(this.currentPuzzle().getPuzzle());
		this.solved = solve;
		return solve;
	}
	
	/**
	 * Spin the wheel
	 * @return wheel value
	 */
	public int spinWheel() {
		return this.wheel.spin();
	}
	
	/**
	 * Sleep
	 * @param millis
	 */
	protected void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
