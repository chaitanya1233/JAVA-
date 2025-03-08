class MyClass extends Thread
{
    public void run()
    {
        System.out.println("Hello i am child thread.......");
    }
}
public class threads1 {

    public static void main(String[] args) {
      System.out.println("Hello i am parent thread...");
      Thread t = new MyClass();
      t.start();
      System.out.println("Name of thread is"+t.getName());
      System.out.println("State is:"+t.getState());
      t.setPriority(6);
      System.out.println("Prority is:"+t.getPriority());
    }
    
}
