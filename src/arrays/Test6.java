package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Connection is established");
		try
		{
			System.out.println("Enter the numerator");
			int a=sc.nextInt();
			System.out.println("Enter the denominator");
			int b=sc.nextInt();
			
			int c=a/b;
			System.out.println(c);
			
			System.out.println("Enter the size of an Array:");
			int size=sc.nextInt();
			int ar[]=new int[size];
			System.out.println("Enter the elements ");
			int ele=sc.nextInt();
			System.out.println("Enter the index");
			int index=sc.nextInt();
			ar[index]=ele;
			
			System.out.println(ar[index]);
			
			System.err.println("Connection is terminated");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(NegativeArraySizeException e1)
		{
			e1.printStackTrace();
			
		}
		catch(InputMismatchException e2)
		{
			e2.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e3)
		{
			e3.printStackTrace();
		}
		
	}
}