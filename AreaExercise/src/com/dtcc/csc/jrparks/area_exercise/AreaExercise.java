/**
 * 
 */
package com.dtcc.csc.jrparks.area_exercise;

import java.util.Map;
import java.util.Scanner;

/**
 * @author jrparks
 * 
 */
public final class AreaExercise {
	class KeyValuePair<K, V> implements Map.Entry<K, V> {
		private K key;
		private V value;

		public KeyValuePair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}

		@Override
		public V setValue(V value) {
			return this.value = value;
		}
	}

	private Scanner scanner;
	private String[] menu;

	public AreaExercise() {
		scanner = new Scanner(System.in);
		menu = new String[] {
				// 2-D
				"Ellipse", "Rectangle",

				// 3-D
				"Sphere", "Cuboid", };
	}

	public Integer MainMenu() {
		Integer selection = -1;
		do {
			do {
				int opt_id = 1;
				for (String opt : menu)
					System.out.printf("%d: %s\n", opt_id++, opt);
				System.out.print("Please select an option (-1 exit): ");
				if (!scanner.hasNextInt())
					scanner.next();
			} while (!scanner.hasNextInt());
			selection = scanner.nextInt();
		} while (!(selection <= menu.length || selection == -1));
		return selection;
	}

	public String[] getQuestions(Integer selection) {
		return null;
	}
}
