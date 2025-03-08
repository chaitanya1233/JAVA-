package Interface;

interface X {
    public void show();
}

interface you {
    public void call();
}

class Z implements X, you {
    public void show() {
        System.out.println("Inside show");
    }

    public void call() {
        System.out.println("Indside call");
    }
}

public class MutipleInheritance {
    public static void main(String[] args) {
        Z obj = new Z();
        obj.call();
        obj.show();
    }
}
