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

class PssengerPlane extends CargoPlane {

}

public class MuptiLevelInher {
    public static void main(String[] args) {
        Aeroplane cp = new CargoPlane();
        CargoPlane pp = new PssengerPlane();
        cp.carry();
        cp.fly();
        System.out.println("------------------------------");
        pp.carry();
        pp.fly();
    }
}
