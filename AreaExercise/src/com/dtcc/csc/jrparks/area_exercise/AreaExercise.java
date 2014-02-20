/**
 * 
 */
package com.dtcc.csc.jrparks.area_exercise;

import java.util.Map;
import java.util.Scanner;

import com.dtcc.csc.jrparks.area_exercise.shapes.Shape;
import com.dtcc.csc.jrparks.area_exercise.shapes.threedimentional.CuboidShape;
import com.dtcc.csc.jrparks.area_exercise.shapes.threedimentional.SphereShape;
import com.dtcc.csc.jrparks.area_exercise.shapes.twodimentional.EllipseShape;
import com.dtcc.csc.jrparks.area_exercise.shapes.twodimentional.RectangleShape;

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

	public Shape getShape(Integer selection) {
		switch (selection) {
		default:
			return null;

		case 1:
			return new EllipseShape();

		case 2:
			return new RectangleShape();

		case 3:
			return new SphereShape();

		case 4:
			return new CuboidShape();
		}
	}

	public Double askQuestion(String question) {
		System.out.print(question);
		do {
			if (scanner.hasNextDouble())
				return scanner.nextDouble();
			scanner.next();
		} while (!scanner.hasNextDouble());
		return null;
	}
}
