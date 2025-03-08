public class t2 
{
	public static void main(String[]args)
	{
		System.out.println("Inside main Thread");
		System.out.println("Name of thread is:"+Thread.currentThread().getName());
		System.out.println("Default priority of the thread 				        is:"+Thread.currentThread().getPriority());
		System.out.println("****************************************************");
	System.out.println("Data after updation.........");

	Thread t = Thread.currentThread();
	t.setName("Chaitanya");
	t.setPriority(3);

		System.out.println("Name of updated thread is :"+t.getName());
		System.out.println("priority of the updated thread is:"+t.getPriority());
	
	



	}
}