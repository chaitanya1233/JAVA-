class Task1 extends Thread
{
	public void run()
	{
		for(int i = 0;i<100;i++)
		{
			System.out.println("Hello Chaitanya.....");
			try
			{
			Thread.sleep(1000);
		        }
		        catch(Exception e)
		        {
			System.out.println("Error is occured in task 1 ....");
		        }
	       }
	}
	
}
class Task2 extends Thread
{
	public void run()
	{
		for(int i = 0;i<100;i++)
		{
			System.out.println("***");
			try
			{
			Thread.sleep(2000);
		        }
		        catch(Exception e)
		        {
			System.out.println("Error is occured in task 2....");
		        }

		}

	}
}
class Aeroplane extends Thread
{
	public void show()
	{
		System.out.println("I am in Aerolane...");
	}

	
	// Main method of AeroPlane class 

	public static void main(String[]args)
	{
		System.out.println("Yes it is possible....");
		System.out.println("Lets try to achive multiThreading....");
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		t1.start();
		t2.start();
	}

}
class FighterJet extends CargoPlane
{

}
// Main class file 
public class MultiLevelInhr
{
	public static void main(String[]args)
	{
		FighterJet fj = new FighterJet();
		fj.show();	
	}
}