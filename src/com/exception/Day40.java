package com.exception;

import java.util.Scanner;
class Demo
{
	void alpha()  throws Exception
	{
		System.out.println("Connection is Established");
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a=sc.nextInt();
			System.out.println("Enter the Demoninator");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("handled in alpha");
			throw e;
		}
		finally
		{
			System.out.println("Connection is Terminated");
		}
	}
}
public class Day40 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		try
		{
			d.alpha();	
		}
		catch(Exception e)
		{
			System.out.println("Handled in Main");
		}
		
		
	}
	
}
