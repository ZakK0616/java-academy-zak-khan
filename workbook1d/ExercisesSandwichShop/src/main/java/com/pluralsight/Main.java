package com.pluralsight;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1.Regular: base price $5.45");
        System.out.println("2.Large: base price $8.95");
        System.out.print("Pick your size by putting option 1 or 2:");

        int size = input.nextInt();
        double price = 0.0;
        if (size == 1){
            price = 5.45;
        }
        else if  (size == 2)
        {
            price = 9.95;
        }
            else {
            price = 0;
        }

            System.out.print("Would you like the sandwitch to be loaded please enter yes or no:");
            String loaded = input.next();
        if (Boolean.parseBoolean("yes")) {
            if (size == 1) {
                price += 1.00;
            } else if (size == 2) {
                price += 1.75;
            }
        }



            System.out.print("Enter your age:");
            int age = input.nextInt();


            if (age <=17){
                price *= 0.90;
            }
            else if (age <= 65) {

                price *= 0.80;
            }
            System.out.println("The cost of your sandwitch is $" + price);



            input.close();



        }


    }
