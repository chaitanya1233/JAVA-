import java.util.Scanner;
class Palindrome{
	public static void main(String[]args)
	{
		int arr[][] = new int[3][2];
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of the array:");
		for(int i = 0;i<3;i++)
		{
		  for(int j = 0;j<2;j++)
			{
			  arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements of the array are :\n");

		for(int i = 0;i<3;i++)
		{
		  for(int j = 0;j<2;j++)
			{
			  System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		
	}
}