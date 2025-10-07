package com.pluralsight;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String [] quotes =  {
            "1. Believe you can and you're halfway there.",
                    "2. The only limit to our realization of tomorrow is our doubts of today.",
                    "3. Don't watch the clock; do what it does. Keep going.",
                    "4. Success is not the key to happiness. Happiness is the key to success.",
                    "5. In the middle of every difficulty lies opportunity.",
                    "6. The best way to get started is to quit talking and begin doing.",
                    "7. What we think, we become.",
                    "8. The harder you work for something, the greater you’ll feel when you achieve it.",
                    "9. Dream big and dare to fail.",
                    "10. If you want to lift yourself up, lift up someone else."
        };
            Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int choice = scanner.nextInt();

        System.out.println("Your quote: " + quotes[choice - 1]);




    }
}