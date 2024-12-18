package com.abstracts;
abstract class Bird
{
	abstract public void eat();
	abstract public void fly();
}
abstract class Eagle extends Bird
{
	@Override
	public void fly()
	{
		System.out.println("Eagle is flying on above the Mountain");	
	}
}
class sarpontEgale extends Eagle
{
	@Override
	public void eat() 
	{
		System.out.println("sarpontEgale is eating");
		
	}
}
class GoldenEagle extends Eagle
{
	@Override
	public void eat() 
	{
		System.out.println("GoldenEagle is Eating");
		
	}
}
public class Day6 {

	public static void main(String[] args) 
	{
		Eagle e=new sarpontEgale();
		e.eat();
		e.fly();
		GoldenEagle g=new GoldenEagle();
		g.eat();
		g.fly();

	}

}
