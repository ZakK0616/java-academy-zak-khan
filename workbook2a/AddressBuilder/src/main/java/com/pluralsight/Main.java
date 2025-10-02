package com.pluralsight;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        StringBuilder billing = new StringBuilder();
        StringBuilder shipping = new StringBuilder();

    System.out.println("Please provide the following information for billing:");
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Street: ");
        String street = scanner.nextLine();
        billing.append(street + "\n");
        System.out.print("City: ");
        String city = scanner.nextLine();
        billing.append( city + ",");
        System.out.print("State: ");
        String state = scanner.nextLine();
        billing.append( state + " ");
        System.out.print("Zip: ");
        String zip = scanner.nextLine();
        billing.append( zip + " ");

        System.out.println("Please provide the following information for shipping:");
        System.out.print("Street: ");
        String sStreet = scanner.nextLine();
        shipping.append(street + "\n");
        System.out.print("City: ");
        String sCity = scanner.nextLine();
        shipping.append( city + ",");
        System.out.print("State: ");
        String sState = scanner.nextLine();
        shipping.append( state + " ");
        System.out.print("Zip: ");
        String sZip = scanner.nextLine();
        shipping.append( zip + " ");

        String mybilling = billing.toString();
        String myshipping = shipping.toString();

        System.out.println("Billing Address: \n" + mybilling);
        System.out.println("Shipping Address: \n" + myshipping);










        }
}