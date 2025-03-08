final class Animal
{
	final void sleep()
	{
		System.out.println("Inside sleep of Animal class ..");	
	}
        public void show()
	{
		System.out.println("Inside show..");	
	}
}
	
class Dog //extends Animal
{
	/*public void show()
	{
		System.out.println("Inside show of Dog class ...");
	}
         public void sleep()
	{
		System.out.println("Inside sleep of Dog class");
	} */

}

class DemoFinalKey
{
	public static void main(String[]args)
	{
			
	 int age = 32 ;
	 final float pi = 232.433f;
	
	System.out.println(age++);
	//stem.out.println(pi++);
	Dog d = new Dog();
	//d.show();	
	//d.sleep();

	
	}
}