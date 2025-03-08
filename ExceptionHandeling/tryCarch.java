package ExceptionHandeling;

import java.util.Scanner;

public class tryCarch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num1 = sc.nextInt();
        int num2 = 0;
        int result = 0;
        try {
            result = num1 / num2;
        } catch (Exception e) {
            System.out.println("Something error occured:" + e);
        }

        System.out.println("The result is :" + result);
    }
}
