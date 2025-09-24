package com.pluralsight;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VariableApp {
    public static void main(String[] args) {
// Question 1:
// declare variables here
// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE
        String favoriteColor = "Green";
        int yearStart = 2025;
        char initials = 'Z';
        boolean hasPets = true;
        String niceText = "You are doing your best keep going!";

        System.out.println("My favorite color is " + favoriteColor);
        System.out.println("I started this program in " + yearStart);
        System.out.println("My middle name initial is " + initials);
        System.out.println("Do I have pets? The answer is " + hasPets);
        System.out.println(niceText);

        int daysInWeek = 7;
        double coffePrice = 4.99;
        char favLetter = 'Z';
        boolean rain = true;

        System.out.println("There are " + daysInWeek +  "days in the week");
        System.out.println("The price for coffe is $"+coffePrice);
        System.out.println("My favorite letter is " + favLetter);
        System.out.println("Is it raining outside today?" + rain);
    }
}