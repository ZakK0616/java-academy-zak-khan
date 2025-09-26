package com.pluralsight;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your mortgage calculator!!");
        System.out.println("The best and only one you'll ever use!!");

        System.out.print("To get started please tell me how much do you want the loan principal amount: ");;
        int p = input.nextInt();

        System.out.print("How much is your annual interest rate:");
        double r = input.nextDouble();

        System.out.print("How many years do you plan on paying it off for:");
        int y = input.nextInt();

        int n = y * 12;
        int m = n +12;
        double i = r / 12;
        double totalInterest = (m * n) - p;
        double cif  = p * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);

        System.out.print("A $" + p + " loan at " + r + "% for " + y + " years would have a $" + m + " /mo payment with a total interest of $" + cif);





    }
}