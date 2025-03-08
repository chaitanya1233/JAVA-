package ExceptionHandeling;

import java.util.Scanner;

public class ultipleCatch {
    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 0;
        int res = 0;
        // int arr[] = new int[5];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter elements of the array:");
        // for(int i =0;i<arr.length;i++)
        // {
        // arr[i]=sc.nextInt();
        // }
        int arr[] = { 3, 4, 52, 5, 1 };
        try {
            System.out.println(arr[5]); // ---> Error occured in this line
            res = num1 / num2; // --> This line is also error causing but still not called...due to
                               // counter/cursor has exit .
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero :" + e);
        } catch (ArrayIndexOutOfBoundsException aib) {
            System.out.println("Index out of bound exception:" + aib);
        }
        System.out.println("The result is:" + res);

    }
}
