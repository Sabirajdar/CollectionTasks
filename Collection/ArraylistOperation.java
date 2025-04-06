/*
Q 1. Write a java program to create arraylist and perform following operations using switch case and do while.

		1. Add 10 Values In Arraylist.
		2. Display All Values In Arraylist.
		3. Add New Value In Arraylist.
		4. Search Value In Arraylist.
		5. Sort All Values In Ascending Order In Arraylist.
		6. Sort All Values In Descending Order In Arraylist.
		7. Find Max Value In Arraylist.
		8. Find Min Value In Arraylist.
		9. Update Value In Arraylist.
		10. Delete Value In Arraylist.

*/
import java.util.*;
public class ArraylistOperation
{
	public static void main(String x[])
	{
		ArrayList al=new ArrayList();
		do{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1. Add 10 Values In Arraylist.");
		System.out.println("2. Display All Values In Arraylist.");
		System.out.println("3. Add New Value In Arraylist.");
		System.out.println("4. Search Value In Arraylist.");
		System.out.println("5. Sort All Values In Ascending Order In Arraylist.");
		System.out.println("6. Sort All Values In Descending Order In Arraylist.");
		System.out.println("7. Find Max Value In Arraylist.");
		System.out.println("8. Find Min Value In Arraylist.");
		System.out.println("9. Update Value In Arraylist.");
		System.out.println("10. Delete Value In Arraylist.");
		
		System.out.println("Enter your choice");
		int choice=xyz.nextInt();
		switch(choice)
		{
		case 1:
				System.out.println("Add element in arraylist");
				
				for(int i=0;i<5;i++)
				{
					int value=xyz.nextInt();
					al.add(value);
				}
		break;
		case 2:
				for(Object obj:al)
				{
					System.out.println(obj);
				}
		break;
		case 3:	
				System.out.println("Add new element in arraylist");
				int value1=xyz.nextInt();
				boolean b1=al.add(value1);
				if(b1)
				{
					System.out.println("Element added");
				}else
				{
					System.out.println("Element not added");
				}
				for(Object obj:al)
				{
					System.out.println(obj);
				}
		break;
		case 4:
					System.out.println("Enter index");
					int indval=xyz.nextInt();
					if(indval !=-1)
					{
						System.out.println("Element found: "+indval);
					}
					else
					{
						System.out.println("Element not found");
					}
		break;
		case 5:
					System.out.println("Before sorting");
					for(Object obj:al)
					{
						System.out.println(obj);
					}
					
					for(int i=0;i<al.size();i++)
					{
						for(int j=i+1;j<al.size();j++)
						{
							Object prev=al.get(i);
							Object next=al.get(j);
							if((int)prev > (int)next)
							{
								al.set(i,next);
								al.set(j,prev);
							}

						}
					}
					System.out.println("After sorting in Accending order");
					for(Object obj:al)
					{
						System.out.println(obj);
					}
		break;
		case 6:
				System.out.println("Before sorting");
				for(Object obj:al)
					{
						System.out.println(obj);
					}
				for(int i=0;i<al.size();i++)
				{
					for(int j=i+1;j<al.size();j++)
					{
						Object prev=al.get(i);
						Object next=al.get(j);
						if((int)prev<(int)next)
						{
							al.set(i,next);
							al.set(j,prev);
						}
					}
				}
				System.out.println("After sorting Decending order");
				for(Object obj:al)
					{
						System.out.println(obj);
					}
		break;
		case 7:
				for(Object obj:al)
					{
						System.out.println(obj);
					}
				Object max=(int)al.get(0);
				for(int i=0;i<al.size();i++)
				{
					if((int)al.get(i)>(int)max)
					{
						max=(int)al.get(i);
					}
				}
				System.out.println("Maximum value in arraylist : "+max);
		break;
		case 8:
				for(Object obj:al)
				{
					System.out.println(obj);
				}
				Object min=(int)al.get(0);
				for(int i=0;i<al.size();i++)
				{
					if((int)al.get(i)<(int)min)
					{
						min=(int)al.get(i);
					}
				}
				System.out.println("Minimum value in arraylist: "+min);
		break;
		case 9:
				System.out.println("Enter index");
				int index=xyz.nextInt();
				System.out.println("Enter value");
				int val=xyz.nextInt();
				al.add(index,val);
				for(Object obj:al)
				{
					System.out.println(obj);
				}	
		break;
		case 10:
				System.out.println("Enter index1");
				int index1=xyz.nextInt();
				System.out.println("After removing value");
				if(index1>=0 && index1<al.size())
				{
				al.remove(index1);
				
				for(Object obj:al)
				{
					System.out.println(obj);
				}
				}
		break;
		}
		}while(true);
		
	}
}