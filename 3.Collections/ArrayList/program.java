import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayListExample {

    public static void main(String[] args) {
        // Using arrays
        int[] integerArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"apple", "banana", "orange"};

        System.out.println("Array of integers: " + Arrays.toString(integerArray));
        System.out.println("Array of strings: " + Arrays.toString(stringArray));

        // Using ArrayLists
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        // Adding elements to ArrayLists
        for (int i = 6; i <= 10; i++) {
            integerArrayList.add(i);
        }

        stringArrayList.add("grape");
        stringArrayList.add("kiwi");
        stringArrayList.add("melon");

        // Displaying ArrayList contents
        System.out.println("ArrayList of integers: " + integerArrayList);
        System.out.println("ArrayList of strings: " + stringArrayList);
    }
}
