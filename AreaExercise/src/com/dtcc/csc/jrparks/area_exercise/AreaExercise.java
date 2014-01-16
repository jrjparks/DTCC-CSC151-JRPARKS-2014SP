/**
 * 
 */
package com.dtcc.csc.jrparks.area_exercise;

import java.util.HashMap;
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
		private K	key;
		private V	value;
		
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
	
	private Scanner										scanner;
	private Map<Integer, KeyValuePair<String, Class<Shape>>>	menu;
	
	public AreaExercise() {
		scanner = new Scanner(System.in);
		menu = new HashMap<Integer, KeyValuePair<String, Class<Shape>>>();
		
		menu.put(1, new KeyValuePair<String, Shape>("Circle", EllipseShape));
		menu.put(2, new KeyValuePair<String, Shape>("Square", new RectangleShape()));
		
		menu.put(3, new KeyValuePair<String, Shape>("Sphere", new SphereShape()));
		menu.put(4, new KeyValuePair<String, Shape>("Cube", new CuboidShape()));
		
		menu.put(5, new KeyValuePair<String, Shape>("Exit", null));
	}
	
	public Integer MainMenu() {
		Integer selection = -1;
		do {
			do {
				for (Integer k : menu.keySet())
					System.out.printf("%d: %s\n", k, menu.get(k).getKey());
				System.out.print("Please select an option: ");
			} while (!scanner.hasNextInt());
			selection = scanner.nextInt();
		} while (!menu.containsKey(selection));
		return selection;
	}
	
	public Shape getSelection(Integer selection) {
		return menu.get(selection).getValue();
	}
}
