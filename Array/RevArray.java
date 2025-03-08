import java.util.Scanner;
class RevArray{
	public static void rev(int arr[])
	{
	  for(int i =0;i<arr.length/2;i++)
	 {
		//t temp = arr[i];
		//r[i] = arr[arr.length-i-1];
		//arr.length-i-1] = temp ;


		arr[i] += arr[arr.length-i-1];
		arr[arr.length-i-1] = arr[i] - arr[arr.length-i-1];
 		arr[i] = arr[i] - arr[arr.length-i-1];
		
	 }
	}
	public static void main(String[]args)
	{
		int arr[] = {1,2,3,4,5,6};
		System.out.println("The original array is: ");
		for(int i :arr)
		{
			System.out.print(i+" ");
		}
		rev(arr);
		System.out.println("\n reverse  of the array is:");
		for(int i :arr)
		{
			System.out.print(i+" ");
		}

		
	}
}