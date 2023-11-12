package com.exception.practices;

import java.util.Scanner;

public class calculator1 {

    public static void main(String[] args) {
        // Displaying a message indicating the start of the calculation
        System.out.println("Calculation is started.");
        
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter the first number
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        
        // Prompting the user to enter the second number
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        
        // Calling the multiply method to perform multiplication
        multiply(a, b);
        
        // Displaying a message indicating the end of the calculation
        System.out.println("Calculation is ended.");
    }

    // Method to perform multiplication
    public static void multiply(int a, int b) {
        // Displaying a message indicating the start of multiplication
        System.out.println("Multiplication is started.");
        
        // Calculating the multiplication result
        int mulres = a * b;
        
        // Displaying the multiplication result
        System.out.println("Multiplication result is " + mulres);
        
        // Calling the divide method to perform division
        divide(a, b);
        
        // Displaying a message indicating the end of multiplication
        System.out.println("Multiplication is ended.");
    }

    // Method to perform division
    public static void divide(int a, int b) {
        try {
            // Displaying a message indicating the start of division
            System.out.println("Division is started.");
            
            // Calculating the division result
            int divres = a / b;
            
            // Displaying the division result
            System.out.println("Division result is " + divres);
            
            // Recursive call to the divide method (be cautious of potential stack overflow)
            divide(a, b);
        } catch (Exception e) {
            // Handling any exception that might occur during division
            System.out.println("Exception is handled in division.");
        } finally {
            // Displaying a message indicating the end of division
            System.out.println("Division is ended.");
        }
    }
}

// Explination:-

// 1. **Calculation Start:**
//    - The program starts by displaying a message indicating the beginning of the calculation.

// 2. **User Input:**
//    - It then prompts the user to enter two numbers using a `Scanner` object.

// 3. **Multiply Method:**
//    - The `multiply` method is called with the entered numbers to perform multiplication.
//    - Inside the method, it displays a message indicating the start of multiplication, calculates the result, prints the result, calls the `divide` method for division, and then displays a message indicating the end of multiplication.

// 4. **Divide Method:**
//    - The `divide` method is responsible for performing division.
//    - It starts by displaying a message, calculates the division result, prints the result, and then makes a recursive call to itself (be cautious of potential stack overflow).
//    - If an exception occurs during division, it catches the exception, prints a message indicating that the exception is handled, and then executes the `finally` block to display a message indicating the end of division.

// 5. **Calculation End:**
//    - Finally, the program displays a message indicating the end of the entire calculation.
