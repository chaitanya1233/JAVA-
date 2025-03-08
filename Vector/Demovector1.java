import java.util.*;
class Demovector1
{
	public static void main(String[]args)
	{
	System.out.println("The vectors :");
	Vector v = new Vector();
	System.out.println("The size of the vector is :"+v.size());
	System.out.println("The capacity of the vector is:"+v.capacity());
	v.add(3);
	v.add(4);
	v.add(3.14f);
	v.add(new Integer(44));
	System.out.println("Elements in the vector are :"+v);

	System.out.println("The element at index  3 is :"+v.elementAt(3));
	System.out.println("The element at index  3 is :"+v.get(3));
	System.out.println("removeElement() :"+v.removeElement(44));

	System.out.println("setElementAt(index,object) :"+v.setElementAt("Chaitanya",2));
	System.out.println("Elements in the vector are :"+v);


	}
}