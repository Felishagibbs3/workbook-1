package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        int bobSalary = 55000;
        int garySalary = 100000;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);

        System.out.println("---------------------------------");

        {
            int carPrice = 32000;
            int truckPrice = 44000;
            int lowestPrice = Math.min(carPrice, truckPrice);
            System.out.println("The lowest price is " + truckPrice);

            System.out.println("---------------------------------");

        }
            double cirRadius = 7.25;
            double area = Math.PI * Math.pow(cirRadius, 2);

            System.out.println("The area of the cirlce with a radius of " + cirRadius + "is:" + area);

            System.out.println("---------------------------------");

            double number = 5.0;
            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + "is:" + squareRoot);

            System.out.println("---------------------------------");

            int x1 = 5;
            int x2 = 85;
            int y1 = 10;
            int y2 = 50;

            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));

            System.out.println("The distance is: " + distance);

            System.out.println("---------------------------------");


            double x = -3.8;
            double absValue = Math.abs(x);

            System.out.println("The absolute value of " + x + "is:" + absValue);

            System.out.println("---------------------------------");


            System.out.println("A random number between 0 and 1 is: " + Math.random());




    }

    {

    }


}



