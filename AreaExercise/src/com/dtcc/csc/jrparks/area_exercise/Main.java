/**
 * 
 */
package com.dtcc.csc.jrparks.area_exercise;

import com.dtcc.csc.jrparks.area_exercise.shapes.Shape;

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
		do {
			Integer selection = ae.MainMenu();
			if (selection == -1)
				return;
			Shape shape = ae.getShape(selection);
			Double[] dimentions = new Double[shape.getDimentions().length];
			Integer dIndex = 0;
			for (String question : shape.getDimentionQuestions())
				dimentions[dIndex++] = ae.askQuestion(question);
			shape.setDimentions(dimentions);
			System.out.printf("Area: %.2f\n", shape.area());
		} while (true);
	}

}
