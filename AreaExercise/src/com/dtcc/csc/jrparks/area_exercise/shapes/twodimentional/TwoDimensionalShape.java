/**
 * 
 */
package com.dtcc.csc.jrparks.area_exercise.shapes.twodimentional;

import com.dtcc.csc.jrparks.area_exercise.shapes.Shape;

/**
 * @author jrparks
 * 
 */
public abstract class TwoDimensionalShape implements Shape {
	protected Double L, W;

	public Double[] getDimentions() {
		return new Double[] { this.L, this.W, };
	}

	public void setDimentions(Double... dimentions) {
		this.L = dimentions[0];
		this.W = dimentions[1];
	}

	public String[] getDimentionQuestions() {
		return new String[] { "Dimention L: ", "Dimention W: ", };
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
}
