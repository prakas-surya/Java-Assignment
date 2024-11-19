package dynamic;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// 1. Add and access elements
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		int sum = 0;
		for (int i=0; i<numbers.size(); i++) {
			sum = sum + numbers.get(i);
		}
		
		System.out.println("Sum of numbers : " + sum);
		
		// 2. Iterate and modify elements
		LinkedList<String> words = new LinkedList<>(List.of("one", "two", "three", "four", "five"));
		
		ListIterator<String> iterator = words.listIterator();
		
		while (iterator.hasNext()) {
			String word = iterator.next();
			if (word.equals("three")) iterator.set("THREE");
		}
		
		System.out.println("Linked list after modification :");
		System.out.println(words);
		
		// 3. LinkedList operations
		LinkedList<Integer> values = new LinkedList<>();
		
		for (int i=1; i<=10; i++) {
			values.add(i);
		}
		
		values.remove(2);
		values.removeLast();
		
		System.out.println("Linked list after removal operation :");
		System.out.println(values);
		
		// 4. Queue behavior in LinkedList
		LinkedList<String> queue = new LinkedList<>();

        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Diana");

        queue.removeFirst();
        queue.removeFirst();

        System.out.println("Queue after removing two names: " + queue);
        
        // 5. Reverse LinkedList
        LinkedList<Integer> numberList = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        
        Collections.reverse(numberList);
        
        System.out.println("Linked list after reversed :");
        System.out.println(numberList);
	}
}
