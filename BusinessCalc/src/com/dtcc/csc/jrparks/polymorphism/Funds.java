/**
 * 
 */
package com.dtcc.csc.jrparks.polymorphism;

/**
 * @author jrparks
 * 
 */
public class Funds {
	protected Double	principleAmount;
	
	/**
	 * @return the principleAmount
	 */
	public Double getPrincipleAmount() {
		return principleAmount;
	}
	
	/**
	 * @param principleAmount
	 *            the principleAmount to set
	 */
	public void setPrincipleAmount(Double principleAmount) {
		this.principleAmount = principleAmount;
	}
	
	public Funds() {
		this.setPrincipleAmount(0D);
	}
	
	public Funds(Double principleAmount) {
		this.setPrincipleAmount(principleAmount);
	}
}
