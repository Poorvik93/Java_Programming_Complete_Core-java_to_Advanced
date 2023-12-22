package com.collectins.programs;

import java.util.Vector;

public class legacyVector {
    public static void main(String[] args) {
    	//// Vector is a legacy class introduced in JDK 1.0 version
    	// Vector IS AN IMPLEMENTED CLASS OF LIST INTERFACE 
    	// VECTOR IS INDEX BASED DATA STRUCTURE
    	// IT STORE HETEROGENEOUS DATA
    	// WE CAN STORE DUPLICATE ELEMENT 
    	// IT FOLLOWS INSERTION ORDER
    	// NOT FOLLOWS THE SORTING ORDER
    	// 
    	
        // Create a Vector named 'v'
        Vector v = new Vector();

        // Add elements to the Vector
        v.add(10);
        v.add("poorvik");
        v.add(192.160);
        v.add("poorvik");
        v.add('P');
        v.add(30);
        // Print the Vector
        System.out.println("Vector: " + v);

        // 1. remove(Object element): Removes the first occurrence of the specified element from the Vector.
        System.out.println("Remove 'poorvik': " + v.remove("poorvik"));
        System.out.println("After removing 'poorvik': " + v);

        // 2. removeElementAt(int index): Removes the element at the specified position in the Vector.
        v.removeElementAt(1);
        System.out.println("After removing element at index 1: " + v);

        // 3. set(int index, Object element): Replaces the element at the specified position in the Vector with the specified element.
        v.set(1, "df");
        System.out.println("After setting element at index 1 to 'df': " + v);

        // 4. setElementAt(Object element, int index): Sets the element at the specified position in the Vector to the specified element.
        v.setElementAt(11001, 0);
        System.out.println("After setting element at index 0 to 11001: " + v);
    
     // 5. size(): Returns the number of elements in the Vector.
        System.out.println("Size of Vector: " + v.size());

        // 6. contains(Object element): Returns true if the Vector contains the specified element.
        System.out.println("Contains 'poorvik': " + v.contains("poorvik"));

        // 7. indexOf(Object element): Returns the index of the first occurrence of the specified element in the Vector.
        System.out.println("Index of 'poorvik': " + v.indexOf("poorvik"));

        // 8. toArray(): Returns an array containing all of the elements in the Vector in proper sequence.
        Object[] arrayFromVector = v.toArray();
        System.out.println("Array from Vector: " + java.util.Arrays.toString(arrayFromVector));
     
        // 9. isEmpty(): Returns true if the Vector is empty, false otherwise.
        System.out.println("Is Vector empty? " + v.isEmpty());

        // 10. firstElement(): Returns the first element in the Vector.
        System.out.println("First Element: " + v.firstElement());

        // 11. lastElement(): Returns the last element in the Vector.
        System.out.println("Last Element: " + v.lastElement());

        // 12. elementAt(int index): Returns the element at the specified position in the Vector.
        System.out.println("Element at index 2: " + v.elementAt(2));

        // 13. clone(): Returns a shallow copy of the Vector.
        Vector copyVector = (Vector) v.clone();
        System.out.println("Copy of Vector: " + copyVector);

        // 14. clear(): Removes all elements from the Vector.
        v.clear();
        System.out.println("After clear: " + v);
    
    }
}
