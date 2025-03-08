public class jaggedArray {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 4, 5 },
                { 7, 8, 9 }
        };

        System.out.println("Elements of the array are :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
