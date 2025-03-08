package Conditionals;

import java.util.Scanner;

public class YoungOrNotLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current age : ");
        int age = sc.nextInt();
        System.out.println("You entered: " + age);

        if (age > 0 && age < 100) {
            if (age > 0 && age < 13) {
                System.out.println("You are kid.....");
            } else if (age >= 13 && age < 18) {
                System.out.println("You are teenager....");
            } else if (age >= 18 && age < 60) {
                System.out.println("You are young....");
            } else {
                System.out.println("You are aged.....");
            }
        } else {
            System.out.println("Please enter valid age ....");
        }
    }
}
