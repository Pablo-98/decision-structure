//first thing to do is to use the scanner to extract the information from the user 

import java.util.Scanner;

public class weatherChecker {
    // write a program that takes a temp input and returns a decision on what to wear based on said weather 

    public static void main (String[] args)
    {
        // declare scanner input 
        Scanner input = new Scanner(System.in);
        // first, give the user a question
        System.out.println("Enter temperature");

        int temp = input.nextInt();

        if ( temp >= 80) {
            System.out.println("wear shorts and t shirt");

        }
        else {
            System.out.println("wear jacket bruh");
        }

        }

}