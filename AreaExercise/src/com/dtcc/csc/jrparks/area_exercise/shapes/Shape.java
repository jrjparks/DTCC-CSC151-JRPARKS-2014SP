/**
 * 
 */
package com.dtcc.csc.jrparks.area_exercise.shapes;

/**
 * @author jrparks
 * 
 */
public interface Shape {
	Double area();

	Double[] getDimentions();

	void setDimentions(Double... dimentions);

	String[] getDimentionQuestions();
}
