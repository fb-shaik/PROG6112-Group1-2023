/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexceptionhandlingapp;
import java.util.Scanner;

public class SimpleExceptionHandlingApp {
 public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        // Close the scanner to free up resources
        scanner.close();

        try {
            // Attempt to divide the numerator by the denominator
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException (division by zero)
            System.err.println("Error: " + e.getMessage());
        }
    }

    // A method that performs division and may throw an ArithmeticException
    public static int divideNumbers(int numerator, int denominator) {
        // Check if the denominator is zero
        if (denominator == 0) {
            // If the denominator is zero, throw an ArithmeticException
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        // Perform the division
        return numerator / denominator;
    }
}