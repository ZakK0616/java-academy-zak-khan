package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 81; i >= 1; i--) {
            if (i == 1) {
                System.out.println(i + ". more day left at Year Up Code Academy");
            } else {
                System.out.println(i + ". more days left at Year Up Code Academy");
            }
        }
    }
}