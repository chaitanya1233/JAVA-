class Animal
{
	public void eat()
	{
	System.out.println("Animal is eating....");
	}
	public void sleep()
	{
	System.out.println("Animal is sleeping....");
	}
	public void search()
	{
	System.out.println("Animal is Searching....");
	}
}
class Dog extends Animal
{
}
public class SinglesLevelInhr
{
	public static void main(String[]args)
	{
		Animal a = new Dog();
		a.eat();
		a.sleep();
		a.search();
	}
}