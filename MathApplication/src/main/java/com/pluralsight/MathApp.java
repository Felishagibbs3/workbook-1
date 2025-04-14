package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        int bobSalary = 55000;
        int garySalary = 100000;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);


        {
            int carPrice = 32000;
            int truckPrice = 44000;
            int lowestPrice = Math.min(carPrice, truckPrice);
            System.out.println("The lowest price is " + truckPrice);

        }




    }

    {

    }


}



