package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


    System.out.println("What is your name?");
    String name = myScanner.nextLine();

    System.out.println("Enter Hours Worked");

    double hoursWorked = myScanner.nextDouble();

    System.out.println("What is the pay rate?");

    double payRate = myScanner.nextDouble();
    double grossPay = hoursWorked * payRate;

    System.out.printf("%s made $%.2f in gross pay" , name , hoursWorked * payRate);
    System.out.println(name + "made $" + grossPay * "in gross pay");


    }
}
