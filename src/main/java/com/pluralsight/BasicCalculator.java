package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNumber = myScanner.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = myScanner.nextDouble();

        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.println("Please select an option (lets try M): ");
        String operation = myScanner.next();

        double result = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        myScanner.close();

    }
}
