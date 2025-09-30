package com.pluralsight;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to your Fincial Calculator please put 1 for your Mortgage Calculator or 2 for your Future Value calculator: ");
        String choice = input.next();

        if (choice.equals("1")) {
            MortgageCalculator(input);
        } else if (choice.equals("2")) {
            Futurevalue(input);
        }else {
            System.out.println("Invalid choice.");
            System.exit(0);
        }

        MortgageCalculator(input);
        Futurevalue(input);

        input.close();

    }

            public static void MortgageCalculator(Scanner input){
            System.out.println("Welcome to your Mortgage calculator!!");
            System.out.println("The best and only one you'll ever use!!");

            System.out.print("To get started please tell me how much do you want the loan principal amount: ");

            int p = input.nextInt();

            System.out.print("How much is your annual interest rate:");
            double r = input.nextDouble();

            System.out.print("How many years do you plan on paying it off for:");
            int y = input.nextInt();

            int n = y * 12;
            int m = n + 12;
            double i = r / 12;
            double totalInterest = (m * n) - p;
            double cif = p * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);

            System.out.print("A $" + p + " loan at " + r + "% for " + y + " years would have a $" + m + " /mo payment with a total interest of $" + cif);

                input.close();

        }


            public static void Futurevalue(Scanner input){
            System.out.println("Welcome to your Future Value calculator!!");
            System.out.println("The best and only one you'll ever use!!");

            System.out.print("To get started please tell me how much you want to deposit:");
            int p = input.nextInt();

            System.out.print("Great! Now how much is your interest rate:");
            double r = input.nextInt();

            System.out.print("Awsome! Now how many years do you plan to have in your deposit?");
            int t = input.nextInt();

            int daysPerYear = 365;
            int totalDays = daysPerYear * t;
            double futureValue =  p * Math.pow(1 + (r / daysPerYear), totalDays);

            double totalIntrestEarned = futureValue - p;

                System.out.println("If you deposit $" + p + " in a CD that earns"+ r + " interest and matures in " + t + " years, your CD's ending balance will be $" + futureValue + " and you will have earned $" + totalIntrestEarned + " in interest.");







                input.close();



            }




    }
