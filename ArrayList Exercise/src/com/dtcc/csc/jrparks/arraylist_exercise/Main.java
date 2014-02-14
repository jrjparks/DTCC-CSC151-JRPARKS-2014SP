/**
 * 
 */
package com.dtcc.csc.jrparks.arraylist_exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
		System.out.println("ArrayList Example");
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		do {
			System.out.print("Enter Number (-1 exits): ");
			if (scanner.hasNextInt()) {
				Integer n = scanner.nextInt();
				if (n <= -1) break;
				numbers.add(n);
			}
		} while (true);
		if (!numbers.isEmpty()) calculateNumbers(numbers.toArray(new Integer[0]));
	}
	
	public static void calculateNumbers(Integer... numbers) {
		HashMap<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
		ValueComparator vc = new ValueComparator(numbersMap);
		TreeMap<Integer, Integer> sortedNumbersMap = new TreeMap<Integer, Integer>(vc);
		for (Integer number : numbers) {
			if (!numbersMap.containsKey(number)) numbersMap.put(number, 1);
			else numbersMap.put(number, numbersMap.get(number) + 1);
		}
		sortedNumbersMap.putAll(numbersMap);
		System.out.println("Number\tOccurrence");
		for (Integer number : sortedNumbersMap.keySet())
			System.out.printf("%d\t%d\n", number, numbersMap.get(number));
	}
}

class ValueComparator implements Comparator<Integer> {
	
	Map<Integer, Integer>	base;
	
	public ValueComparator(Map<Integer, Integer> base) {
		this.base = base;
	}
	
	// Note: this comparator imposes orderings that are inconsistent with
	// equals.
	public int compare(Integer a, Integer b) {
		if (base.get(a) >= base.get(b)) {
			return -1;
		} else {
			return 1;
		} // returning 0 would merge keys
	}
}
