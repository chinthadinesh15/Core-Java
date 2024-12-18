package project_Encap;

import java.util.Scanner;



public class Player
{
	private String name;
	private int age;
	private double height;
	private String country;
	
	public Player()
	{
		
	}
	public Player(String name, int age, double height, String country)
	{
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public String getCountry() {
		return country;
	}
	public void displayInfo()
	{
		System.out.println("Player name: "+name);
		System.out.println("Player age :"+age);
		System.out.println("Player Height :"+height);
		System.out.println("Player Country:"+country);
	}
}
class Cricket extends Player
{
	private int wicket;
	private int runs;
	
	public Cricket()

	{
		
	}
	public Cricket(String name, int age, double height, String country,int wicket,int runs) 
	{
		super(name, age, height, country);
		this.wicket=wicket;
		this.runs=runs;
		
	}
	
	
	public void setWickets(int wickets) {
		this.wicket = wicket;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wicket;
	}
	public int getRuns() {
		return runs;
	}
	@Override
	public void displayInfo()
	{
		System.out.println("------Cricket Player Details:-----");
		super.displayInfo();
		
		System.out.println("Wickets: "+wicket);
		System.out.println("Runs :"+runs);
	}
}
class Football extends Player
{
	private int goals;
	private String position;
	public Football()
	{
		
		
	}
	public Football(String name, int age, double height, String country,int goals,String position) 
	{
		super(name, age, height, country);
		this.goals=goals;
		this.position=position;
	}
	
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public void displayInfo()
	{
		System.out.println("------Footbal Player Details:-----");
		super.displayInfo();
		
		System.out.println("Goals :"+goals);
		System.out.println("Position: "+position);
		
	}
	
}
class Factory
{
	static Scanner sc=new Scanner(System.in);
	
	public static Player getPlayer(String choice)
	{
		System.out.println("Enter the Player:");
		String s=sc.next();
		
		String [] ar=s.split(",");
		
		String name=ar[0];
		int age=Integer.parseInt(ar[1]);
		double height = Double.parseDouble(ar[2]);	   
		String country=ar[3];
		
		
		if(choice.equalsIgnoreCase("Cricket"))
		{
			int wicket=Integer.parseInt(ar[4]);
			int runs=Integer.parseInt(ar[5]);
			
			Cricket b=new Cricket( name, age,  height, country,wicket, runs);

			return b;
		}
		else if(choice.equalsIgnoreCase("Football"))
		{
			int goals=Integer.parseInt(ar[4]);
			String position=ar[5];
			
			Football c= new Football(name, age,  height, country,goals,position);
			return c;
		}
		else
		{
			return null;
		}
	}
}

