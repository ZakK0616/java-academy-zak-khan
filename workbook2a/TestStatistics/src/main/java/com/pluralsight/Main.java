package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] testScores = {90, 87, 53, 89, 78, 84, 23, 75, 87, 28};

        System.out.println("\n All scores:");
        for (int score : testScores){
            System.out.println(score + "");
        }
        System.out.println("\n");

        int sum = 0;
        int highest = testScores[0];
        int lowest = testScores[0];

        for(int score : testScores){
            sum += score;
            if (score > highest)highest = score;
            if (score < lowest)lowest = score;
        }

        double average = (double) sum / testScores.length;

        System.out.println("Highest test score: " + highest);
        System.out.println("Lowest test score: " + lowest);
        System.out.println("Average test score: " + average);




    }
}