package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name in first last or first middle last:");
        String fullName = input.nextLine();

        fullName = fullName.trim();

        String[] parts = fullName.split(" ");

        System.out.println("\nFirst name: " + parts[0]);

        if (parts.length == 2) {
            System.out.println("Middle name: None");
            System.out.println("Last name: " + parts[1]);
        } else {
            System.out.println("Middle name: " + parts[1]);
            System.out.println("Last name: " + parts[2]);
        }




        
    }
}