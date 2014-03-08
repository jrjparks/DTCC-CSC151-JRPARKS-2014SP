package com.dtcc.csc.jrparks.sales_commissions;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("DTCC CSCl 151 450 SP14 - JRParks");
		System.out.println("Sales Commissions");
		SalesPerson salesPerson = new SalesPerson(9, 200);
		Integer[] sales = new Integer[9];
		for (int x = 0, sm = 200, sl = 299; x < sales.length; ++x, sm += 100, sl += 100)
			sales[x] = randInt(sm, sl);
		System.out.println("  Sale\t  Pay");
		for (Integer sale : sales)
			System.out.printf("$%,6d\t$%,6d\n", sale,
					salesPerson.getPay(sale));
	}

	public static Integer randInt(Integer min, Integer max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
}
