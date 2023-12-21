package com.arraylist.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAllMethod {

    public static void main(String[] args) {
        // Create an ArrayList named 'all' to store elements of different data types
        ArrayList all = new ArrayList();

        // 1. add() Store elements in the ArrayList
        all.add(10);
        all.add(20);
        all.add("Poorvik");
        all.add(10.2);

        // Print the contents of the ArrayList (maintains order of insertion)
        System.out.println(all);

        // Create another ArrayList named 'all2' with similar elements
        ArrayList all2 = new ArrayList();
        all2.add(10);
        all2.add(20);
        all2.add("Poorvik");
        all2.add(10.2);

        // 2. contains() Check if 'all2' contains the element 20
        System.out.println(all2.contains(20));

        // 3. set() -Set the element at index 1 in 'all2' to "Naveen"
        System.out.println(all2.set(1, "Naveen"));

        // 4. indexOf :- Find the index of the element 10.2 in 'all2'
        System.out.println(all2.indexOf(10.2));

        // 5. Iterator :- Use an iterator to traverse and print the elements of 'all2'
        Iterator it = all2.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 6. size(): Returns the number of elements in the list.
        int size = all2.size();
        System.out.println("Size of all2: " + size);

        // 7. isEmpty(): Returns true if the list is empty, false otherwise.
        boolean isEmpty = all2.isEmpty();
        System.out.println("Is all2 empty? " + isEmpty);

        // 8. remove(Object element): Removes the first occurrence of the specified element from the list.
        boolean removed = all2.remove("Naveen");
        System.out.println("Element 'Naveen' removed? " + removed);

        // 9. clear(): Removes all elements from the list.
        all2.clear();
        System.out.println("all2 after clear: " + all2);

        // 10. addAll(Collection c): Appends all elements of the specified collection to the end of the list.
        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("John");
        anotherList.add("Doe");
        all2.addAll(anotherList);
        System.out.println("all2 after adding anotherList: " + all2);

        // 11. get(int index): Returns the element at the specified position in the list.
        Object elementAtIndex = all2.get(1);
        System.out.println("Element at index 1: " + elementAtIndex);

        // 12. toArray(): Returns an array containing all of the elements in the list in proper sequence.
        Object[] arrayFromList = all2.toArray();
        System.out.println("Array from all2: " + java.util.Arrays.toString(arrayFromList));

        // 13. removeAll(Collection c): Removes from the list all of its elements that are contained in the specified collection.
        all2.removeAll(anotherList);
        System.out.println("all2 after removing elements from anotherList: " + all2);
    }
}
