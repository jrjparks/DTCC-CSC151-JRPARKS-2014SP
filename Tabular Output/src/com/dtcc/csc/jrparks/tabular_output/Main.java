package com.dtcc.csc.jrparks.tabular_output;

public class Main {

	public static void main(String[] args) {
		System.out.println("DTCC CSC 151 450 SP14 - JRParks");
		System.out.println("Tabular Output");
		System.out.println("N\t10*N\t100*N\t1000*N");
		for (Integer n = 1; n <= 5; ++n) {
			System.out.printf("%d\t%d\t%d\t%d\n", n, n * 10, n * 100, n * 1000);
		}
	}

}
