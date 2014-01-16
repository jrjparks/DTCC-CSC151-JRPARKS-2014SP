/**
 * 
 */
package com.dtcc.csc.jrparks.area_exercise.shapes.threedimentional;

/**
 * @author jrparks
 * 
 */
public final class CuboidShape extends ThreeDinmensionalShape {
	@Override
	public Double area() {
		return (2 * (super.X * super.Y)) + (2 * (super.X * super.Z)) + (2 * (super.Y * super.Z));
	}
	
}
