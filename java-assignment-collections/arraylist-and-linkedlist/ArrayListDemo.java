package dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// 1. Arraylist - add and retrieve
		List<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Papaya"));
		
		// add values after declaration
		fruits.add("Grapes");
		fruits.add("Jackfruit");
		
		// retrieve 3rd value from array list
		System.out.println("Third fruit is " + fruits.get(2));
		
		// 2.Arraylist - Iterate and remove elements
		List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50));
		
		Iterator<Integer> iterator = numbers.iterator();
		
		while (iterator.hasNext()) {
			int n = iterator.next();
			if (n > 30) iterator.remove();
		}
		
		System.out.println("After removing elements using iterator : ");
		System.out.println(numbers);
		
		// 3.ArrayList - search for an element
		List<Character> characters = new ArrayList<>(List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'));
		
		char d = 'd';
		char z = 'z';
		
		System.out.println("Index of d is " + findIndex(d, characters));
		System.out.println("Index of z is " + findIndex(z, characters));
		
		// 4.ArrayList - sort the arraylist
		List<Integer> values = new ArrayList<>(List.of(4, 7, 2, 1, 6));
		Collections.sort(values);
		System.out.println("Collection after sorting :");
		System.out.println(values);
		
		// 5.ArrayList to Array and vice versa
		String[] str = {"one", "two", "three", "four", "five"};
		
		// converting array to list
		List<String> stringList = new ArrayList<>(Arrays.asList(str));
		
		System.out.println("Array to ArrayList: ");
		System.out.println(stringList);
		
		String[] stringArray = stringList.toArray(new String[0]);
		System.out.println("ArrayList to Array: ");
		System.out.println(Arrays.toString(stringArray));
		
	}
	
	private static int findIndex(char c, List<Character> characters) {
		// we can use index of method too...
		for (int i=0; i<characters.size(); i++) {
			if (characters.get(i).equals(c)) return i;
		}
		return -1;
	}

}
