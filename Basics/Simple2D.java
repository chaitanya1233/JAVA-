public class Simple2D {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 4, 5 },
                { 7, 8, 9, 10 }
        };
        System.out.println("The size of the array is:" + arr.length);
        System.out.println("The elements of the array are:");
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; i < 3; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // for each loop
        for (int x[] : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
