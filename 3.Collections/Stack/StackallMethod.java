package com.collectins.programs;

import java.util.Stack;

public class StackallMethod {

	public static void main(String[] args) {
		// IT FOLLOWS "LIFO" 
		// MAINTAIN ORDER OF INSERTION
		// STORE HETEROGENIUS DATA
		// STORE DUPLICATE VALUES
		// 
		
		// Create a Stack named 'stack'
		Stack stack = new Stack();

		// 1. push(E item): Adds an item to the top of the stack.
		stack.push("Java");
		stack.push("Python");
		stack.push("JavaScript");
		stack.push("C++");
		stack.push("C++");
		stack.push(10);

		
		// Display the elements in the stack
		System.out.println("Stack elements: " + stack);

		// 2. pop(): Removes and returns the item at the top of the stack.
		Object poppedElement = stack.pop();
		System.out.println("Popped element: " + poppedElement);
		System.out.println("Stack after pop: " + stack);

		// 3. peek(): Returns the item at the top of the stack without removing it.
		Object topElement = stack.peek();
		System.out.println("Top element (peek): " + topElement);

		// 4. search(Object o): Returns the 1-based position of the object from the top of the stack.
		int position = stack.search("Python");
		System.out.println("Position of 'Python' in the stack: " + position);

		// 5. empty(): Returns true if the stack is empty, false otherwise.
		System.out.println("Is the stack empty? " + stack.isEmpty());

		// 6. size(): Returns the number of elements in the stack.
		System.out.println("Size of the stack: " + stack.size());

		// 7. empty(): Returns true if the stack is empty, false otherwise.
		System.out.println("Is the stack empty? " + stack.empty());

		// 8. capacity(): Returns the current capacity of the stack.
		System.out.println("Stack capacity: " + stack.capacity());

		// 9. elementAt(int index): Returns the element at the specified position in the stack.
		System.out.println("Element at index 2: " + stack.elementAt(2));

		// 10. indexOf(Object o): Returns the index of the first occurrence of the specified element in the stack.
		System.out.println("Index of 'JavaScript': " + stack.indexOf("JavaScript"));

		// 11. toArray(): Returns an array containing all of the elements in the stack.
		Object[] arrayFromStack = stack.toArray();
		System.out.println("Array from stack: " + java.util.Arrays.toString(arrayFromStack));

		// 12. remove(Object o): Removes the first occurrence of the specified element from the stack.
		stack.remove("C++");
		System.out.println("Stack after removing 'C++': " + stack);

		// 13. pushAll(Collection<? extends E> c): Pushes all elements from the specified collection onto the stack.
		stack.push("HTML");
		stack.push("CSS");

		Stack<String> anotherStack = new Stack<>();
		anotherStack.push("React");
		anotherStack.push("Angular");

		stack.addAll(anotherStack);
		System.out.println("Stack after pushAll: " + stack);
		
		
		// 14. removeAllElements(): Removes all elements from the stack.
		stack.removeAllElements();
		System.out.println("Stack after removeAllElements: " + stack);

		
	}


}
