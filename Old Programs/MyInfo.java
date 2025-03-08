class Chaitanya{
int age;
String name ;
String college;
public Chaitanya(int age,String name,String college)
{
    this.age = age;
    this.name = name;
    this.college = college;
    System.out.println("Constructor initialized successfully....");
}
public void info()
{
    System.out.println("My name is:"+name);
    System.out.println("My age is :"+age);
    System.out.println("My college name is :"+college);
}
}
public class MyInfo {
    public static void main(String[] args) {
      Chaitanya c = new Chaitanya(19,"Chaitanya Jagannath Kale","Government Polytechnic Chhtrapati Sambhajinagar");
      c.info();        
    }
}
