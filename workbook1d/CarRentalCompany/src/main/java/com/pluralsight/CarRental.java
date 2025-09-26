package com.pluralsight;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CarRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double basicCost = 29.99;
        double optionCost = 0.00;
        double underageSupercharge = 0.00;
        double totalCost = 0.00;



        System.out.println("Welcome to our Car shop Rental Company!!!");
        System.out.print("How many days do you plan on picking up the car for? MM/DD/YYYY:");
        String pickDate = input.nextLine();

        System.out.print("Great now how many days do you plan on renting the car for?");
        int HowManyDays = input.nextInt();
        input.nextLine();

        System.out.print("Do you want an electronic toll tag with it? Yes or no:");
        String yesNo = input.nextLine();
        if(yesNo.equalsIgnoreCase("yes")){
                optionCost += 3.95;

        }
        System.out.print("Do you want a GPS with it? Yes or no:");
        yesNo = input.nextLine();
        if(yesNo.equalsIgnoreCase("yes")) {
            optionCost += 2.95;
        }

        System.out.print("Do you road want roadside assistance? Yes or no:");
        yesNo = input.nextLine();
        if(yesNo.equalsIgnoreCase("yes")) {
            optionCost += 3.95;
        }

        System.out.print("How old are you?");
        int age = input.nextInt();
        if (age <25){
            underageSupercharge += basicCost * .30;

        }

        totalCost = (basicCost * HowManyDays) + optionCost + underageSupercharge;

        System.out.println("\n==== Rental Car Estimate ====");
        System.out.println("Pickup Date: " + pickDate);
        System.out.println("Number of Days: " + HowManyDays);
        System.out.printf("Basic Car Rental: $%.2f%n", basicCost);
        System.out.printf("Options Cost: $%.2f%n", optionCost);
        System.out.printf("Underage Driver Surcharge: $%.2f%n", underageSupercharge);
        System.out.printf("Total Cost: $%.2f%n", totalCost);

        input.close();















    }
}