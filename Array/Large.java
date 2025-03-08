package Array;

import java.util.Scanner;

public class Large {
    public static int LagrestEle(int arr[]) {
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                x = arr[i];
            } else {
                continue;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = LagrestEle(arr);
        System.out.println("The largest element of the array is:" + x);
    }
}
