package Interface;

interface A {
    int age = 21;
    String name = "Chaitanya";

    public void show();

    public void config();
}

public class PsudoImplementation {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Inside show method...");
            }

            public void config() {
                System.out.println("Inside config method....");
            }
        };
        obj.show();
        obj.config();
        System.out.println("Name is:" + A.name);
        System.out.println("Age is:" + A.age);
    }
}
