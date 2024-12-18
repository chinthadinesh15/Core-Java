package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day39 
{
	public static void main(String[] args) 
	{
		System.out.println("Connection Established");
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the Numerator");
			int a=sc.nextInt();
			System.out.println("Enter the Demoninator");
			int b=sc.nextInt();
			
			int c=a/b;
			System.out.println(c);
			
			System.out.println("Enter the Size of an Array");
			int size=sc.nextInt();
			int []arr=new int[size];
			System.out.println("Enter the Element");
			int ele=sc.nextInt();
			System.out.println("Enter the index");
			int index=sc.nextInt();
			arr[index]=ele;
			System.out.println(arr[index]);
			System.out.println("Connection Terminated");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Demoninator not declared with zero");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Be Positive");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Provide Only Integers");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Provide valid Index");
		}
		catch (Exception e) 
		{
			System.out.println("Invalid ");
		}
		sc.close();
	} 
	
	

}
