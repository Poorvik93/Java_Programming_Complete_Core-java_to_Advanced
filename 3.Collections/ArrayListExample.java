import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Displaying the elements of the ArrayList
        System.out.println("Fruits in the ArrayList: " + fruits);

        // Accessing elements by index
        System.out.println("Element at index 1: " + fruits.get(1));

        // Updating an element
        fruits.set(2, "Mango");
        System.out.println("Updated ArrayList: " + fruits);

        // Removing an element
        fruits.remove("Banana");
        System.out.println("ArrayList after removing 'Banana': " + fruits);

        // Checking if an element is present
        if (fruits.contains("Grapes")) {
            System.out.println("'Grapes' is present in the ArrayList.");
        } else {
            System.out.println("'Grapes' is not present in the ArrayList.");
        }

        // Getting the size ofThe output of the provided Java program would be as follows:
        System.out.println("Size of the ArrayList: " + fruits.size());
    }
}

// // // Output:-
// // Fruits in the ArrayList: [Apple, Banana, Orange, Grapes]
// // Element at index 1: Banana
// // Updated ArrayList: [Apple, Banana, Mango, Grapes]
// // ArrayList after removing 'Banana': [Apple, Mango, Grapes]
// // 'Grapes' is present in the ArrayList.
// // Size of the ArrayList: 3


// This output corresponds to the various operations performed in the program:

1. The initial list of fruits is displayed.
2. The element at index 1 is displayed.
3. The ArrayList is updated with "Mango" at index 2, and the updated list is displayed.
4. "Banana" is removed from the ArrayList, and the modified list is displayed.
5. It checks if "Grapes" is present in the ArrayList and prints a corresponding message.
6. The size of the ArrayList is displayed.

You can copy and run the provided Java code in a Java development environment to see the output for yourself. the ArrayList


