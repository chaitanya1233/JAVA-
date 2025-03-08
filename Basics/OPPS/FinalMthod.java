package OPPS;

class Student {
    int age;
    String name;

    final public void show() {
        System.out.println("I am in show of Student class");
    }
}

class Stduent2 extends Student {

    // Method overriding is not possible at all
    // public void show() {
    // System.out.println("I am inside show of Student2 class");
    // }
}

public class FinalMthod {
    public static void main(String[] args) {
        Stduent2 s2 = new Stduent2();
        s2.show();
    }
}
