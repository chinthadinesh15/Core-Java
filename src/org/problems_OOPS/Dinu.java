package org.problems_OOPS;


import java.util.Scanner;

class MenuItem 
{
	private int itemID;
	private String itemName;
	private float price;
	private String category;
	public MenuItem()
	{
		
	}
	public MenuItem(int itemID, String itemName, float price, String category) 
	{
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.price = price;
		this.category = category;
	}
	public int getItemID()
	{
		return itemID;
	}
	public void setItemID(int itemID) 
	{
		this.itemID = itemID;
	}
	public String getItemName() 
	{
		return itemName;
	}
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	public float getPrice() 
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public String getCategory() 
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	public void display()
	{
		System.out.println("Item ID: "+itemID);
		System.out.println("Item Name: "+itemName);
		System.out.println("Price: "+price);
		System.out.println("Category: "+category);
		
	}
}
class Beverage extends MenuItem
{
   protected float caffeineContent;
	public Beverage()
	{
		
	}
	public Beverage(int itemID, String itemName, float price, String category,float caffeineContent)
	{
		super(itemID, itemName, price, category);
		this.caffeineContent=caffeineContent;
	}
	public float getCaffeineContent()
	{
		return caffeineContent;
	}
	public void setCaffeineContent(float caffeineContent) 
	{
		this.caffeineContent = caffeineContent;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Caffeine Content: "+caffeineContent);
	}
}
class MainCourse extends MenuItem
{
	protected float calories;
	protected String cuisineType;
	public MainCourse() 
	{
		
	}
	public MainCourse(int itemID, String itemName, float price, String category,float calories, String cuisineType)
	{
		super(itemID,itemName,price,category);
		this.calories = calories;
		this.cuisineType = cuisineType;
	}
	public float getCalories()
	{
		return calories;
	}
	public void setCalories(float calories)
	{
		this.calories = calories;
	}
	public String getCuisineType() 
	{
		return cuisineType;
	}
	public void setCuisineType(String cuisineType) 
	{
		this.cuisineType = cuisineType;
	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("calories: " +calories);
		System.out.println("Cuisine Type: "+cuisineType);
	}	
}
class Factory
{
	static Scanner sc=new Scanner(System.in);
	
	public static MenuItem getMenuItem(String choice)
	{
		System.out.println("Enter the MenuItem:");
		String s=sc.next();
		
		String [] ar=s.split(",");
		
		int id=101;
		String itemName=ar[0];
		float price=Float.parseFloat(ar[1]);
		String category=ar[2];
		
		if(choice.equalsIgnoreCase("Beverage"))
		{
			float caffeineContent =Float.parseFloat(ar[3]);
			Beverage b=new Beverage(id,itemName,price,category,caffeineContent);

			return b;
		}
		else if(choice.equalsIgnoreCase("MainCourse"))
		{
			float calories =Float.parseFloat(ar[3]);
			String cuisineType=ar[4];
			
			MainCourse c= new MainCourse(id,itemName,price,category,calories,cuisineType);
			return c;
		}
		else
		{
			return null;
		}
	}
}
 public class Dinu
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice\r\n"+"Beverage\r\n"+"MainCourse");
		String choice=sc.next();
		
		MenuItem item =Factory.getMenuItem(choice);
		item.display();
		
	}
}
 
