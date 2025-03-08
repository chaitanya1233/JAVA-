package Interface;

abstract class demo {
    int age = 21;
    String name = "Chaitanya";

    public abstract void show();

    public abstract void config();
}

class demo2 extends demo {
    public void show() {
        System.out.println("This is show time");
    }

    public void config() {
        System.out.println("This is configuration time");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        demo2 d = new demo2();
        d.show();
        d.config();
        System.out.println(d.age);
        System.out.println(d.name);
    }
}
