public class ThreadsOne {
    public static void main(String[] args) {
        System.out.println("Name of the thread is:" + Thread.currentThread().getName());
        System.out.println("Priority of the Thread is:" + Thread.currentThread().getPriority());
        System.out.println("The class name is:" + Thread.currentThread().getClass());
    }
}
