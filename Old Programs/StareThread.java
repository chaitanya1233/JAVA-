class Me implements Runnable
{
    public void run()
    {
        try {
            Thread.sleep(3000);

        }
        catch (Exception err) {
            System.out.println("The error occured : "+err.getMessage());
        }
        String name=Thread.currentThread().getName();
        System.out.println("The name of the child thread is :"+name);
        System.out.println("Child thread has completed task ...");
    }

}
public class StareThread {
    public static void main(String[] args) {
        System.out.println("Main thread has started...");
        Me m = new Me();
        Thread t = new Thread(m);
        t.start();
    }
}
