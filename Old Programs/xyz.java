class Animal
{
 public void eat()
 {
   System.out.println("Animal is eating...");
 }
 public void sleep()
 {
   System.out.println("Animal is sleeping...");
 }
}
public class xyz
{
 public static void main(String[]args)
 {
   Animal obj = new Animal();
   obj.eat();
   obj.sleep();
 }
}