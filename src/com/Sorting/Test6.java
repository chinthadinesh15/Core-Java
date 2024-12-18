package com.Sorting;
import java.util.*;

// using user input data and sort
class Employees implements Comparable<Employees>
{
	private int  id;
	private String name;
	private String email;
	private String department;
	private int salary;
	
	public Employees()
	{
		
	}
	public Employees(int id,String name,String email,String department,int salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.email=email;
		this.department=department;
		this.salary=salary;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	public void setDepartment(String department)
	{
		this.department=department;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	@Override
	public String toString()
	{
		return id+" "+name+" "+email+" "+department+" "+salary;
	}

	
	@Override
	public int compareTo(Employees e2) 
	{
      Employees e1=this;
      Integer s1=e1.id;
      Integer s2=e2.id;
      
      return s1.compareTo(s2);
		
	}
}
public class Test6 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Employees> al=new ArrayList<Employees>();
		
		System.out.println("Enter the number of Employees");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			Employees e=new Employees();
			System.out.println("Enter the details of "+i+" employee");
			String input=sc.next();
			String []arr=input.split(",");
			
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setEmail(arr[2]);
			e.setDepartment(arr[3]);
			e.setSalary(Integer.parseInt(arr[4]));
			
			al.add(e);
			
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		sc.close();
	}

}
