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
	protected Double	X, Y, Z;
	
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
	
	public Double getZ() {
		return Z;
	}
	
	public void setZ(Double z) {
		this.Z = z;
	}
}
