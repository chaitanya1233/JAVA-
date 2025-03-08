package Oprators;

public class Inc {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a++ + --a + b++ + ++b + a-- + --a + --b + b--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
