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
	public Double area() {
		return 4 * Math.PI * Math.pow(super.X, 2);
	}
	
}
