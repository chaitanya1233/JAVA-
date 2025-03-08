import java.util.*;
class Resources extends Thread{
	String os;
	int ram;
	int space;
	int time;
	public Resources(String os,int ram,int space,int time)
	{
	  this.os = os;
	  this.ram = ram;
	  this.space = space;
	  this.time = time;
	}
	synchronized public void run()
	{
	 try{
	  System.out.println("The user name of the Student is:"+Thread.currentThread().getName());
	  System.out.println("Installing "+os+"oprating system for "+Thread.currentThread().getName());
	  System.out.println("........................");
	  Thread.sleep(3000);
	  System.out.println("The error occured for"+Thread.currentThread().getName());
  	  System.out.println("........................");
	  Thread.sleep(3000);
	
	  System.out.println("........................");

	  System.out.println("Installing "+ram+"RAM on your system for"+Thread.currentThread().getName());
	  System.out.println("........................");

	  Thread.sleep(3000);
  	  System.out.println("........................");
	  System.out.println("........................");

          System.out.println("Allocating "+space+"GB of hardDisk for"+Thread.currentThread().getName());
	  System.out.println("........................");
  	  System.out.println("........................");
	  Thread.sleep(3000);
	  System.out.println("........................");
          System.out.println("Scheding your operating system for "+ time+"minutes for"+Thread.currentThread().getName());
	  System.out.println("........................");
  	  System.out.println("........................");
	  Thread.sleep(3000);
	}
	catch(Exception e)
	{
	 System.out.println("The error occured at "+Thread.currentThread().getName());
	}
    }
}
public class Synchronization
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of Operating system you want:");
		String os = new String(sc.nextLine());

		System.out.println("Enter the RAM you want in your system:");
		int ram = sc.nextInt();


		System.out.println("Enter the HardDisk space want:");
		int space = sc.nextInt();

		System.out.println("Enter time for which you want to access System:");
		int time = sc.nextInt();

		Resources r1 = new Resources(os,ram,space,time);
		r1.setName("Chaitanya");
		Resources r2 = new Resources(os,ram,space,time);
		r2.setName("Vishal");
		Resources r3 = new Resources(os,ram,space,time);
		r3.setName("Manoj");
		r1.start();
		r2.start();
		r3.start();
		

// Try to use implements Thread class and then try to synchronize the code .

		

	}
}