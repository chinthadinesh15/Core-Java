package com.exception;

import java.util.Scanner;

class InputInvalidException extends Exception
{
	public String getMessage()
	{
		return "Invalid input";
		
	}
}
class Atms
{
	int pin=1234;
	int p;
	
	void acceptInput() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin");
		int p=sc.nextInt();
	}
	void verify() throws Exception
	{
		if(pin==p)
		{
			System.out.println("Collect your cash");
		}
		else
		{
			InputInvalidException ie=new InputInvalidException();
			System.out.println(ie.getMessage());
			throw ie;
		}
	}
}
class Banks
{
	void init()
	{
		Atms a=new Atms();
		try
		{
			a.acceptInput();
			a.verify();
			
		} catch (Exception e)
		{
			try {
				a.acceptInput();
				a.verify();
			} catch (Exception e2) 
			{
				try {
					a.acceptInput();
					a.verify();
				} catch (Exception e3) 
				{
					System.out.println("Your card is Blocked Contact Branch!!!!!");
				}
			}
		}
	}
}

public class Demo4
{
	public static void main(String[] args) 
	{
		Banks b=new Banks();
		b.init();
		
	}

}
