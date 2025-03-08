package ExceptionHandeling;

class Demo {
    public void a() throws Exception {
        b();

        // try {
        // b();
        // } catch (Exception e) {
        // System.out.println("Error occured:" + e);
        // }
    }

    public void b() throws Exception {
        int num1 = 10;
        int num2 = 0;
        int result = 0;
        result = num1 / num2;
        System.out.println("The result is :" + result);
    }
}

public class HandellingVSducking {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            d.a();
        } catch (Exception e) {
            System.out.println("Error occured:" + e);
        }

    }
}
