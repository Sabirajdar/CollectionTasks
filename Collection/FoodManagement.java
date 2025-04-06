/*Aug-24 Today's Practical Task..

Problem Statement:
Create a Food Management System using a Vector in Java. Implement a Food POJO (Plain Old Java Object) class with the following properties:

    foodId (int)
    foodName (String)
    price (double)
    category (String)

Perform 10 different operations on a Vector list:

    1.Add Food Items: Allow the user to add food items to the vector.
    2.Display All Food Items: Show all available food items.
	3.Search Food by Name: Find and display food items based on a given name.
	4.Update Food Price by ID: Modify the price of a food item by providing its foodId.
	5.Delete a Food Item by ID: Remove a food item from the vector using its foodId.
	6.Sort Food Items by Price: Sort the food items in ascending order of price.
	7.Filter Food by Category: Display all food items belonging to a specific category (e.g., "Dessert").
	8.Find the Most Expensive Food Item: Identify and display the most expensive food item in the vector.
	9.Find the Cheapest Food Item: Identify and display the cheapest food item in the vector.
	10.Count Food Items in Each Category: Count and display the number of food items in each category.
	*/
import java.util.*;
class Food
{
	private int foodId;
	private String foodName;
	private double  price;
	private String category;
	
	public Food()
	{
	}
	public Food(int foodId,String foodName,double price,String category)
	{
		this.foodId=foodId;
		this.foodName=foodName;
		this.price=price;
		this.category=category;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
public class FoodManagement
{
	public static void main(String x[])
	{
		Vector v=new Vector();
		do{
				Scanner xyz=new Scanner(System.in);
				System.out.println("1.Add Food Items: Allow the user to add food items to the vector.");
				System.out.println("2.Display All Food Items: Show all available food items.");
				System.out.println("3.Search Food by Name: Find and display food items based on a given name.");
				System.out.println("4.Update Food Price by ID: Modify the price of a food item by providing its foodId.");
				System.out.println("5.Delete a Food Item by ID: Remove a food item from the vector using its foodId.");
				System.out.println("6.Sort Food Items by Price: Sort the food items in ascending order of price.");
				System.out.println("7.Filter Food by Category: Display all food items belonging to a specific category e.g., Dessert.");
				System.out.println("8.Find the Most Expensive Food Item: Identify and display the most expensive food item in the vector.");
				System.out.println("9.Find the Cheapest Food Item: Identify and display the cheapest food item in the vector.");
				System.out.println("10.Count Food Items in Each Category: Count and display the number of food items in each category.");
				
				System.out.println("Enter your choice");
				int choice=xyz.nextInt();
				
				switch(choice)
				{
					case 1:
								System.out.println("Add Items in vector");
								for(int i=0;i<2;i++)
								{
									System.out.println("Enter foodId");
									int foodid=xyz.nextInt();
									xyz.nextLine();
									System.out.println("foodName");
									String foodname=xyz.nextLine();
									System.out.println("price");
									double price=xyz.nextDouble();
									xyz.nextLine();
									System.out.println("Category");
									String category=xyz.nextLine();
									
									Food f=new Food(foodid,foodname,price,category);
									v.add(f);
								}
					break;
					case 2:
								System.out.println("Display Items:  ");
								Iterator i=v.iterator();
								while(i.hasNext())
								{
									Object obj=i.next();
									Food f1=(Food)obj;
									System.out.println(f1.getFoodId()+"\t"+f1.getFoodName()+"\t"+f1.getPrice()+"\t"+f1.getCategory());
								}
					break;
					case 3:
								xyz.nextLine();
								System.out.println("Enter FoodName");
								String sfood=xyz.nextLine();
								 i=v.iterator();
								while(i.hasNext())
								{
									Object obj=i.next();
									Food f1=(Food)obj;
									if(f1.getFoodName().equals(sfood))
									{
										System.out.println(f1.getFoodId()+"\t"+f1.getFoodName()+"\t"+f1.getPrice()+"\t"+f1.getCategory());
									}
								}
					break;
					case 4:
								System.out.println("Update Items By Id");
								xyz.nextLine();
								System.out.println("Enter FoodId");
								int sid=xyz.nextInt();
								i=v.iterator();
								while(i.hasNext())
								{
									Object obj=i.next();
									Food f1=(Food)obj;
									if(f1.getFoodId()==sid)
									{
										xyz.nextLine();
										
										System.out.println("price");
										double price=xyz.nextDouble();
										f1.setPrice(price);
									}
								}
					break;
					case 5:
								System.out.println("Delete Items By Id");
								xyz.nextLine();
								System.out.println("Enter FoodId");
								int did=xyz.nextInt();
								i=v.iterator();
								while(i.hasNext())
								{
									Object obj=i.next();
									Food f1=(Food)obj;
									if(f1.getFoodId()==did)
									{
											i.remove();
									}
								}
								System.out.println("items Deleted successfully....");
					break;
					case 6:
								System.out.println("Sort data by price");	
								for(int j=0;j<v.size()-1;j++)
								{
									
									for(int k=j+1;k<v.size();k++)
									{
										
										Food food1=(Food)v.get(j);
										Food food2=(Food)v.get(k);
										if(food1.getPrice()>food2.getPrice())
										{
											v.set(j,food2);
											v.set(k,food1);
										}
									}
								}
							System.out.println("Food item sorted by price successfully...");
									for(int p=0;p<v.size();p++)
									{
										Food f=(Food)v.get(p);
										System.out.println(f.getFoodId()+"\t"+f.getFoodName()+"\t"+f.getPrice()+"\t"+f.getCategory());
									}
					break;
					case 7:
							System.out.println("Filter food by category");
							xyz.nextLine();
							System.out.println("Enter category");
							String Fcategory=xyz.nextLine();
							i=v.iterator();
							boolean flag=false;
								while(i.hasNext())
								{
									Object obj=i.next();
									Food f1=(Food)obj;
									if(f1.getCategory().equals(Fcategory))
									{
										System.out.println(f1.getFoodId()+"\t"+f1.getFoodName()+"\t"+f1.getPrice()+"\t"+f1.getCategory());	
										flag=true;
									}
								}
							if(!flag)
							{
								System.out.println("No Food items found in the category"+Fcategory);
							}
					break;
					case 8:	
							System.out.println("Most expessive Item in vector");
							if(v.isEmpty())
							{
								System.out.println("No item available");
							}
							Food max=(Food)v.get(0);
							for(int t=1;t<v.size();t++)
							{
									Food f1=(Food)v.get(t);
								if(f1.getPrice()>max.getPrice())
								{
									max=f1;
								}
							}
							
							System.out.println(max.getFoodId()+"\t"+max.getFoodName()+"\t"+max.getPrice()+"\t"+max.getCategory());

					break;
					case 9:
						System.out.println("Most Cheapest Item in vector");
						if(v.isEmpty())
							{
								System.out.println("No item available");
							}
							Food min=(Food)v.get(0);
							for(int t1=1;t1<v.size();t1++)
							{
									Food f1=(Food)v.get(t1);
								if(f1.getPrice()<min.getPrice())
								{
									min=f1;
								}
							}
							
							System.out.println(min.getFoodId()+"\t"+min.getFoodName()+"\t"+"\t"+min.getPrice()+"\t"+min.getCategory());
					break;
					case 10:
								System.out.println("Total items in vector: "+v.size());
					break;
				}
		}while(true);
		
	}
}