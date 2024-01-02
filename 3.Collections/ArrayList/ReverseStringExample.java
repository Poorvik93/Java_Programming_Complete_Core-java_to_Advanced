import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseStringExample {
    public static void main(String[] args) {
        // Read a string from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string using Collections Framework
        String reversedString = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed String: " + reversedString);

        // Close the scanner
        scanner.close();
    }

    public static String reverseString(String input) {
        // Convert the string to a list of characters
        List<Character> charList = new ArrayList<>();
        for (char c : input.toCharArray()) {
            charList.add(c);
        }

        // Use Collections.reverse() to reverse the list
        Collections.reverse(charList);

        // Convert the reversed list back to a string
        StringBuilder reversedStringBuilder = new StringBuilder(charList.size());
        for (Character c : charList) {
            reversedStringBuilder.append(c);
        }

        // Return the reversed string
        return reversedStringBuilder.toString();
    }
}
