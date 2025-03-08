public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        // Logic 1

        // int temp;
        // temp = a;
        // a = b;
        // b = temp;

        // Logic 2
        // a = a + b;
        // b = a - b;
        // a = a - b;

        // Logic 3
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
