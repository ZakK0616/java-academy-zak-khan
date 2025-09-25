package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Movie {
    public static void main(String[] args) {

        String movieTitle = "Demon Slayer Infinity Castle Part 2";
        int numberFriends = 7;
        int me = 1;
        double pizzaPrice = 5.99;
        boolean hasPopcorn = true;
        double totalPrice = numberFriends * pizzaPrice;;

        System.out.println("We're watching " + movieTitle + " with " + numberFriends + " friends ");
        System.out.println("Pizza cost for me and my friends the pizza cost $" + pizzaPrice + " each");
        System.out.println("Popcorn?" + hasPopcorn);
        System.out.println("Pizza cost for me and my friends the pizza cost $" + totalPrice);




    }
}