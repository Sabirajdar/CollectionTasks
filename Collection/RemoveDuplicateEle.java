/*Q4. Write a program to remove duplicate elements from a Vector<Integer>.*/

import java.util.*;
public class RemoveDuplicateEle
{
	public static void main(String x[])
	{
		Vector<Integer>v=new Vector<>();
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter elements: ");
		for(int i=0;i<5;i++)
		{
			int val=xyz.nextInt();
			v.add(val);
		}
		
		for(int i=0;i<v.size();i++)
		{
			for(int j=i+1;j<v.size();j++)
			{
				if(v.get(i).equals(v.get(j)))
				{	
					v.remove(j);
					j--;
				}
			}
		}
		System.out.println("After RemoveDuplicateEle: ");
		for(Object obj:v)
		{
			System.out.println(obj);
		}
	}
}