package Interface;

interface Computer {
    public void CompileCode();
}

class laptop implements Computer {
    public void CompileCode() {
        System.out.println("OPPS, you have got 4 errors...");
    }
}

class Desktop implements Computer {

    public void CompileCode() {
        System.out.println("OPPS, you have got 4 errors.., but faster....");

    }
}

class Devloper {
    public void BuidApps(Computer c) {
        System.out.println("Devloper is devloping app..");
        c.CompileCode();
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {
        Computer l = new laptop();
        Computer d = new Desktop();
        Devloper dev = new Devloper();
        dev.BuidApps(d);
    }
}
