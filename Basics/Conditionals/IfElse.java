package Conditionals;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current age : ");
        int age = sc.nextInt();
        System.out.println("You entered: " + age);

        if (age >= 18) {
            System.out.println("You can vote now,....");
        } else {
            System.out.println("You cannot vote....");
        }
    }
}
