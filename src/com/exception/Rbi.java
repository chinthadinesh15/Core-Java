package com.exception;
import java.util.Scanner;

class InvalidInputException extends Exception //custom exception
{
	@Override
	public String getMessage() 
	{
		return "Invalid Input";
	}
}
class Atm
{
	int pin=1234;
	int p;
	public void acceptInput()
	{
		System.out.println("Enter the pin");
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
	}
	public void verify() throws Exception
	{
		if(pin==p)
		{
			System.out.println("Collect your Money");
		}
		else
		{
			//System.out.println("Invalid pin");
			InvalidInputException ie=new InvalidInputException();
			System.out.println(ie.getMessage());
			throw ie;
		}
	}
}
class Bank
{
	public void init()
	{
		Atm a=new Atm();
		try
		{
			a.acceptInput();
			a.verify();
		}
		catch(Exception e)
		{
			try
			{
				a.acceptInput();
				a.verify();
			}
			catch(Exception f)
			{
				try
				{
					a.acceptInput();
					a.verify();
				}
				catch(Exception g)
				{
					System.out.println("Card Blocked || Please contact Bank");
				}
			}
		}
	}
}
public class Rbi
{
   public static void main(String[] args) 
   {
	   Bank b=new Bank();
	   b.init(); 
   }
}
