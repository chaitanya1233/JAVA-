class Calculation extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

class Message extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}

public class threadsy3 {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        Message msg = new Message();
        c.start();
        msg.start();
    }
}
