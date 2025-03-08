package Interface;

import java.util.Scanner;

class Student {
    int age;
    String name;

    // This is parent class constructor ......
    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void study() {
        System.out.println("Student study 5 hours a day..");
    }

    public void sleep() {
        System.out.println("Student also take adequet amount of sleep..");
    }

    public void disp() {
        System.out.println("Name of student is:" + name);
        System.out.println("Age of studnt is:" + age);
    }
}

class Student2 extends Student {
    Student2(int age, String name) {
        // Call to parent class constructor....
        super(age, name);
    }

}

public class Final_methds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        String name = "Chaitanya";
        System.out.println();
        Student2 s2 = new Student2(age, name);
        s2.sleep();
        s2.study();
        s2.disp();

    }
}
