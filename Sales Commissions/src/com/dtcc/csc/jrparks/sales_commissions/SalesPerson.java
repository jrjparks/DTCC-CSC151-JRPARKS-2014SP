package com.dtcc.csc.jrparks.sales_commissions;

public class SalesPerson {
	private Integer commissionRate, basePay;

	public SalesPerson() {
		setBasePay(200);
		setCommissionRate(9);
	}

	public SalesPerson(Integer commissionRate, Integer basePay) {
		setBasePay(commissionRate);
		setCommissionRate(basePay);
	}

	public Integer getPay(Integer sales) {
		return (int) (getBasePay() + (sales * Math
				.round(getCommissionRate() / 100D)));
	}

	public Integer getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(Integer commissionRate) {
		this.commissionRate = commissionRate;
	}

	public Integer getBasePay() {
		return basePay;
	}

	public void setBasePay(Integer basePay) {
		this.basePay = basePay;
	}
}
