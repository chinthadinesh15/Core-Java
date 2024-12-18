package com.abstraction;

import java.util.Scanner;

abstract class Shape
{
	protected float area;
	abstract void acceptInput();
	abstract void calcArea();
	public void display()
	{
		System.out.println("Area : "+area);
	}
}
class Square extends Shape
{
	private float side;
	@Override
	void acceptInput() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side:");
		side=sc.nextFloat();	
	}
	public void calcArea()
	{
		area=side*side;
	}
}
class Rectangle extends Shape
{
	private float length;
	private float breadth;
	
	@Override
	public void acceptInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		length=sc.nextFloat();
		System.out.println("Enter breadth: ");
		breadth=sc.nextFloat();
	}
	@Override
	void calcArea() 
	{
		area=length*breadth;	
	}
}
class Circle extends Shape
{
	private float radius;
	
	@Override
	void acceptInput() 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter radius: ");
		radius=sc.nextFloat();
	}
	@Override
	void calcArea() 
	{
		area=3.142f * radius *radius;
	}
}
public class Day3 
{
	public static void main(String[] args)
	{
		Shape s=new Rectangle();
		s.acceptInput();
		s.calcArea();
		s.display();
		
	}

}
