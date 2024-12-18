package com.inner_anonymous_lambda;

class Outer
{
	
}


public class Day37 
{
	static class Inner
	{
		void display()
		{
			System.out.println("Display method");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		
		Inner i=new Inner();
		i.display();
		System.out.println("Stop");
	}

}
