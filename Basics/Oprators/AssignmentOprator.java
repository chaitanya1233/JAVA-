package Oprators;

public class AssignmentOprator {
    public static void main(String[] args) {
        int a = 3;
        int age = 21;

        int m1, m2, m3, m4;
        m1 = 23;
        m2 = 45;
        m3 = 24;
        m4 = 56;
        System.out.println(m1 + m2 + m3 + m4);

        m1 = m2 = m3 = m4 = 100;
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m1 == m2);
        System.out.println(m3 == m4);
        System.out.println(m1 == m3);
        System.out.println(m2 == m4);
        System.out.println((m1 == m2) == (m3 == m4));
    }
}
