/**
 * 
 */
package com.dtcc.csc.jrparks.employee;

/**
 * @author jrparks
 * 
 */
public class Employee {
	protected String	firstName;
	protected String	lastName;
	protected Double	monthlySalary;
	
	public Employee() {
		this("Richard", "Johnson", 1000.00);
	}
	
	public Employee(String firstName, String lastName, Double monthlySalary) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMonthlySalary(monthlySalary);
	}
	
	/**
	 * Give default raise of 10% to Employee
	 */
	public void giveRaise() {
		this.giveRaise(10D);
	}
	
	/**
	 * Give raise to Employee. Ex.: 1 = 1%, 0.1 = 0.1%
	 */
	public void giveRaise(Double percentAmount) {
		Double raise = this.getMonthlySalary() * (percentAmount / 100D);
		this.setMonthlySalary(this.getMonthlySalary() + raise);
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @return the monthlySalary
	 */
	public Double getMonthlySalary() {
		return monthlySalary;
	}
	
	/**
	 * @param monthlySalary
	 *            the monthlySalary to set
	 */
	public void setMonthlySalary(Double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	/**
	 * Print Employee Object
	 */
	@Override
	public String toString() {
		StringBuilder emp_obj_str = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		
		emp_obj_str.append(this.getClass().getName()).append(" Object {").append(NEW_LINE);
		emp_obj_str.append("\tFirst Name:\t\t").append(this.getFirstName()).append(NEW_LINE);
		emp_obj_str.append("\tLast Name:\t\t").append(this.getLastName()).append(NEW_LINE);
		emp_obj_str.append("\tMonthly Salary:\t\t$").append(this.getMonthlySalary()).append(NEW_LINE);
		emp_obj_str.append("}");
		
		return emp_obj_str.toString();
	}
}
