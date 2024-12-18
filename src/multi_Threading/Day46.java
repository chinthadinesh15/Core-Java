package multi_Threading;



import java.util.Scanner;

class SingleRun extends Thread
 {
	 @Override
	public void run() 
	 {
		Thread t=Thread.currentThread();
		String name=t.getName();
		
		if(name.equals("Thread-0"))
		{
			add();
		}
		else if(name.equals("Thread-1"))
		{
			PrintCharter();
		}
		else
		{
			PrintNumbers();
		}
	 }
	 
	 public void add()
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
	 public void PrintCharter()
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
	 public void PrintNumbers()
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


public class Day46 
{
	public static void main(String[] args) 
	{
		SingleRun s1=new SingleRun();
		SingleRun s2=new SingleRun();
		SingleRun s3=new SingleRun();
		
		s1.start();
		s2.start();
		s3.start();
	}

}
