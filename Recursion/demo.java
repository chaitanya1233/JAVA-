package Recursion;

public class demo {
    public static int add(int n) {
        int res = 0;
        if (n < 0) {
            return res;
        } else {
            res = n + add(n - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int res = add(100);
        System.out.println("The sum of n natural number is:" + res);
    }
}
