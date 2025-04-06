/*Q3. Write a program to merge two Vector<String> and store the result in a third vector */
import java.util.*;
public class MergeVectorString
{
	public static void main(String x[])
	{
		Vector<String>str1=new Vector<>();
		str1.add("Shraddha");
		
		Vector<String>str2=new Vector<>();
		str2.add("Birajdar");
		
		Vector<String>merge=new Vector<>();
		merge.addAll(str1);
		merge.addAll(str2);
	
		System.out.println("megered Array: ");	
		
		for(Object obj:merge)
		{
			System.out.print(obj+" ");
		}
		
	}
}