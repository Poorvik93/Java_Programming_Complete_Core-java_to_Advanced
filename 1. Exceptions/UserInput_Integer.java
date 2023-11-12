package com.exception.practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * A program demonstrating user input for an integer using InputStreamReader and BufferedReader.
 */
public class UserInput_Integer {

    public static void main(String[] args) {
        try {
            // Prompting the user to enter an integer
            System.out.println("Enter an integer:");

            // Calling the method to take user input for an integer
            int number = takeIntegerInput();

            // Displaying the entered integer
            System.out.println("Entered Integer is: " + number);
        } catch (Exception e) {
            // Handling exceptions and printing the stack trace
            e.printStackTrace();
        }
    }

    /**
     * Method to take user input for an integer using InputStreamReader and BufferedReader.
     *
     * @return The integer entered by the user.
     * @throws Exception If an error occurs while reading input or if the entered value is not an integer.
     */
    public static int takeIntegerInput() throws Exception {
        // Creating InputStreamReader to read from the standard input stream
        InputStreamReader isr = new InputStreamReader(System.in);

        // Creating BufferedReader to read lines from the InputStreamReader
        BufferedReader br = new BufferedReader(isr);

        // Reading a line of text entered by the user
        String input = br.readLine();

        // Parsing the input to an integer
        int number = Integer.parseInt(input);

        // Returning the entered integer
        return number;
    }
}
