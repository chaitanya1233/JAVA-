package ExceptionHandeling;

import java.util.*;
import java.util.Scanner;

public class tryWithFinnaly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = 0;
        try {
            n = sc.nextInt();
            System.out.println("All resources cloed..");
        } catch (Exception e) {
            System.out.println("Please , enter a number.");
        }
        // } finally {
        // sc.close();
        // System.out.println("All resources cloed..");
        // }
        System.out.println("Value of n is :" + n);
        System.out.println("Program ended..");
    }
}
