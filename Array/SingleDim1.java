import java.util.Scanner;
class TwoDim1{
	public static void main(String[]args)
	{
		int arr[] = new int[5];
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of the array:");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			//arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Elements of the array are :\n");

		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

		
	}
}