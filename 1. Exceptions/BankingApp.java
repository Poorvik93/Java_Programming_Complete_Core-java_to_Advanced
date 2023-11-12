package com.exception.practices;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {
        // Displaying a message indicating the connection establishment between ATM and Bank Server
        System.out.println("After Inserting the card to ATM, Connection Established between ATM and Bank Server.");
        
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        try {
            // Prompting the user to enter their PIN
            System.out.println("Enter Your PIN: ");
            int pin = sc.nextInt();
            
            // Checking if the entered PIN is correct
            if (pin == 0000) {
                System.out.println("Perform Your Activity :");
            } else {
                System.out.println("Wrong PIN. ");
            }
        } catch (Exception e) {
            // Handling any exception that might occur during PIN entry
            System.out.println("Exception is Handled.");
        } finally {
            // Displaying a message indicating the termination of the connection between ATM and Bank Server
            System.out.println("Connection is terminated between ATM and Bank Server.");
        }
    }
}

// // Output:-

// After Inserting the card to ATM, Connection Established between ATM and Bank Server.
// Enter Your PIN: 
// 44
// Wrong PIN. 
// Connection is terminated between ATM and Bank Server.
// //-----------------------------------------------------------------------------------------

// After Inserting the card to ATM, Connection Established between ATM and Bank Server.
// Enter Your PIN: 
// 0000
// Perform Your Activity :
// Connection is terminated between ATM and Bank Server.
