package com.exception.practices;
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        try {
            System.out.println("Calculation Started ");

            // Taking user input for the first number
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number 1");
            int num1 = sc.nextInt();

            // Taking user input for the second number
            System.out.println("Enter the number 2");
            int num2 = sc.nextInt();

            // Performing the calculation
            int cal = num1 / num2;
            
            // Displaying the result of the calculation
            System.out.println("Result of calculation " + cal);
        } catch (Exception e) {
            // Handling any exception that might occur during calculation
            System.out.println("Exception is handled");
        }
    }
}


//// OutPut:- 
// Calcualtion Started 
// Enter the number 1
// 10
// Enter the number 2
// 2
// Result of calculation 5

// ------------------------------
  //// below output Handel the Exception by User Defined Exception Handler
// Calcualtion Started 
// Enter the number 1
// 468
// Enter the number 2
// 0
// Execption is handeld
