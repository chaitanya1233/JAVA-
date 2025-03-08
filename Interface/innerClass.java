package Interface;

class A {
    public void show() {
        System.out.println("Inside show class");
    }

    class B {
        public void call() {
            System.out.println("Inside call class");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj2 = obj.new B();
        obj2.call();
        obj.show();
    }
}
