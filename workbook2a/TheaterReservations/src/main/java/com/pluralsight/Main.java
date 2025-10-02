package com.pluralsight;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();



        System.out.print("Whats the date you will be coming MM/dd/YYYY? ");
        String userInput = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(userInput, formatter);


        System.out.print("How many tickets do you want? ");
        int ticketAmount = scanner.nextInt();

        String[] parts = name.split(" ");
        String firstName = parts[0];
        String lastName = parts[1];


        System.out.println(ticketAmount + " ticket reserved for " + date + " under " + lastName + ", " + firstName);






    }
}