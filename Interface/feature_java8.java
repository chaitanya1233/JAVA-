package Interface;

interface A {
    // public void show();
    public void call();

    public void show();

    public void config();

}

// This is a Normal Interface
interface B {
    // No need to specify public --> by default it is public .....

    public void calc();

    public void msg();
}

class C implements A, B {
    public void show() {
        System.out.println("Inside show");
    }

    public void call() {
        System.out.println("Inside call");
    }

    public void msg() {
        System.out.println("Inside msg");
    }

    public void config() {
        System.out.println("inside config");
    }

    public void calc() {
        System.out.println("inside calc");
    }

}

public class feature_java8 {
    public static void main(String[] args) {
        C obj = new C();
        obj.calc();
        obj.call();
        obj.config();
        obj.msg();
        obj.show();
    }
}
