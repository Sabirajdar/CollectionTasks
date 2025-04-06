/*
Aug-24 Batch Today's Practical Task...

Q1. Write a java program to create Vector and perform following operations using switch case and do while.

1. Add 10 Values In Vector.
2. Display All Values In Vector.
3. Add New Value In Vector.
4. Search Value In Vector.
5. Sort All Values In Ascending Order In Vector.
6. Sort All Values In Descending Order In Vector.
7. Find Max Value In Vector.
8. Find Min Value In Vector.
9. Update Value In Vector.
10. Delete Value In Vector.

*/

import java.util.*;
import java.util.Vector;
public class VectorOperation
{
	public static void main(String x[])
	{
		Vector v=new Vector();
		int siez;
		do{
			Scanner xyz=new Scanner(System.in);
			System.out.println("1. Add 10 Values In Vector.");
			System.out.println("2. Display All Values In Vector.");
			System.out.println("3. Add New Value In Vector.");
			System.out.println("4. Search Value In Vector.");
			System.out.println("5. Sort All Values In Ascending Order In Vector.");
			System.out.println("6. Sort All Values In Descending Order In Vector.");
			System.out.println("7. Find Max Value In Vector.");
			System.out.println("8. Find Min Value In Vector.");
			System.out.println("9. Update Value In Vector.");
			System.out.println("10. Delete Value In Vector.");
			
			System.out.println("Enter your choice");
			int choice=xyz.nextInt();
			
			switch(choice)
			{
				case 1:
							System.out.println("Enter values in vector");
							int value=xyz.nextInt();
							boolean b=v.add(value);
							if(b)
							{
								System.out.println("Element added");
							}
							else
							{
								System.out.println("Element not added");
							}
				break;
				case 2:
							Iterator itr=v.iterator();
							while(itr.hasNext())
							{
								Object obj=itr.next();
								System.out.println(obj);
							}
				break;
				case 3:
							System.out.println("Enter new values in vector");
							 value=xyz.nextInt();
							 boolean b1=v.add(value);
								if(b1)
								{
									System.out.println("Element added");
								}
								else
								{
									System.out.println("Element not added");
								}
							 Iterator itrr=v.iterator();
								while(itrr.hasNext())
								{
									Object obj=itrr.next();
									System.out.println(obj);
								}
				break;
				case 4:
							System.out.println("Enter search value");
							 value=xyz.nextInt();
							b=v.contains(value);
							if(b)
							{
								System.out.println("Element found: "+value);
							}
							else
							{
								System.out.println("Element not found: "+value);
							}
				break;
				case 5:
							System.out.println("Before Sorting");
							Iterator itr1=v.iterator();
							while(itr1.hasNext())
							{
								Object obj=itr1.next();
								System.out.println(obj);
							}
							for(int i=0;i<v.size();i++)
							{
								for(int j=(i+1);j<v.size();j++)
								{
									Object prev=v.get(i);
									Object next=v.get(j);
									if((int)prev>(int)next)
									{
										v.set(i,next);
										v.set(j,prev);
									}	
								}
							}
							System.out.println("After Sorting Accending order");
							Iterator itr11=v.iterator();
							while(itr11.hasNext())
							{
								Object obj=itr11.next();
								System.out.println(obj);
							}
				break;
				case 6:
							System.out.println("Before Sorting");
							Iterator itr111=v.iterator();
							while(itr111.hasNext())
							{
								Object obj=itr111.next();
								System.out.println(obj);
							}
							for(int i=0;i<v.size();i++)
							{
								for(int j=(i+1);j<v.size();j++)
								{
									Object prev=v.get(i);
									Object next=v.get(j);
									if((int)prev<(int)next)
									{
										v.set(i,next);
										v.set(j,prev);
									}	
								}
							}
							System.out.println("After Sorting Decending order");
							Iterator itr1111=v.iterator();
							while(itr1111.hasNext())
							{
								Object obj=itr1111.next();
								System.out.println(obj);
							}
				break;
				case 7:
						Iterator itr2=v.iterator();
							while(itr2.hasNext())
							{
								Object obj=itr2.next();
								System.out.println(obj);
							}
						Object max=v.get(0);
						for(int i=0;i<v.size();i++)
						{
							if((int)v.get(i)>(int)max)
							{
								max=(int)v.get(i);
							}
						}
						System.out.println("Maximum value: "+max);
				break;
				case 8:
						Iterator itr3=v.iterator();
							while(itr3.hasNext())
							{
								Object obj=itr3.next();
								System.out.println(obj);
							}
						Object min=v.get(0);
						for(int i=0;i<v.size();i++)
						{
							if((int)v.get(i)<(int)min)
							{
								min=(int)v.get(i);
							}
						}
						System.out.println("Minimum value: "+min);
				break;
				case 9:
					System.out.println("Enter index for update");
					int index=xyz.nextInt();
					if(index >=0 && index<v.size())
					{
						System.out.println("Enter new values in vector");
						 value=xyz.nextInt();
						 v.set(index, value);
						 System.out.println("Value updated successfully");
					}
					else
					{
						System.out.println("Invalid index! Please enter valid index.");
					}
					
				break;
				case 10:
						System.out.println("Enter value for delete");
						int valueDet=xyz.nextInt();

						if(v.contains(valueDet))
						{
							v.remove(Integer.valueOf(valueDet));
							System.out.println(valueDet+": deleted successfully");
						}
						else
						{
							System.out.println("Value not found for remove or delete");
						}
				break;
				case 11:
							System.out.println("Exit");
				break;
			}
		}while(true);
	}

}