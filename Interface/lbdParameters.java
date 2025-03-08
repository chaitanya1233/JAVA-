package Interface;

interface Man {
    void info(String name, int age, String prof);
}

public class lbdParameters {
    public static void main(String[] args) {
        // Man m = new man() {
        // public void info(String name, int age, String prof) {
        // System.out.println("My age is:" + age);
        // System.out.println("My name is :" + name);
        // System.out.println("I am working as an:" + prof);
        // }
        // };
        Man m = (name, age, prof) -> {
            System.out.println("My age is:" + age);
            System.out.println("My name is :" + name);
            System.out.println("I am working as an:" + prof);
        };
        m.info("Chaitanya", 21, "Senior AI Scientist");
    }
}
