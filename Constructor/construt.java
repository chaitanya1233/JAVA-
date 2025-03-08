package Constructor;

class demo {
    int a;
    int b;
    int c;
    int res = 0;

    public void seta(int a) {
        this.a = a;
    }

    public void setb(int b) {
        this.b = b;
    }

    public void setc(int c) {
        this.c = c;
    }

    public void add() {
        res = a + b;
    }

    public void addThree() {
        res = a + b + c;
    }

    public void show() {
        System.out.println("The result is:" + res);
    }
}

public class construt {
    public static void main(String[] args) {
        demo d = new demo();
        d.seta(30);
        d.setb(43);
        d.setc(-12);
        d.add();
        d.addThree();
        d.show();
    }
}
