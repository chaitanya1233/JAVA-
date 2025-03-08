package ExceptionHandeling;

public class throwKeyqord {
    public static void main(String[] args) {
        int n = 23;
        int m = -2;
        int o = 0;
        try {
            if (m < 0) {
                Exception e = new Exception("Negative number");
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
