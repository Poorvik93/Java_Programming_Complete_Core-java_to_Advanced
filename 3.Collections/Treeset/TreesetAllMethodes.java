package com.hashset.program;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetAllMethodes {
	public static void main(String[] args) {

		// ***TREESET UNDERLINE 'BALANCEDTREE' DATASTRUCTURE 
		// IT NOT INDEX BASED DATA STRUCTURE 
		// IT DOESNOT FOLLOWS THE INSERTION ORDER
		// IT FOLLOWS THE INSERTION ORDER.
		// STORE "HOMOGENEOUS ELEMENTS
		// NON SYNCHRONIAED DATA
		// NOT STORE NULL VALUES

		// Create a TreeSet named 'treeSet'
		TreeSet treeSet = new TreeSet();

		// 1. add(E element): Adds the specified element to the set.
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(20);
		treeSet.add(15);

		// 2. addAll(Collection<? extends E> c): Adds all elements from the specified collection to the set.
		TreeSet anotherSet = new TreeSet<>();
		anotherSet.add(30);
		anotherSet.add(25);
		treeSet.addAll(anotherSet);

		// 3. size(): Returns the number of elements in the set.
		System.out.println("Size of TreeSet: " + treeSet.size());

		// 4. isEmpty(): Returns true if the set is empty, false otherwise.
		System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

		// 5. contains(Object o): Returns true if the set contains the specified element.
		System.out.println("Contains 15? " + treeSet.contains(15));

		// 6. remove(Object o): Removes the specified element from the set.
		treeSet.remove(5);

		// 7. clear(): Removes all elements from the set.
		// treeSet.clear();

		// 8. first(): Returns the first (lowest) element in the set.
		System.out.println("First element: " + treeSet.first());

		// 9. last(): Returns the last (highest) element in the set.
		System.out.println("Last element: " + treeSet.last());

		// 10. pollFirst(): Removes and returns the first element in the set.
		Object firstElement = treeSet.pollFirst();
		System.out.println("Removed first element: " + firstElement);

		// 11. pollLast(): Removes and returns the last element in the set.
		Object lastElement = treeSet.pollLast();
		System.out.println("Removed last element: " + lastElement);

		// 12. iterator(): Returns an iterator over the elements in the set.
		Iterator<Integer> iterator = treeSet.iterator();
		System.out.print("TreeSet elements: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		treeSet.clear();
		System.out.println("Tree set in clear methode :"+treeSet);

	}

}
