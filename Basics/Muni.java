//  class 
class human {
    // Attributes of a class
    int age = 21;
    String name = "Chaitanya";

    // properties of the class
    public void sleep() {
        System.out.println("I sleep 8 hours daily..");
    }

    public void Dance() {
        System.out.println("I can dance also....");
    }
}

public class Muni {
    public static void main(String[] args) {
        System.out.println("I am creating a human class");
        human h = new human();
        System.out.println("Object is created Succesfully...");
        System.out.println("Age is :" + h.age);
        System.out.println("Name is:" + h.name);
        h.Dance();
        h.sleep();
    }
}
