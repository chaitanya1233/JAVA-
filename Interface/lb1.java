package Interface;

interface Animal {
    void call();
}

public class lb1 {
    public static void main(String[] args) {
        Animal obj = () -> System.out.println("I am calling...");
        obj.call();
    }
}
