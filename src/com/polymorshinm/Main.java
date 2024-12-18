package com.polymorshinm;

import java.util.Scanner;

// Runtime Polymorshihm
class Plane
{
	public void takeOff()
	{
		System.out.println("plane is takeOff");
	}
	public void fly()
	{
		System.out.println("Plane is Flying");
	}
	public void land()
	{
		System.out.println("Plane is landing");
	}
}

class CargoPlane extends Plane
{
	@Override
	public void takeOff()
	{
		System.out.println("CargoPlane is takeOff");
	}
	@Override
	public void fly()
	{
		System.out.println("CargoPlane is Flying at lower range area");
	}
	@Override
	public void land()
	{
		System.out.println("CargoPlane is landing");
	}
}
class PassengerPlane extends Plane
{
	@Override
	public void takeOff()
	{
		System.out.println("PassengerPlane is takeOff");
	}
	@Override
	public void fly()
	{
		System.out.println("PassengerPlane is Flying at Median range area");
	}
	@Override
	public void land()
	{
		System.out.println("PassengerPlane is landing");
	}
}
class FightPlane extends Plane    // Inheritance
{
	@Override
	public void takeOff()  //Method Overriding
	{
		System.out.println(" FightPlane  is takeOff");
	}
	@Override
	public void fly()
	{
		System.out.println(" FightPlane  is Flying at higher range area");
	}
	@Override
	public void land()
	{
		System.out.println(" FightPlane  is landing");
	}
}

class Factory
{
	public static Plane getPlane(String choice)
	{
		if(choice.equalsIgnoreCase("cargoplane"))
		{
			return new CargoPlane();
		}
		else if(choice.equalsIgnoreCase("passengerplane"))
		{
			return new PassengerPlane();
		}
		else if(choice.equalsIgnoreCase("fightplane"))
		{
			return new FightPlane();
		}
		else
			return null;
	}
}

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Choice\ncargoPlane\npassengerPlane\nFightPlane");
		String choice=sc.next();
		
		Plane p=Factory.getPlane(choice);  //upcasting
		p.takeOff();
		p.fly();
		p.land();
	}

}
