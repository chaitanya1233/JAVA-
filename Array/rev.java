package Array;

public class rev {
    public static void rev(int arr[]) {
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7, 8 };
        rev(arr);
        System.out.println("The elements of the array are:");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
