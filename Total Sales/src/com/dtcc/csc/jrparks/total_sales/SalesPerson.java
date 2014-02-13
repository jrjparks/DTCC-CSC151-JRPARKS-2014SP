/**
 * 
 */
package com.dtcc.csc.jrparks.total_sales;

/**
 * @author jrparks
 * 
 */
public class SalesPerson {
	private Integer		personID;
	private SalesSlip[]	salesSlips;
	
	public SalesPerson() {
		this(0);
	}
	
	public SalesPerson(Integer personID) {
		setPersonID(personID);
	}
	
	public SalesPerson(Integer personID, SalesSlip... salesSlips) {
		setPersonID(personID);
		setSalesSlips(salesSlips);
	}
	
	/**
	 * @return the personID
	 */
	public Integer getPersonID() {
		return personID;
	}
	
	/**
	 * @param personID
	 *            the personID to set
	 */
	public void setPersonID(Integer personID) {
		this.personID = personID;
	}
	
	/**
	 * @return the salesSlips
	 */
	public SalesSlip[] getSalesSlips() {
		return salesSlips;
	}
	
	/**
	 * @param salesSlips
	 *            the salesSlips to set
	 */
	public void setSalesSlips(SalesSlip... salesSlips) {
		this.salesSlips = salesSlips;
	}
}
