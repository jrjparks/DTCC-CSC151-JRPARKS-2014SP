/**
 * 
 */
package com.dtcc.csc.jrparks.final_project;

import java.util.Random;

/**
 * @author jrparks
 * 
 */
public class GameWheel {
	private final int[]	wheelValues	= { 100, 300, 500, 700, 900, 2000, 3000, 5000, -1000, 0 };
	private Random		rand;
	
	public GameWheel() {
		this.rand = new Random();
	}
	
	public int spin() {
		return this.wheelValues[this.rand.nextInt(this.wheelValues.length)];
	}
}
