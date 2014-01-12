/**
 * 
 */
package com.dtcc.csc.jrparks.employee;

import java.util.LinkedList;

/**
 * @author jrparks
 * 
 */
public class EmployeeTest {
	private LinkedList<Employee>	Employees;
	
	public EmployeeTest() {
		Employees = new LinkedList<Employee>();
		Employees.add(new Employee());
		Employees.add(new Employee("Jane", "Haberdasher", 1200.00));
	}
	
	/**
	 * 
	 */
	public void printEmployeeList() {
		for (Employee employee : this.Employees)
			System.out.println(employee);
	}
	
	/**
	 * 
	 */
	public void giveRaises() {
		for (Employee employee : this.Employees)
			employee.giveRaise();
	}
}
