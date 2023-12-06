import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a palindrome
        boolean isPalindrome = isPalindrome(number);

        // Display the result
        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a number is a palindrome
    private static boolean isPalindrome(int num) {
        ArrayList<Integer> digitList = getDigits(num);

        // Check if the list of digits is a palindrome
        int start = 0;
        int end = digitList.size() - 1;

        while (start < end) {
            if (!digitList.get(start).equals(digitList.get(end))) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Function to get the digits of a number in reverse order
    private static ArrayList<Integer> getDigits(int num) {
        ArrayList<Integer> digitList = new ArrayList<>();

        while (num > 0) {
            int digit = num % 10;
            digitList.add(digit);
            num /= 10;
        }

        return digitList;
    }
}
