/**
 * 
 */
package com.dtcc.csc.jrparks.area_exercise.shapes.threedimentional;

import com.dtcc.csc.jrparks.area_exercise.shapes.Shape;

/**
 * @author jrparks
 * 
 */
public abstract class ThreeDinmensionalShape implements Shape {
	protected Double L, W, D;

	public Double[] getDimentions() {
		return new Double[] { this.L, this.W, this.D };
	}

	public void setDimentions(Double... dimentions) {
		this.L = dimentions[0];
		this.W = dimentions[1];
		this.D = dimentions[2];
	}

	public String[] getDimentionQuestions() {
		return new String[] { "Dimention L: ", "Dimention W: ",
				"Dimention D: ", };
	}

	public Double getL() {
		return L;
	}

	public void setL(Double l) {
		this.L = l;
	}

	public Double getW() {
		return W;
	}

	public void setW(Double w) {
		this.W = w;
	}

	public Double getZ() {
		return D;
	}

	public void setD(Double d) {
		this.D = d;
	}
}
