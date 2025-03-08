interface Human {
    public void show();
}

public class AnnonymusClass {
    public static void main(String[] args) {
        Human hm = new Human() {
            public void show() {
                System.out.println("Inside show");
            }
        };
        hm.show();
    }
}
