package com.exception.practices;

import java.io.BufferedReader;
import java.io.InputStreamReader; 

/**
 * A simple program demonstrating user input using InputStreamReader and BufferedReader.
 */
public class UserInput_From_InputStreamReader {

    public static void main(String[] args) {
        try {
            // Prompting the user to enter a string
            System.out.println("Enter the string.");

            // Calling the method to take user input
            String str = takeInput();

            // Displaying the entered string
            System.out.println("Entered String is " + str);
        } catch (Exception e) {
            // Handling exceptions and printing the stack trace
            e.printStackTrace();
        }
    }

    /**
     * Method to take user input using InputStreamReader and BufferedReader.
     *
     * @return The string entered by the user.
     * @throws Exception If an error occurs while reading input.
     */
    public static String takeInput() throws Exception // It means ducking an exception 
    { 
        // Creating InputStreamReader to read from the standard input stream
        InputStreamReader isr = new InputStreamReader(System.in);

        // Creating BufferedReader to read lines from the InputStreamReader
        BufferedReader br = new BufferedReader(isr);

        // Reading a line of text entered by the user
        String str = br.readLine();

        // Returning the entered string
        return str;
    }
}


// Explanation of comments:

// 1. **Class Comment:**
//    - A comment at the beginning of the file explains that the program demonstrates user input using `InputStreamReader` and `BufferedReader`.

// 2. **Main Method Comment:**
//    - Comments in the `main` method explain the process of prompting the user, calling the method to take input, and displaying the entered string.

// 3. **TakeInput Method Comment:**
//    - Comments in the `takeInput` method describe the process of using `InputStreamReader` and `BufferedReader` to read user input and return the entered string.

// 4. **Exception Handling Comments:**
//    - Comments inside the `catch` block explain how exceptions are handled, and the stack trace is printed for debugging if an exception occurs.
