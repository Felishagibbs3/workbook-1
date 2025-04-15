package com.pluralsight;


import java.util.Scanner;

public class SandwichShop {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean appRunning = true;
        while (appRunning == true) {

            int SandwichSize = sandwichSizeSelection();

            double total = 0;
            if (SandwichSize == 1) {
                total += 5.45;
            } else if (SandwichSize == 2) {
                total += 8.95;
            } else {
                System.out.println("\nInvalid Selection, try again.\n");
                return;
            }

            int discount = 0;
            try {

                int customerAge = Age();
                if (customerAge <= 17) {
                    discount = 10;
                } else if (customerAge >= 65) {
                    discount = 20;
                }

            } catch (Exception e) {
                System.out.println("\nInvalid age. Start over\n");
                myScanner.nextLine();
                return;
            }

            total = total - (total * discount / 100);
            displayTotal(SandwichSize, total, discount);


            System.out.println("What size sandwich would you like?");
            System.out.println("1: Regular : 5.45");
            System.out.println("2: Large : 8.95");

            int userchoice = myScanner.nextInt();
            int AgeSection;
            System.out.println("How old are you?");
            System.out.println(" <= 17 gets 10% off");
            System.out.println(">= 65 gets 20% off");
            System.out.println("Enter your age:");

            int age = myScanner.nextInt();

            String size = "";
            if (SandwichSize == 1) {
                size = "Regular";
            } else if (SandwichSize == 2) {
                size = "Large";

                if (discount > 0) {
                    System.out.println("This includes your " + discount + "% discount");
                }

            }
        }


    }


}




