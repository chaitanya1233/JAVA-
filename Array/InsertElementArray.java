package Array;

import java.util.Scanner;

public class InsertElementArray {
    public static void in(int arr[], int idx, int ele) {
        // Make the space for inserting the element
        for (int i = 0; i < idx; i++) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = ele;

        for (int i = 0; i < arr.length; i++) {

        }
    }

    public static void main(String[] args) {
        int arr[] = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("Enter at which index you want to insert an element:");
        int idx = -1;
        int ele = 23;
        in(arr, idx, ele);
        System.out.println("Elements of the array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
