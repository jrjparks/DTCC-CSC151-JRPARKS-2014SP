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
	protected Double	X, Y;
	
	public Double getX() {
		return X;
	}
	
	public void setX(Double x) {
		this.X = x;
	}
	
	public Double getY() {
		return Y;
	}
	
	public void setY(Double y) {
		this.Y = y;
	}
}
