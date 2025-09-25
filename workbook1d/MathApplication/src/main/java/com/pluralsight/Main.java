package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String bob = "Bob";
        String gary = "Gary";
        int bobSalary = 100000;
        int garySalary = 10900000;
        int higherSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest pay is " + bob + " with a $" + higherSalary + " salary!!!!" );;

        int carPrice = 33000;
        int truckPrice = 55000;
        int lowerCost = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is the car $" + lowerCost);


    }
}