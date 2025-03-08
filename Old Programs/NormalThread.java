import java.util.Scanner;
class calc
{
    Scanner sc = new Scanner(System.in);
        int num1 ;
        int num2 ;
        int result;
        public void run()
        {
            System.out.println("Calculation has started .....");
            System.out.println("Enter number 1 :");
            num1 = sc.nextInt();
            System.out.println("Enter number 2:");
            num2 = sc.nextInt();
            result = num1+num2;
            System.out.println("the result is:"+result);
            System.out.println("The calculation task has ended....");
        }
    }
    class Message
    {
        public void run()
        {
            System.out.println("Message task has started ......");
            System.out.println("weak persons focus on womens...");
            System.out.println("Womens focus on strong man");
            System.out.println("So, focus on yourself");
            System.out.println("I am diferent , my path is different , my aim is different , so no one can  be compared with me ");
            System.out.println("This is the power of your mind ");
            System.out.println("Message task has ended.......");
        }
    }
public class NormalThread {
    public static void main(String[] args) {
        /// All the things will happen normally
        calc c = new calc();
        c.run();

        Message msg = new Message();
        msg.run();
    }
}
