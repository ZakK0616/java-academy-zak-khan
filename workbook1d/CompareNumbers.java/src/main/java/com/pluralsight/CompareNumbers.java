package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CompareNumbers {
    public static void main(String[] args) {

        System.out.println("isEven(2): " + isEven(2)
                + "\nisEven(5): " + isEven(5));

    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }




    }
}