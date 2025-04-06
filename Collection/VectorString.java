/*Q1. Write a program to insert an element at the 2nd position in a Vector<String>.*/
	
import java.util.*;
public class VectorString
{
	public static void main(String x[])
	{
		Vector<String> v=new Vector<>();
		v.add("ABC");
		v.add("BCD");
		v.add("CDE");
		v.add("DEF");
		v.add(0,"SAM");
		for(Object obj:v)
		{
			System.out.println(obj);
		}
	}
}