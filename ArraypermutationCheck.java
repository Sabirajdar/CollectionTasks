import java.util.*;
public class ArraypermutationCheck
{
	
	public static int calculateEqual(int []a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=xyz.nextInt();
		
		int []arr1=new int[n];
		int []arr2=new int[n];
		System.out.println("Enter array1 ");
		for(int i=0;i<n;i++)
		{
			arr1[i]=xyz.nextInt();
		}
		xyz.nextLine();
		System.out.println("Enter array2 ");
		for(int i=0;i<n;i++)
		{
			arr2[i]=xyz.nextInt();
		}

		int sum1=calculateEqual(arr1);
		int sum2=calculateEqual(arr2);

		System.out.println(sum1==sum2);
	}
}