package Conditionals;

import java.util.Scanner;

public class YoungOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current age : ");
        int age = sc.nextInt();
        System.out.println("You entered: " + age);

        if (age >= 18 && age <= 60) {
            System.out.println("You are young...");
        } else if (age > 60 && age < 100) {
            System.out.println("You are old...");
        }
        if (age > 0 && age < 18) {
            System.out.println("You are kid...");
        }
        if (age >= 13 && age < 18) {
            System.out.println("You are teenager...");
        }
    }
}
