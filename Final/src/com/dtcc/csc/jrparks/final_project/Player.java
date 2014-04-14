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
		this.winnings = 0;
		this.setName(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
