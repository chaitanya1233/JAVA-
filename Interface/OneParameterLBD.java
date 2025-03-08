interface demo {
    public void call(int age,String name);
}

public class OneParameterLBD {
    public static void main(String[] args) {
        demo d = (age,name) -> 
	{
		System.out.println("Age is:" + age);
		System.out.println("Name is:" + name);
	};
        d.call(21,"Chaitanya Jagannath Kale");
    }
}
