package Interface;

interface Home {
    default public void sweet(String name, int years) {
        System.out.println("This is default interface...");
        System.out.println("This is " + years + " old home");
        System.out.println("Name of the home is " + name);
    }
}

public class TwoParameterInterface {
    public static void main(String[] args) {
        Home h = new Home() {
        };
        h.sweet("Chaitanya", 34);
    }
}
