/**
 * 
 */
package com.dtcc.csc.jrparks.area_exercise.shapes.twodimentional;

/**
 * @author jrparks
 * 
 */
public final class EllipseShape extends TwoDimensionalShape {
	@Override
	public Double area() {
		return Math.PI * super.X * super.Y;
	}
}
