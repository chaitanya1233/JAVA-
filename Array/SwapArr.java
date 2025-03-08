package Array;

public class SwapArr {
    public static void Swap(int arr[]) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4 };
        Swap(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
