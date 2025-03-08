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
    public void fly() {
        System.out.println("Cargoplane fly at specific height");
    }

    public void carry() {
        System.out.println("CargoPlane carry heavy loads..");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Aeroplane cp = new CargoPlane();
        Aeroplane ap = new Aeroplane();
        cp.carry();
        cp.fly();
        System.out.println("--------------------");
        ap.carry();
        ap.fly();
    }
}
