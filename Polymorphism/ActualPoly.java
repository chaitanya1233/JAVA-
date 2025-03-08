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

    // Core inplementation of the Polymorphism
    public void poly(AeroPlane ap) {
        ap.fly();
        ap.takeOff();
    }
}

public class ActualPoly {
    public static void main(String[] args) {
        PassengerPlane pp = new PassengerPlane();
        CargoPlane cp = new CargoPlane();
        pp.poly(pp);
        pp.poly(cp);
    }
}
