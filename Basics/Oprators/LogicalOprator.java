package Oprators;

public class LogicalOprator {
    public static void main(String[] args) {
        // logical oprator : and(&&) , or(||) , not(!)

        System.out.println("AND (&&) oprators ....");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(false && false);

        System.out.println("--------------------");

        System.out.println("OR(||) oprators .....");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(false || true);

        System.out.println("-----------------------");

        System.out.println("NOT(!) oprators ....");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("-------------------------");

        System.out.println(true == false);
        System.out.println(false == true);
    }
}
