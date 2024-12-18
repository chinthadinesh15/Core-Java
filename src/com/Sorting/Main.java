package com.Sorting;
import java.util.*;

class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private String email;
	private float height;
	
	public Student()
	{
		
	}
	
	public Student(int id, String name, String email, float height) 
	{
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.height = height;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return id+" "+name+" "+email+" "+height;
	}
	@Override
	public int compareTo(Student s2) 
	{
		Student s1=this;
	
		Integer i1=s1.id;
		Integer i2=s2.id;
		
	    return	s1.compareTo(s2);
	
	}
	
}
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		TreeSet<Student> t=new TreeSet<Student>();
		System.out.println("Enter the number of employees");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			Student s=new Student();
			System.out.println("Enter the details of "+i+" employee");
			String input=sc.next();
			
			String arr[]=input.split(",");
			
			s.setId(Integer.parseInt(arr[0]));
			s.setName(arr[1]);
			s.setEmail(arr[2]);
			s.setHeight(Float.parseFloat(arr[3]));
			
			t.add(s);

		}

	}

}
