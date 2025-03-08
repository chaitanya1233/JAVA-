class Calc extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello Chaitanya");
        }
    }
}

class Msg extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello Arya");
        }
    }
}

public class ThreadsTwo {
    public static void main(String[] args) {
        System.out.println("This is main thread...");
        Calc c = new Calc();
        Msg m = new Msg();
        c.start();
        m.start();
    }
}
