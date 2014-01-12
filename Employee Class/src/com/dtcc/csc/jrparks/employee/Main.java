/**
 * 
 */
package com.dtcc.csc.jrparks.employee;

/**
 * @author jrparks
 * 
 */
public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeTest employeeTest = new EmployeeTest();
		System.out.println("Default Employees...");
		employeeTest.printEmployeeList();
		System.out.println("Giving raises...");
		employeeTest.giveRaises();
		System.out.println("Employees...");
		employeeTest.printEmployeeList();
	}
	
}
