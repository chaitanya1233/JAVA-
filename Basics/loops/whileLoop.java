package loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter boolean value:");
        boolean flag = sc.nextBoolean();
        while (flag == true) {
            System.out.println("Hello Chaitanya");
        }
    }
}
