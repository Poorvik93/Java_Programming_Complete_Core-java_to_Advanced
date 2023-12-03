import java.util.*;

public class SortingArray_List {
    public static void main(String[] args) {
        // Creating a new ArrayList of Integers
        ArrayList<Integer> newList = new ArrayList<>();
        
        // Adding elements to the ArrayList
        for (int i = 1; i <= 9; i++) {
            newList.add(i);
        }

        // Sort the list in ascending order
        Collections.sort(newList);

        // Using binary search to find the index of element 3
        int search = Collections.binarySearch(newList, 3);
        System.out.println("Index of element 3: " + search);

        // Iterating over the list and printing each element
        Iterator<Integer> it = newList.iterator();
        System.out.print("Integer Array elements are ");
        while (it.hasNext()) {
            System.out.print( it.next() +" ");
        }
         System.out.println();

        // Finding the maximum value in the list
        int max = Collections.max(newList);
        System.out.println("Maximum value: " + max);

        // Finding the minimum value in the list
        int min = Collections.min(newList);
        System.out.println("Minimum value: " + min);

        
        List <Integer> sublist= newList.subList(2,6);// starting index will be include 
        System.out.println("The new sublist using above newList " + sublist);
        // Creating a sublist
        ArrayList<Integer> subList = new ArrayList<>();
        subList.add(5);
        subList.add(6);
        subList.add(7);

        // Finding the index of the sublist in the main list
        int ind = Collections.indexOfSubList(newList, subList);
        System.out.println("Index of sublist: " + ind);

        // Creating a new ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("apple");
        names.add("ball");
        names.add("elephant");
        names.add("cat");
        names.add("dog");

        // Sorting the ArrayList of strings
        Collections.sort(names);

        // Iterating over the list and printing each element
        System.out.print("String array elements are : ");
        Iterator<String> ite = names.iterator();
        while (ite.hasNext()) {
            System.out.print(ite.next() + " ");
        }
        System.out.println();

        System.out.println("   *****************    ");
        System.out.println();

        // Creating a new ArrayList to clone the previous list
        ArrayList<String> names1 = new ArrayList<>();

        // Cloning the list
        names1 = (ArrayList) names.clone();
        System.out.println("Colemed array is " + names1);
        // Iterating over the cloned list and printing each element
        Iterator<String> clo = names.iterator();

        System.out.println("Cloned arrayList is : ");
        while (clo.hasNext()) {
            System.out.print(clo.next() + " ");
        }
    }
}



//// outPut:-

//// Index of element 3: 2
//// Integer Array elements are 1 2 3 4 5 6 7 8 9
//// Maximum value: 9
//// Minimum value: 1
//// Index of sublist: 4
//// String array elements are : apple ball cat dog elephant
//// *****************
//// Colemed array is [apple, ball, cat, dog, elephant]
//// Cloned arrayList is :
//// apple ball cat dog elephant



//// Explanation:


//// 1. Imports the necessary Java utilities.
//// 2. Creates an `ArrayList` of integers and adds elements from 1 to 9.
//// 3. Sorts the list in ascending order using `Collections.sort()`.
//// 4. Uses `Collections.binarySearch()` to find the index of the element 3.
//// 5. Iterates through the list and prints each element.
//// 6. Finds the maximum and minimum values in the list using `Collections.max()` and `Collections.min()`.
//// 7. Creates a sublist and finds its index in the main list using `Collections.indexOfSubList()`.
//// 8. Creates another `ArrayList` of strings, adds elements, and sorts it.
//// 9. Iterates through the sorted string list and prints each element.
//// 10. Clones the original integer list into a new list and prints the cloned list.
