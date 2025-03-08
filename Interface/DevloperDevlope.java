package Interface;

interface Computer {
    public void buildApps();
}

class Laptop implements Computer {
    public void buildApps() {
        System.out.println("I am building app on Laptop");
    }
}

class Desktop implements Computer {
    public void buildApps() {
        System.out.println("I am building app on Desktop");
    }
}

class Devloper {
    public void compilerCode(Computer l) {
        System.out.println("Devloper is ready to build app..");
        l.buildApps();
    }
}

public class DevloperDevlope {
    public static void main(String[] args) {
        Devloper dev = new Devloper();
        Laptop l = new Laptop();
        Desktop d = new Desktop();
        dev.compilerCode(d);
    }
}
