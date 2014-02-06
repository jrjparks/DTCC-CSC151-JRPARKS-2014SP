/**
 * 
 */
package com.dtcc.csc.jrparks.credit_limit_calculator;

/**
 * @author jrparks
 * 
 */
public class UserInfo {
	private Integer accountNumber;
	private Double initBalance;
	private Double balance;
	private Double totalItemCharges;
	private Double totalCreditForMonth;
	private Double allowedCredit;

	public UserInfo() {
	}

	public UserInfo(Integer accountNumber) {
		this.setAccountNumber(accountNumber);
	}

	public Double calculate() {
		this.setBalance((this.getInitBalance() + this.getTotalItemCharges())
				- this.getTotalCreditForMonth());
		return this.getBalance();
	}

	public boolean isBalanceValid() {
		return this.getBalance() <= this.getAllowedCredit();
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getInitBalance() {
		return initBalance;
	}

	public void setInitBalance(Double initBalance) {
		this.initBalance = initBalance;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getTotalItemCharges() {
		return totalItemCharges;
	}

	public void setTotalItemCharges(Double totalItemCharges) {
		this.totalItemCharges = totalItemCharges;
	}

	public Double getTotalCreditForMonth() {
		return totalCreditForMonth;
	}

	public void setTotalCreditForMonth(Double totalCreditForMonth) {
		this.totalCreditForMonth = totalCreditForMonth;
	}

	public Double getAllowedCredit() {
		return allowedCredit;
	}

	public void setAllowedCredit(Double allowedCredit) {
		this.allowedCredit = allowedCredit;
	}

	/**
	 * Print UserInfo Object
	 */
	@Override
	public String toString() {
		StringBuilder emp_obj_str = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");

		emp_obj_str.append(this.getClass().getName()).append(" Object {")
				.append(NEW_LINE);
		emp_obj_str.append("\tAccount Number:\t\t\t ")
				.append(this.getAccountNumber()).append(NEW_LINE);
		emp_obj_str.append("\tInitial Balance:\t\t$")
				.append(this.getInitBalance()).append(NEW_LINE);
		emp_obj_str.append("\tTotal Item Charges:\t\t$")
				.append(this.getTotalItemCharges()).append(NEW_LINE);
		emp_obj_str.append("\tTotal Credit for Month:\t\t$")
				.append(this.getTotalCreditForMonth()).append(NEW_LINE);
		emp_obj_str.append("\tAllowed Credit:\t\t\t$")
				.append(this.getAllowedCredit()).append(NEW_LINE);
		emp_obj_str.append("\tBalance:\t\t\t$").append(this.getBalance())
				.append(NEW_LINE);
		emp_obj_str.append("}");

		return emp_obj_str.toString();
	}
}
