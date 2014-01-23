/**
 * 
 */
package com.dtcc.csc.jrparks.polymorphism;

/**
 * @author jrparks
 * 
 */
public class CompoundInterest extends Funds implements FundsInterface {
	private Double	rate, yearCount;
	
	/**
	 * 
	 */
	public CompoundInterest() {
		super();
	}
	
	/**
	 * @param principleAmount
	 */
	public CompoundInterest(Double principleAmount) {
		super(principleAmount);
	}
	
	@Override
	public Double getData() {
		return this.principleAmount * Math.pow((1 + this.rate), this.yearCount);
	}
	
	@Override
	public void setData(Double rate, Double yearCount) {
		this.rate = rate;
		this.yearCount = yearCount;
	}
	
}
