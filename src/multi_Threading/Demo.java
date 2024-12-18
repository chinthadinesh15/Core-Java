package multi_Threading;
import java.util.Scanner;

//Dependent Tasks
public class Demo 
{
	public static void main(String[] args) 
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
