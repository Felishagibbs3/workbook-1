package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {


        // ask user for a date and store it as a string
        System.out.println("What is the pick-up date?");
        String date = theScanner.nextLine();

        // ask user for number of days for rental
        //store as int
        System.out.println("How many days are you renting for?");
        int day = theScanner.nextInt();

        theScanner.nextLine();

        //do you want an electronic toll tag? 3.95 upcharge per day
        // store answer as a string
        System.out.println("Toll tag? (3.95/per day) (y/n):");
        String tollTag = theScanner.nextLine();

        // do you want gps? 2.95 per day
        System.out.println("GPS? (2.95/per day) (y/n)");
        String gps = theScanner.nextLine();

        //do you want roadside assit for 3.95 per day
        System.out.println("Roadside assistance? (3.95/per day) (y/n)");
        String roadSide = theScanner.nextLine();

        // need to ask their age
        System.out.println("How old are you?");
        int age = theScanner.nextInt();


        //calculate base rental price 29.99 per day
        double basePrice = 29.99 * day;

        // figure out options cost (gps + toll + roadside)
        double optionsCost = 0;
        if (tollTag.equals("y")) {
            optionsCost += 3.95;

        }
        if (gps.equals("y")) {
            optionsCost += 2.95;

        }
        if (roadSide.equals("y")) {
            optionsCost += 3.95;

        }

        optionsCost *= day;

        double subTotal = basePrice + optionsCost;

        double surcharge = 0;
        if (age< 25) {
            surcharge = subTotal * .3;

        double total = subTotal + surcharge;

        System.out.printf("Base Rental Cost $%.2f%n", basePrice);
        System.out.printf("Options Cost $%.2f%n", basePrice);
        System.out.printf("Underage surcharge $%.2f%n", basePrice);
        System.out.printf("Cost $%.2f%n",total);

        }
        }
    }