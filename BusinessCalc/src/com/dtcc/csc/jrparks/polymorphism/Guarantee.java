/**
 * 
 */
package com.dtcc.csc.jrparks.polymorphism;

/**
 * @author jrparks
 * 
 */
public class Guarantee extends Funds implements FundsInterface {
	private Double	rate, yearCount;
	
	/**
	 * 
	 */
	public Guarantee() {
		super();
	}
	
	/**
	 * @param principleAmount
	 */
	public Guarantee(Double principleAmount) {
		super(principleAmount);
	}
	
	@Override
	public Double getData() {
		return this.principleAmount * this.rate * this.yearCount;
	}
	
	@Override
	public void setData(Double rate, Double yearCount) {
		this.rate = rate;
		this.yearCount = yearCount;
	}
	
}
