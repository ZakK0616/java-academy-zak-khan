package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your exam score 0-100:");
        int grade = input.nextInt();

        if (grade >= 90){
            System.out.println("A");
        } else if (grade >= 89) {
            System.out.println("B");
        } else if (grade >= 79 ) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.print("D");
        } else{
            System.out.println("F");
        }
        System.out.println("Your grade is " + grade);
    }
}