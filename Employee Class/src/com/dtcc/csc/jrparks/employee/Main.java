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
		System.out.println("Employees:");
		employeeTest.printEmployeeList();

		System.out.print("\nGiving default raise to Employees...");
		employeeTest.giveRaises();
		System.out.println("DONE!");
		System.out.println("Employees:");
		employeeTest.printEmployeeList();

		System.out.print("\nGiving 5% raise to Employees...");
		employeeTest.giveRaises(5D);
		System.out.println("DONE!");
		System.out.println("Employees:");
		employeeTest.printEmployeeList();
	}
}
