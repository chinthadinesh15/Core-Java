package com.exception;

import java.util.Scanner;

public class Day41
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try
		{
			System.out.println("Enter the Numerator");
			int a=sc.nextInt();
			System.out.println("Enter the Demoninator");
			int b=sc.nextInt();
			
			int c=a/b;
			System.out.println(c);
		}
		catch(Throwable e)
		{
			System.out.println("Catch Block is Executing");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
