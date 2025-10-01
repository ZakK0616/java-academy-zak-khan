package com.pluralsight;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Please enter a game score:");
        String input = scnr.nextLine().trim();

        String[] parts = input.split("\\|");
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        int homeScore = Integer.parseInt(scores[0]);
        int awayScore = Integer.parseInt(scores[1]);

        if (homeScore > awayScore){
            System.out.print("Winner: " + teams[0]);
        } else if (awayScore > homeScore) {
            System.out.print("Winner: " + teams[1]);

        }



    }
}