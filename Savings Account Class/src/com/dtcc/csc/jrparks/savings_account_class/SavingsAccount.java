/**
 * 
 */
package com.dtcc.csc.jrparks.savings_account_class;

/**
 * @author jrparks
 *
 */
public class SavingsAccount {
	private Double savingsBalance, annualInterestRate;
	
	public SavingsAccount(){
		this(0D, 0D);
	}
	
	public SavingsAccount(Double savingsBalance, Double annualInterestRate){
		setSavingsBalance(savingsBalance);
		setAnnualInterestRate(annualInterestRate);
	}
	
	public Double calculateMonthlyInterest(){
		Double increase = (getSavingsBalance() * getAnnualInterestRate()) / 12;
		setSavingsBalance(getSavingsBalance() + increase);
		return getSavingsBalance();
	}

	/**
	 * @return the savingsBalance
	 */
	public Double getSavingsBalance() {
		return savingsBalance;
	}

	/**
	 * @param savingsBalance the savingsBalance to set
	 */
	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	/**
	 * @return the annualInterestRate
	 */
	public Double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * @param annualInterestRate the annualInterestRate to set
	 */
	public void setAnnualInterestRate(Double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	} 
}
