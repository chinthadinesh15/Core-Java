package org.aggregation_Composition;

class Bike
{
	String brand;
	float mileage;
	
	public Bike(String brand,float mileage)
	{
		this.brand=brand;
		this.mileage=mileage;
	}
}
class Book
{
	String name;
	String author;
	
	public Book(String name,String author)
	{
		this.name=name;
		this.author=author;
	}
}
class Heart
{
	float weigth;
	int bpm;
	public Heart(float weigth, int bpm)
	{	
		this.weigth = weigth;
		this.bpm = bpm;
	}
}
class Brain
{
	float weight;
	String colour;
	
	public Brain(float weight,String colour)
	{
		this.weight=weight;
		this.colour=colour;
		
		
	}
}
class Student
{
	Bike bike;
	Heart heart;
	
	public Student()
	{
		heart=new Heart(500.2f,72);
	}
	
	public void setBike(Bike bike)
	{
		this.bike=bike;
		}
}




public class Test1 
{
	public static void main(String[] args) 
	{
		Student myStudent =new Student();
		Bike myBike=new Bike("Yamaha",35);
		
		myStudent.setBike(myBike);
		
		System.out.println(myStudent.heart.weigth);
		System.out.println(myStudent.heart.bpm);
		
		System.out.println(myStudent.bike.brand);
		System.out.println(myStudent.bike.mileage);
		
	}

}
