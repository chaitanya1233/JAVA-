package OPPS;

class Student {
    // Instance Variables ......
    int age;
    String name;
    boolean flag;
    float height;
}

public class InstanceVar {
    public static void main(String[] args) {

        // Local Variables
        int age = 21;
        String name = "Chaitanya";
        System.out.println(age);
        System.out.println(name);

        // Call to the instance varibles ,..
        Student s = new Student();
        int instAge = s.age;
        String instName = s.name;
        System.out.println("The name is :" + instName);
        System.out.println("The age is:" + instAge);
        System.out.println("The valur of flag is:" + s.flag);
        System.out.println("The default height is :" + s.height);

        // Default value for the instance variables of integer type is 0 and String is
        // null
        // for boolean is false
        // for float is 0.0
    }
}
