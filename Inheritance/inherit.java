package Inheritance;

class Aeroplane {
    public void fly() {
        System.out.println("Aeroplane fly at speific height...");
    }

    public void carry() {
        System.out.println("Aeroplace carry passengers.....");
    }
}

class CargoPlane extends Aeroplane {

}

public class inherit {
    public static void main(String[] args) {
        Aeroplane a = new CargoPlane();
        a.carry();
        a.fly();
    }
}
