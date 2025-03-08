import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println("Elements of the array are :");
        for (int i[] : arr) {
            for (int x : i) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
