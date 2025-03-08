package Constructor;

class Student {
    int age;
    String name;

    // Setter to set name and age
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters to get name and age
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // method to display the name and age of student
    public void disp() {
        System.out.println("The name of the student is :" + name);
        System.out.println("The age of the student is:" + age);
    }

}

public class setttersGetters {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(21);
        s.setName("Chaitanya");
        // int age = s.getAge();
        // String name = s.getName();
        // System.out.println("The name of the student is :" + name);
        // System.out.println("The age of the student is:" + age);
        s.disp();
    }
}
