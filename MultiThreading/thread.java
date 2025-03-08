public class thread
{
	public static void main(String[]args)
	{
	System.out.println("Inside main thread...");
	String name = Thread.currentThread().getName();
	System.out.println("The name of thread is:"+name);
	}	
}
