/**
 * 
 */
package com.dtcc.csc.jrparks.total_sales;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jrparks
 * 
 */
public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<SalesPerson> salesPeople =new LinkedList<SalesPerson>();
		salesPeople.add(new SalesPerson(1, new SalesSlip(1, 10D), new SalesSlip(4, 30D)));
		salesPeople.add(new SalesPerson(2, new SalesSlip(1, 20D), new SalesSlip(3, 10D)));
		salesPeople.add(new SalesPerson(3, new SalesSlip(2, 15D), new SalesSlip(5, 5D)));
		salesPeople.add(new SalesPerson(4, new SalesSlip(1, 5D), new SalesSlip(5, 5D)));
		
		printSales(5, salesPeople.toArray(new SalesPerson[0]));
	}
	
	public static void printSales(Integer itemCount, SalesPerson... salesPeople) {
		Double[][] totals = new Double[itemCount][salesPeople.length];
		for (SalesPerson salesPerson : salesPeople)
			if (salesPerson.getSalesSlips() != null) for (SalesSlip salesSlip : salesPerson.getSalesSlips())
				totals[salesSlip.getProductID() - 1][salesPerson.getPersonID() - 1] = salesSlip.getTotalDollarValue();
		
		for (SalesPerson salesPerson : salesPeople)
			System.out.printf("\tSP: %d", salesPerson.getPersonID());
		System.out.println("\t$ Total");
		
		for (Integer iID = 0; iID < totals.length; ++iID) {
			Double itemTotal = 0D;
			System.out.printf("Item: %d", iID + 1);
			for (Integer pID = 0; pID < totals[iID].length; ++pID) {
				if (totals[iID][pID] != null) System.out.printf("\t$%.2f", totals[iID][pID], itemTotal += totals[iID][pID]);
				else System.out.print("\t$--.--");
			}
			System.out.printf("\t$%.2f\n", itemTotal);
		}
		
		System.out.print("Total: ");
		for (SalesPerson salesPerson : salesPeople) {
			Double totalSale = 0D;
			if (salesPerson.getSalesSlips() != null) for (SalesSlip salesSlip : salesPerson.getSalesSlips())
				totalSale += salesSlip.getTotalDollarValue();
			System.out.printf("\t$%.2f", totalSale);
		}
		System.out.println();
	}
}
