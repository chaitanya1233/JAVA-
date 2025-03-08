import java.util.Scanner;
class Palindrome{
	public static void isPd(int arr[])
	{
		int flag = 0;
		for(int i=0;i<arr.length/2;i++)
		{
			if(arr[i]  == arr[arr.length-i-1])
			{
			  flag  = 1;
			  continue;
			}
			else 
			{
			  System.out.println("The array is not a palindrome..");
			  break;
			}
		}
		if(flag!=0)
		{
			System.out.println("The arrary is palindrome.");
		}
	}
	public static void main(String[]args)
	{
		int arr[] = {1,2,3,3,2,1};
		isPd(arr);
		

		
	}
}