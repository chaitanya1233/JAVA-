package ExceptionHandeling;

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class CostomException {
    public static void main(String[] args) {
        int n = 23;
        int m = -2;
        int o = 0;
        try {
            if (m < 0) {
                MyException e = new MyException("Negative number");
                throw e;
            } else {
                o = m / n;
            }

        } catch (Exception e) {
            System.out.println("Enter a valid positive number.");
        }
        System.out.println(0);
    }
}
