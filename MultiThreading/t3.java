class MyThread extends Thread
{
	public void run()
	{				
		System.out.println("Hello I  am child thread of MyThread class ");
	}
}
public class t3
{
	public static void main(String[]args)
	{
		System.out.println("hello I am parent Thread");

		System.out.println("Inside main Thread");
		MyThread t = new MyThread();
		t.start();
	}
}