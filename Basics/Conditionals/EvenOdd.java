package Conditionals;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current age : ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("The given number is even positive..");
            } else {
                System.out.println("The given number is odd but positive....");
            }
        } else {
            if (num % 2 == 0) {
                System.out.println("The given number is even negative....");
            } else {
                System.out.println("The given number is odd but negative");
            }
        }
    }
}
