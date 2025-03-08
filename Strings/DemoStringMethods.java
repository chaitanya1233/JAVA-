class DemoFinalKey
{
	public static void main(String[]args)
	{
		String s1  = new String("Chaitanya");
		System.out.println("The char at index 3 is :"+s1.charAt(3));

		System.out.println("The substring of Chaitanya from index 1 to 5 is :"+ 		s1.substring(1,6));

		System.out.println("The substring of Chaitanya from index 1 is :"+ 			s1.substring(1));
		
		System.out.println("The index of char a is :"+s1.indexOf('a'));
		
		System.out.println("The index of char a is :"+s1.lastIndexOf('A'));
		
		

	}
}