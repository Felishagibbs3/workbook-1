package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

    System.out.println("Enter the first number:");

    int firstNumber = myScanner.nextInt();

    System.out.println("Enter the second number: ");

    int secondNumber = myScanner.nextInt();

    myScanner.nextLine();

    System.out.println("Possible calculations: ");
    System.out.println("    (A)dd ");
    System.out.println("    (S)ubtract ");
    System.out.println("    (M)ultiply ");
    System.out.println("    (D)ivide ");
    System.out.println("    (A)dd ");
    System.out.println("Please select an option: ");

    String userChoice = myScanner.nextLine();

    int product = firstNumber * secondNumber;

    System.out.println(firstNumber + " x " + secondNumber + " = " + product);



    }




}
