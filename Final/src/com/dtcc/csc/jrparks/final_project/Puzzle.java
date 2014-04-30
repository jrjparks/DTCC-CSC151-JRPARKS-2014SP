/**
 * 
 */
package com.dtcc.csc.jrparks.final_project;

/**
 * @author jrparks
 *
 */
public class Puzzle {
	private String puzzle, hint;
	
	public Puzzle(String puzzle, String hint){
		this.setPuzzle(puzzle);
		this.setHint(hint);
	}

	/**
	 * @return the puzzle
	 */
	public String getPuzzle() {
		return puzzle;
	}

	/**
	 * @param puzzle the puzzle to set
	 */
	public void setPuzzle(String puzzle) {
		this.puzzle = puzzle.toUpperCase();
	}

	/**
	 * @return the hint
	 */
	public String getHint() {
		return hint;
	}

	/**
	 * @param hint the hint to set
	 */
	public void setHint(String hint) {
		this.hint = hint;
	}
}
