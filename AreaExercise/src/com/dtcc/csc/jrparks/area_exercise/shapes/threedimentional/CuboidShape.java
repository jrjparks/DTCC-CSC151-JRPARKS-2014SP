/**
 * 
 */
package com.dtcc.csc.jrparks.area_exercise.shapes.threedimentional;

/**
 * @author jrparks
 * 
 */
public class CuboidShape extends ThreeDinmensionalShape {
	@Override
	public Double area() {
		return (2 * (super.L * super.W)) + (2 * (super.L * super.D))
				+ (2 * (super.W * super.D));
	}

}
