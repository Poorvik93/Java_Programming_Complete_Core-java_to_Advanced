import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        // Sample array with duplicates
        Integer[] numbers = {1, 2, 3, 4, 5, 2, 7, 8, 8, 9};

        // Use a HashSet to store unique elements
        Set<Integer> uniqueSet = new HashSet<>();
        // Use a HashSet to store duplicate elements
        Set<Integer> duplicateSet = new HashSet<>();

        for (Integer number : numbers) {
            if (!uniqueSet.add(number)) {
                // If the element is already in the uniqueSet, it's a duplicate
                duplicateSet.add(number);
            }
        }

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Duplicate Elements: " + duplicateSet);
        System.out.println("uniqueSet Elements: " + uniqueSet);

    }
}

// //// output
// Original Array: [1, 2, 3, 4, 5, 2, 7, 8, 8, 9]
// Duplicate Elements: [2, 8]
// uniqueSet Elements: [1, 2, 3, 4, 5, 7, 8, 9]
