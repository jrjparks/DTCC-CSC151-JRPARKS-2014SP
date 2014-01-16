package com.dtcc.csc.jrparks.area_exercise.shapes.twodimentional;

/**
 * @author jrparks
 * 
 */
public class SquareShape extends RectangleShape {
	@Override
	public void setDimentions(Double... dimentions) {
		this.L = dimentions[0];
		this.W = dimentions[0];
	}

	@Override
	public String[] getDimentionQuestions() {
		return new String[] { "Side: ", };
	}
}
