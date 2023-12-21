package com.linkedlist.program;

import java.util.LinkedList;

public class LinkedListAllMethod {

	public static void main(String[] args) {
		// IT OCCUPY THE EXTRA SPACE FOR PREVIOUS NODE ADDRESS IN ADDING NEW ELEMENT
		
		// IT IS INDEX BASED DATA STRUCTURE
		// IT CAN STORE DIFFERENT(HETEROGENEOUS) DATA TYPE ELEMENT.
		// IT CAN STORE DUPLICATE VALUE AND ASLO STORE MULTIPLE NULL VALUES
		// IT FOLLOWS THE INSERTION ORDER
		// NOT FOLLOW SORTING ORDER
		// NON SYNCHRONIZED COLLECTION.
		
		 // Create a LinkedList named 'l'
        LinkedList l = new LinkedList();

        // Add elements to the LinkedList
        l.add(10);
        l.add("rahul");
        l.add(12.44);

        // Print the LinkedList
        System.out.println("LinkedList: " + l);

        // 1. addFirst(Object element): Inserts the specified element at the beginning of the list.
        l.addFirst("FirstElement");
        System.out.println("After addFirst: " + l);

        // 2. addLast(Object element): Appends the specified element to the end of the list.
        l.addLast("LastElement");
        System.out.println("After addLast: " + l);

        // 3. getFirst(): Returns the first element in the list.
        System.out.println("First Element: " + l.getFirst());

        // 4. getLast(): Returns the last element in the list.
        System.out.println("Last Element: " + l.getLast());

        // 5. removeFirst(): Removes and returns the first element from the list.
        Object removedFirst = l.removeFirst();
        System.out.println("Removed First Element: " + removedFirst);
        System.out.println("After removeFirst: " + l);

        // 6. removeLast(): Removes and returns the last element from the list.
        Object removedLast = l.removeLast();
        System.out.println("Removed Last Element: " + removedLast);
        System.out.println("After removeLast: " + l);

        // 7. size(): Returns the number of elements in the list.
        int size = l.size();
        System.out.println("Size of LinkedList: " + size);

        // 8. contains(Object element): Returns true if the list contains the specified element.
        System.out.println("Contains 'rahul': " + l.contains("rahul"));

        // 9. indexOf(Object element): Returns the index of the first occurrence of the specified element in the list.
        System.out.println("Index of 'rahul': " + l.indexOf("rahul"));

        // 10. clear(): Removes all elements from the list.
        l.clear();
        System.out.println("After clear: " + l);
	}

}
