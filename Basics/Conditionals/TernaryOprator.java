package Conditionals;

import java.util.Scanner;

public class TernaryOprator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current age : ");
        int age = sc.nextInt();

        // Ternary oprators in java
        // This is wrong practice of doing the code for the Ternary oprator in java
        // (age>=18) ? System.out.println("You can vote...");:System.out.println("You
        // cannot vote");

        // Right way is :
        // (age>=18) ? "You are valid voter" : "You are not valid voter";

        String conclusion = (age >= 18) ? "You are valid voter" : "You are not valid voter";
        System.out.println(conclusion);

        // For example to run.....
        // int a = 2;
        // int b = 4;
        // int x = (a > b) ? a : b;
        // System.out.println(x);

    }
}
