/**
 * 
 */
package com.dtcc.csc.jrparks.area_exercise.shapes.threedimentional;

/**
 * @author jrparks
 * 
 */
public final class SphereShape extends ThreeDinmensionalShape {
	@Override
	public void setDimentions(Double... dimentions) {
		this.L = dimentions[0];
		this.W = dimentions[0];
		this.D = dimentions[0];
	}

	@Override
	public Double area() {
		return 4 * Math.PI * Math.pow(super.L, 2);
	}

	@Override
	public String[] getDimentionQuestions() {
		return new String[] { "Radius: ", };
	}
}
