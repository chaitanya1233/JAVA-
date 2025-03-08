package Constructor;

class Msg {
    public Msg() {
        System.out.println("Call to the parent class constructor....");
    }
}

class Clac {
    public Clac() {
        super();
        System.out.println("Call to the child class constructor.....");
    }
}

public class CosntrExeInher {
    public static void main(String[] args) {
        Clac c = new Clac();
    }
}
