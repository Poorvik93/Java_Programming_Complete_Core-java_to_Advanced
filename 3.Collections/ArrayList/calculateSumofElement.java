import java.util.ArrayList;
import java.util.List;

public class calculateSumofElement {
    public static void main(String[] args) {
        // Creating a List to store integers
        List<Integer> numbersList = new ArrayList<>();

        // Adding elements to the List
        numbersList.add(10);
        numbersList.add(5);
        numbersList.add(8);
        numbersList.add(20);

        // Displaying the original list
        System.out.println("Original List: " + numbersList);

        // Performing some operations on the List
        int sum = calculateSum(numbersList);
        System.out.println("Sum of elements: " + sum);

        // Removing an element from the List
        numbersList.remove(Integer.valueOf(5));
        System.out.println("List after removing 5: " + numbersList);
    }

    // Method to calculate the sum of elements in the List
    private static int calculateSum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
