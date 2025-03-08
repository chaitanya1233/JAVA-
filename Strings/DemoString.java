class DemoString
{
	public static void main(String[]args)
	{
		String s1  = new String("Chaitanya");
		System.out.println("s1:"+s1);
		String s2 = "Chaitanya";
		System.out.println("s2:"+s2);
		System.out.println(s1.equals(s2));
		
		String s3 =  s1.toUpperCase();
		System.out.println("s3:"+s3);
		
		int lengthS3 = s3.length();
		System.out.println("Length of the s3 string is :"+lengthS3);
		
		String s4 = " Kale";
		String s5 = s1.concat(s4);
		System.out.println("s4:"+s4);
		System.out.println("s5:"+s5);
		
		String s6 =  s3.toLowerCase();
		System.out.println("Orignal s3:"+s3);
		System.out.println("s6:"+s6);
		


		

		
		

	}
}