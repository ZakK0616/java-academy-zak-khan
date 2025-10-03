package com.pluralsight;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);

    CellPhone myPhone = new CellPhone();

    System.out.print("What is the serial number? ");
    myPhone.setSerialNumber(Scanner.nextInt());
    Scanner.nextLine();

    System.out.print("What model is the phone? ");
    myPhone.setModel(Scanner.nextLine());


    System.out.print("Who is the carrier? ");
    myPhone.setCarrier(Scanner.nextLine());


    System.out.print("What is the phone number? ");
    myPhone.setPhoneNumber(Scanner.nextLine());


    System.out.print("Who is the owner of the phone? ");
    myPhone.setOwner(Scanner.nextLine());


        System.out.println("\nCell Phone Information:");
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());

        Scanner.close();

    }
}