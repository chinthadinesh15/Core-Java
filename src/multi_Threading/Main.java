package multi_Threading;

import java.util.Scanner;

class Test1 extends Thread
{
	@Override
	public synchronized void run() 
	{
		System.out.println("Addition Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println(c);
		System.out.println("Addition Completed");
	}
}
class Test2 extends Thread
{
	@Override
	public synchronized void run()
	{
		System.out.println("Printing Characters is Started");
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try 
			{
				Thread.sleep(1000);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Printing Character is Ended");
	}
}
class Test3 extends Thread
{
	@Override
	public synchronized void run() 
	{
		System.out.println("Printing numbers Started");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Printing numbers is ended");
	}
}

public class Main 
{
	public static void main(String[] args) 
	{
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		Test3 t3=new Test3();
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
