import java.util.Scanner;
class  calc1 extends Thread 
{
        Scanner sc = new Scanner(System.in);
        int num1 ;
        int num2 ;
        int result;
        public void run()
        {
            System.out.println("Calculation has started .....");
            System.out.println("Enter number 1 :");
            String name=Thread.currentThread().getName();
            System.out.println("Name  of the t1 Thread is :"+name);
            System.out.println("Priority of t1 Thread is :"+Thread.currentThread().getPriority());
            try
            {
                Thread.currentThread().wait();
            }
            catch(Exception e)
            {
                System.out.println("Error occured in t1 thread......");
            }
            num1 = sc.nextInt();
            System.out.println("Enter number 2:");
            num2 = sc.nextInt();
            result = num1+num2;
            System.out.println("the result is:"+result);
            System.out.println("The calculation task has ended....");
        }
    }
    class Message1 extends Thread 
    {
        public void run()
        {
            System.out.println("Message task has started ......");
            System.out.println("weak persons focus on womens...");
            try
            {
                Thread.currentThread().wait();
            }
            catch(Exception e)
            {
                System.out.println("Error occured in t2 thread......");
            }
            System.out.println("Womens focus on strong man");
            System.out.println("So, focus on yourself");
            System.out.println("I am diferent , my path is different , my aim is different , so no one can  be compared with me ");
            System.out.println("This is the power of your mind ");
            System.out.println("Message task has ended.......");
        }
    }
public class ThreadImp {
    public static void main(String[] args) {
        /// All the things will happen normally
        Thread t1 = new calc1();
        t1.start();

        Thread t2 = new Message1();
        t2.start();
    }
}

