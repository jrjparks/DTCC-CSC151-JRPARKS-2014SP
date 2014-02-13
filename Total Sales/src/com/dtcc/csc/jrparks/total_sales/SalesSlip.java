/**
 * 
 */
package com.dtcc.csc.jrparks.total_sales;

/**
 * @author jrparks
 * 
 */
public class SalesSlip {
	private Integer	productID;
	private Double	totalDollarValue;
	
	public SalesSlip() {
		this(0);
	}
	
	public SalesSlip(Integer productID) {
		this(productID, 0D);
	}
	
	public SalesSlip(Integer productID, Double totalDollarValue) {
		setProductID(productID);
		setTotalDollarValue(totalDollarValue);
	}
	
	/**
	 * @return the productID
	 */
	public Integer getProductID() {
		return productID;
	}
	
	/**
	 * @param productID
	 *            the productID to set
	 */
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	
	/**
	 * @return the totalDollarValue
	 */
	public Double getTotalDollarValue() {
		return totalDollarValue;
	}
	
	/**
	 * @param totalDollarValue
	 *            the totalDollarValue to set
	 */
	public void setTotalDollarValue(Double totalDollarValue) {
		this.totalDollarValue = totalDollarValue;
	}
}
