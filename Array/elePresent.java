package Array;

import java.util.Scanner;

public class elePresent {
    public static boolean demo(int arr[]) {

        int x = 4;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag = true;
                break;
            } else {
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean x = demo(arr);

        if (x == true) {
            System.out.println("The element is present in this array,....");
        } else {
            System.out.println("The element is not presnet ....");
        }
        System.out.println("Elements of the array are : ");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
