/**
 * 
 */
package com.dtcc.csc.jrparks.area_exercise;

/**
 * @author jrparks
 * 
 */
public final class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AreaExercise ae = new AreaExercise();
		Integer selection = ae.MainMenu();
		System.out.println(ae.getSelection(selection));
	}
	
}
