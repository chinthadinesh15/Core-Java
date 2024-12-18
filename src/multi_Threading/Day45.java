package multi_Threading;

import java.util.Scanner;

class Demo11 implements Runnable
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
	}
}
class Demo22 implements Runnable
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
class Demo33 implements Runnable
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
public class Day45
{
	public static void main(String[] args)
	{
		Demo11 d1=new Demo11();
		Demo22 d2=new Demo22();
		Demo33 d3=new Demo33();
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
