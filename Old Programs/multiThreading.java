import java.util.Scanner;
class MyClass extends Thread 
{
    Scanner sc = new Scanner(System.in);
        int num1 ;
        int num2 ;
        int result;
    public void run()
    {
      String name = Thread.currentThread().getName();
      if(name.equals("Calc"))
      {
        Calc();
      }
      else 
      {
        message();
      }

    }
    public void Calc()
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
    public void message()
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
public class multiThreading {
    public static void main(String[] args) {
        System.out.println("The main thread has started...");
        MyClass m1 = new MyClass();
        MyClass m2 =  new MyClass();
        m1.setName("Calc");
        m2.setName("message");
        m1.start();
        m2.start();
    }
}
