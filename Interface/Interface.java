package Interface;

interface A {
    int age = 21;
    String name = "Chaitanya"; // static and final

    void show();

    void config();
}

class B implements A {
    public void show() {
        System.out.println("Inside show");
    }

    public void config() {
        System.out.println("Inside Config");
    }
}

public class Interface {
    public static void main(String[] args) {

        // Not valid for interface
        // A obj;
        // obj = new A();
        // A obj = new A();

        B obj = new B();
        obj.config();
        obj.show();

        // Instance variables can be called directly....
        System.out.println("My name is:" + A.name);
        System.out.println("My age is" + A.age);

    }
}
