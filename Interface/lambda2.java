package Interface;

interface Rule {
    void msg(String message);
}

public class lambda2 {
    public static void main(String[] args) {
        Rule r = (msg) -> System.out.println("Rule updated...." + msg);
        r.msg("Being alone");
    }
}
