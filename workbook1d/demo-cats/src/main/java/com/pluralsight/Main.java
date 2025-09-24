package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

   // int age = 23;
   // double weight = 60.5;
   // char firstletter = 'z';
   // boolean isHappy = false;
   // String favoriteColor = "Green";
   // String favoriteArtist = "Kendirk Lamar";
   // String ateBreakfast = "Nope";
   // String firstName = "Zak";
   // String lastName = "Khan";
   // String fullName = firstName + " " + lastName;

   // System.out.println(fullName);
    //System.out.println(isHappy);
   // System.out.println(favoriteArtist);
    //System.out.println(ateBreakfast);
    //System.out.println(age);
   // System.out.println(favoriteColor);
       //if(isHappy)
       // {
            //System.out.println("Glad to hear that");
       // }// else
       // {
           // System.out.println("Change it");
       // }
        boolean isHappy = true;
        boolean hadBreakfast = false;
                if (isHappy && hadBreakfast)
        {
            System.out.println("Nice Job!");
        } else if(isHappy && !hadBreakfast)
        {
            System.out.println("You could be hungry!");
        } else if(!isHappy && !hadBreakfast)
        {
            System.out.println("Do something about that!!");
        }







    }
}