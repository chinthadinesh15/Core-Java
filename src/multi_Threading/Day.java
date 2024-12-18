package multi_Threading;

import java.util.Scanner;

class Demo1 extends Thread
{
	@Override
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Addition task started");
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
		System.out.println("Addition task Completed");
		sc.close();
	}
}
class Demo2 extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Character printing started");
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Character printing completed");
	}
}
class Demo3 extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Number Printing started");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Number Printing Completed");
	}
}
public class Day
{
	public static void main(String[] args) 
	{
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		
		d1.start();
		d2.start();
		d3.start();
	}
}
