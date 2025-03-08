package Polymorphism;

class AeroPlane {
    public void fly() {
        System.out.println("AeroPlane is flying..");
    }

    public void takeOff() {
        System.out.println("AeroPlane requires a large runway..");
    }
}

class CargoPlane extends AeroPlane {
    public void fly() {
        System.out.println("CargoPlane is flying..");
    }

    public void takeOff() {
        System.out.println("CargoPlane requires a large runway..");
    }
}

class PassengerPlane extends AeroPlane {
    public void fly() {
        System.out.println("PassengerPlane is flying..");
    }

    public void takeOff() {
        System.out.println("PassengerPlane requires a large runway..");
    }
}

public class poly {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        // cp.fly();
        // cp.takeOff();
        // System.out.println("------------------------");

        // pp.fly();
        // pp.takeOff();
        AeroPlane ap;
        ap = cp;
        ap.fly();
        ap.takeOff();
        System.out.println("-------------------------");
        ap = pp;
        ap.fly();
        ap.takeOff();
    }
}
