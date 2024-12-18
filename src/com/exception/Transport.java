package com.exception;

import java.util.Scanner;
class UnderAgeException extends Exception
{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You are not Elligible";
	}
}
class AboveAgeException extends Exception
{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You are not elligible";
	}
}
class Office
{
	//int age=20;
	int age;
	
	public void acceptInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age=sc.nextInt();
	}
	public void verify() throws Exception
	{
		if(age >20 && age>64)
		{
			System.out.println("You are elligle to get Licence! Get It");
		}
		else if(age<20)
		{
			UnderAgeException ie=new UnderAgeException();
			System.out.println(ie.getMessage());
			throw ie;
		}
		else if(age >65)
		{
			AboveAgeException ie1=new AboveAgeException();
			System.out.println(ie1.getMessage());
			throw ie1;
		}
	}
}
class Rto
{
	public void init()
	{
		Office f=new Office();
		try
		{
			f.acceptInput();
			f.verify();
		}
		catch(Exception e)
		{
			try
			{
				f.acceptInput();
				f.verify();
			}
			catch(Exception f1)
			{
				try
				{
					f.acceptInput();
					f.verify();
				}
				catch(Exception f2)
				{
					System.out.println("You are Blocked ! Please try after one Month!");
				}
			}
		}
	}
	
}
public class Transport
{
	public static void main(String[] args) {
		Rto r=new Rto();
		r.init();
	}

}
