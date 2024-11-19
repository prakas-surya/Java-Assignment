package dynamic;

import java.util.Arrays;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// 1. Basic stack operations
		Stack<Integer> numbers = new Stack<>();
		numbers.push(10);
		numbers.push(20);
		numbers.push(30);
		numbers.push(40);
		numbers.push(50);
		
		System.out.println("Stack elements :");
		System.out.println(numbers);
		
		numbers.pop();
		System.out.println("Remaining elements in stack after popping :");
		System.out.println(numbers);
		
		// 2. Peek and search in stack
		Stack<String> numberStack = new Stack<>();
		numberStack.push("first");
		numberStack.push("second");
		numberStack.push("third");
		numberStack.push("fourth");
		
		System.out.println("Elements in numberStack :");
		System.out.println(numberStack);

        System.out.println("Top element : " + numberStack.peek());

        int position = numberStack.search("second");
        if (position != -1) System.out.println("Position of second in the stack: " + position);
        else System.out.println("second is not in the stack.");
		
        // 3. Reverse a string using stack
        String s = "hello";
        System.out.println("String before reversing : " + s);
        Stack<Character> characters = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
        	characters.push(s.charAt(i));
        }
        
        StringBuilder str = new StringBuilder();
        
        while (!characters.isEmpty()) {
        	str.append(characters.pop());
        }
        
        System.out.println("String after reversing : " + str.toString());
        
        // 4. Balanced Parenthesis using stack
        String s1 = "(())";
        String s2 = "(()";
        
        System.out.println("String s1 is balanced : " + isBalanced(s1));
        System.out.println("String s2 is balanced : " + isBalanced(s2));
        
        // 5. Stack to Array and vice versa
        Stack<Double> stack = new Stack<>();
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        stack.push(4.4);
        stack.push(5.5);

        Double[] stackArray = new Double[stack.size()];
        stackArray = stack.toArray(stackArray);
        
        System.out.println("Stack converted into Array :");
        System.out.println(Arrays.toString(stackArray));
        
        Stack<Double> newStack = new Stack<>();
        for (Double d : stackArray) {
            newStack.push(d);
        }
        
        System.out.println("Array converted into Stack :");
        System.out.println(newStack);
	}
	
	private static boolean isBalanced(String input) {
		Stack<Character> balancedStack = new Stack<>();
		
		for (char ch : input.toCharArray()) {
			if (ch == '(') {
				balancedStack.push(ch);
			}
			else if (ch == ')') {
				if (balancedStack.isEmpty()) return false;
				balancedStack.pop();
			}
		}
		return balancedStack.isEmpty();
	}

}
