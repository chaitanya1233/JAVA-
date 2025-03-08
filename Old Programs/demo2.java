class father
{
    private String name ;
    int age;
    father(String name,int age)
    {
        this .name = name;
        this .age = age;
    }
    public void doWork()
    {
        System.out.println("Human is doing the work...");
    }

}
class Child extends father
{

    Child(String name, int age) {
        super(name, age);
    }  


}

public class demo2 {
    public static void main(String[] args) {
        father f = new Child("Chaitanya",23);
        f.doWork();
    }
}
