class Student1
{
	int age;
	String name;
	// Constructor to initialize the instance variables.
	public Student1(int age,String name)
	{
		SYstem.out.println("This is parent class constructor.....");
		this.age =age;
		this.name = name;
	}
	public void disp()
	{
	System.out.println("Age is :"+age);
	System.out.println("Name is :"+name);	
	}
}
class Student2 extends Student1
{
	public Student2(int age,String name)
	{
		super(age,name);
	}
}
public class demoInher
{
	public static void main(String[]args)
	{	
	System.out.println("**Concept of the Inheritance...**");
	int age = Integer.parseInt(args[0]);
	String name = args[1];
	Student2 s2 = new Student2(age,name);
	s2.disp();
	}
}
