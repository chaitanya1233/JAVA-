package Array;

import java.util.Scanner;

public class secLagrest {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            for()
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("The maximum number from the array is:" + max);
    }
}
