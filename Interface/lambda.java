package Interface;

interface Dost {
    void doing();

}

public class lambda {
    public static void main(String[] args) {
        // Dost obj = new Dost() {
        // public void doing() {
        // System.out.println("I am doing my work....");
        // }
        // };

        // obj.doing();
        Dost d = () -> System.out.println("I am doing my work...");
        d.doing();

    }
}
