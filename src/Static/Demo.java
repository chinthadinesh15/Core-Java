package Static;

import java.util.Scanner;

class Businessman
{
	private float p;
	private float t;
	private static  float r;
	private float si;
	static
	{
		r=15.8f;
	}
	
	public void acceptInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle amount");
		p=sc.nextFloat();
		System.out.println("Enter the tenure");
		t=sc.nextFloat();
		
	}
	public void calcInterest()
	{
		si=(p*t*r/100);
	}
	public void display()
	{
		System.out.println(si);
	}
}
public class Demo 
{
	public static void main(String[] args)
	{
		Businessman b1=new Businessman();
		b1.acceptInput();
		b1.calcInterest();
		b1.display();
	
		
		
	}
	

}
