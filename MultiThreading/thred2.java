public class thred2 {
    public static void main(String[] args) {
        System.out.println("The name of the thread is:" + Thread.currentThread().getName());
        System.out.println("priority of the thread is::" + Thread.currentThread().getPriority());
        Thread.currentThread().setName("OM DANGARE");
        System.out.println("The name of the current thread is :" + Thread.currentThread().getName());
    }
}
