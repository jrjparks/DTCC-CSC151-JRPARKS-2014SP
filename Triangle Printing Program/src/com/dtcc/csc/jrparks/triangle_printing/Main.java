/**
 * 
 */
package com.dtcc.csc.jrparks.triangle_printing;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * @author jrparks
 * 
 */
public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("DTCC CSC 151 450 SP14 - JRParks");
		System.out.println("Triangle Printing Program");
		System.out.println("(a)");
		printLines(System.out, drawTriangle(true, Align.Right, 10));
		System.out.println();
		System.out.println("(b)");
		printLines(System.out, drawTriangle(false, Align.Right, 10));
		System.out.println();
		System.out.println("(c)");
		printLines(System.out, drawTriangle(false, Align.Left, 10));
		System.out.println();
		System.out.println("(d)");
		printLines(System.out, drawTriangle(true, Align.Left, 10));
	}
	
	public static enum Align {
		Left, Right
	}
	
	public static String[] drawTriangle(boolean assending, Align align, Integer size) {
		String[] lines = new String[size];
		for (Integer x = 0; x < lines.length; ++x) {
			char[] t = new char[assending ? (x + 1) : (size - x)];
			Arrays.fill(t, '*');
			lines[x] = String.format(String.format("%%1$%s%ds", (align == Align.Right ? "-" : ""), size), new String(t));
		}
		return lines;
	}
	
	public static void printLines(PrintStream ps, String... lines) {
		for (String line : lines)
			ps.println(line);
	}
}
