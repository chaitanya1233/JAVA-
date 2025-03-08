package Array;

import java.util.Scanner;

public class CountElements {
    public static int demo(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to with you want to compare :");
        int x = sc.nextInt();
        int count = demo(arr, x);
        System.out.println("The number of elements greater than x are:" + count);
    }
}
