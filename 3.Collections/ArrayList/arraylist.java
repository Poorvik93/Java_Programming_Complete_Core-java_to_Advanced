
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Displaying the original ArrayList
        System.out.println("Original ArrayList: " + fruits);

        // Accessing elements by index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Checking if an element is present
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        // Getting the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of ArrayList: " + size);

        // Removing an element by value
        boolean removed = fruits.remove("Orange");
        System.out.println("Removed 'Orange': " + removed);
        System.out.println("ArrayList after removal: " + fruits);

        // Iterating through the ArrayList using a for loop
        System.out.println("Iterating using a for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Iterating through the ArrayList using an enhanced for loop
        System.out.println("Iterating using an enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clearing all elements from the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
    }
}


// Expected Output:
// ```
// Original ArrayList: [Apple, Banana, Orange, Mango]
// First fruit: Apple
// Contains 'Banana': true
// Size of ArrayList: 4
// Removed 'Orange': true
// ArrayList after removal: [Apple, Banana, Mango]
// Iterating using a for loop:
// Apple
// Banana
// Mango
// Iterating using an enhanced for loop:
// Apple
// Banana
// Mango
//ArrayList after clearing: []


// *****Explanation of methods and expected output:*****

// 1. **Adding elements (`add` method):**
//    - Adds "Apple", "Banana", "Orange", and "Mango" to the ArrayList.

// 2. **Accessing elements by index (`get` method):**
//    - Retrieves the first element ("Apple") from the ArrayList.

// 3. **Checking if an element is present (`contains` method):**
//    - Checks if "Banana" is present in the ArrayList.

// 4. **Getting the size of the ArrayList (`size` method):**
//    - Prints the size of the ArrayList.

// 5. **Removing an element by value (`remove` method):**
//    - Removes "Orange" from the ArrayList.

// 6. **Iterating through the ArrayList using a for loop:**
//    - Prints each element of the ArrayList using a traditional for loop.

// 7. **Iterating through the ArrayList using an enhanced for loop:**
//    - Prints each element of the ArrayList using an enhanced for loop.

// 8. **Clearing all elements from the ArrayList (`clear` method):**
//    - Clears all elements from the ArrayList.
