/**
 * 
 */
package com.dtcc.csc.jrparks.final_project;

/**
 * @author jrparks
 * 
 */
public class Player {
	private int		winnings;
	private String	name;
	
	public Player(String name) {
		this.setWinnings(0);
		this.setName(name);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the winnings
	 */
	public int getWinnings() {
		return winnings;
	}

	/**
	 * @param winnings the winnings to set
	 */
	public void setWinnings(int winnings) {
		this.winnings = winnings;
	}
}
