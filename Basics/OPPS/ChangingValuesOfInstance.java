package OPPS;

class Student {
    // Instance Variables ......
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class ChangingValuesOfInstance {
    public static void main(String[] args) {
        Student s1 = new Student(21, "Chaitnaya");
        // System.out.println("The name is:" + s.name);
        // System.out.println("The age is:" + s.age);
    }
}
