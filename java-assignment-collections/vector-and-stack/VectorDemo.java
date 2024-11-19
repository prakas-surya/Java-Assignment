package dynamic;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// 1. Basic vector operations
		Vector<Integer> vector = new Vector<>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		
		System.out.println("Second indexed element in the vector is " + vector.get(2));
		System.out.println("All elements in the vector :");
		System.out.println(vector);
		
		// 2. Iterate and modify elements
		Vector<String> fruits = new Vector<>(List.of("Apple", "Banana", "Cherry", "Grapes", "Papaya"));
		
		if (fruits.contains("Cherry")) {
			int index = fruits.indexOf("Cherry");
			fruits.set(index, "Coconut");
		}
		
		Enumeration<String> enumeration = fruits.elements();
		
		System.out.println("Printing elements using enumeration after modification:");
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement() + " ");
		}
		
		// 3. Insert and remove elements
		Vector<Character> characters = new Vector<>(List.of('A', 'B', 'C', 'D', 'E'));
		
		characters.insertElementAt('X', 2);
		characters.remove(0);
		
		System.out.println("Vector after insert and remove operation:");
		System.out.println(characters);
		
		// 4. check for element
		Vector<Double> numberList = new Vector<>();
		
		Random random = new Random();
		for (int i=0; i<5; i++) {
			numberList.add(random.nextDouble() * 100);
		}
		
		System.out.println("Initial size of numberList : " + numberList.size());
		
		if (numberList.contains(10.5)) System.out.println("numberList contains value 10.5");
		else System.out.println("numberList does not contains value 10.5");
		
		numberList.add(10.5);
		
		System.out.println("After adding 10.5 to numberList");
		System.out.println(numberList);
		System.out.println("Size of numberList after adding a value is " + numberList.size());
		
		// 5. Array to vector and vice versa
		Vector<String> colors = new Vector<>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		
		String[] colorArray = new String[colors.size()];
		colorArray = colors.toArray(colorArray);
		
		System.out.println("Vector converted into an Array :");
		System.out.println(Arrays.toString(colorArray));
		
		Vector<String> newVector = new Vector<>(Arrays.asList(colorArray));
		System.out.println("Array converted into Vector :");
		System.out.println(newVector);
	}

}
