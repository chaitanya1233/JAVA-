import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of the array are : ");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
