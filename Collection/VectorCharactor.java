/*Q2. Write a program to reverse the elements of a Vector<Character> without using built-in methods */
import java.util.*;
public class VectorCharactor
{
	public static void main(String x[])
	{
		Vector<Character>ch=new Vector<>();
		
		ch.add('A');
		ch.add('B');
		ch.add('C');
		System.out.println("Before Reversing char");
		for(char c:ch)
		{
			System.out.println(c+" ");
		}
		Vector<Character>rev=new Vector<>();
		for(int i=ch.size()-1;i>=0;i--)
		{
			rev.add(ch.elementAt(i));
		}
		System.out.println("Reversed Character : "+rev);
		
	}
}