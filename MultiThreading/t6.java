import java.util.Scanner;
class Calc implements Runnable
{
	int num1 = 10;
	int num2 = 20;	
	int result = 0;

	public void run()
	{
		System.out.println("Calculation task started....");
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number1 :");
		num1 = sc.nextInt();
		System.out.println("please enter number2 :");
		num2 = sc.nextInt();
		result = num1+num2;
		System.out.println("Result of calculation is:"+result);

		System.out.println("Calculation task started....");
		System.out.println("********************************************");

							
	}
}


class Message implements Runnable
{
	public void run()
	{
		System.out.println("Messenger has stated task to send message....");

		System.out.println("Being silent is not weakness...");
		System.out.println("Knowing notihing means not foolish person");
		System.out.println("try to maintain your mental peace");
		try
		{	
		 Thread.sleep(3000);
		}
		catch(Exception e)
		{	
		System.out.println("Exception occured....."+e);
		}	
		System.out.println("Don't allow peoples to disturb you and your aura");
		System.out.println("Silence speaks louder than words");
		System.out.println("Most expensive thing in the world is silence");
		System.out.println("No , all people's can't afford your words");

		System.out.println("Messenger has ended task to send message...");
							
	}
}
public class t6
{
	public static void main(String[]args)
	{
		System.out.println("hello I am parent Thread");
		Calc c = new Calc();
		Message msg = new Message();	
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(msg);			
		t1.start();
		t2.start();
			
	}
}