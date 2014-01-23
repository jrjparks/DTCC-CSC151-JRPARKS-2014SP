/**
 * 
 */
package com.dtcc.csc.jrparks.polymorphism;

/**
 * @author jrparks
 * 
 */
public class Loan extends Funds implements FundsInterface {
	private Double	rate, yearCount;
	
	/**
	 * 
	 */
	public Loan() {
		super();
	}
	
	/**
	 * @param principleAmount
	 */
	public Loan(Double principleAmount) {
		super(principleAmount);
	}
	
	@Override
	public Double getData() {
		return (this.principleAmount * this.rate * this.yearCount) + this.principleAmount;
	}
	
	@Override
	public void setData(Double rate, Double yearCount) {
		this.rate = rate;
		this.yearCount = yearCount;
	}
	
}
