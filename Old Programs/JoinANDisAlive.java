// program for the process state....

class Boss implements Runnable
{
    public void run()
    {
        System.out.println("Child thread has started......");
        for(int i=0;i<5;i++)
        {
            System.out.println("Focus on yourself......");
        }
        System.out.println("The Child thread has ended execution.....");
    }
}
public class JoinANDisAlive {
    public static void main(String[] args) {
        System.out.println(" Main Thread has started execution...");
        Boss b =  new Boss();
        Thread t = new Thread(b);
        t.start();
        try
        {
            t.wait(3000);
        }
        catch(Exception e)
        {
            System.out.println("Errorr.......:"+e);
        }
        
        System.out.println("Is interupted:"+t.isInterrupted());
        System.out.println("Is alive :"+t.isAlive());
        System.out.println("Is waiting ..."+t.isVirtual());
        System.out.println("Main thread has ended execution...");
    }
}
