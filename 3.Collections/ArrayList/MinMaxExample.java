import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxExample {
    public static void main(String[] args) {
        // Sample array
        Integer[] numbers = {5, 8, 2, 1, 9, 4, 7, 3, 6};

        // Convert the array to a List for easier manipulation
        List<Integer> numberList = Arrays.asList(numbers);

        // Find and print the minimum and maximum elements
        int min = findMin(numberList);
        int max = findMax(numberList);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }

    // Method to find the minimum element in a List
    private static int findMin(List<Integer> list) {
        // Initialize min with the first element
        int min = list.get(0);

        // Iterate through the list to find the minimum element
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    // Method to find the maximum element in a List
    private static int findMax(List<Integer> list) {
        // Initialize max with the first element
        int max = list.get(0);

        // Iterate through the list to find the maximum element
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}
