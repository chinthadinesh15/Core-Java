package com.Sorting;

import java.util.ArrayList;
import java.util.Collections;


class Employee implements Comparable<Employee>
{
	private int  id;
	private String name;
	private String department;
	private int salary;
	
	public Employee()
	{
		
	}
	public Employee(int id,String name,String department,int salary)
	{
		super();
		this.id=id;
		this.name=name;
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
		return id+" "+name+" "+department+" "+salary;
	}

	
	@Override
	public int compareTo(Employee e2) 
	{
      Employee e1=this;
      String s1=e1.name;
      String s2=e2.name;
      
      return s1.compareTo(s2);
		
      // using inbuilt method of compareTo in Integer Class.
      
//		Integer id1=e1.id;
//		Integer id2=e2.id;
//		
//		int n=id1.compareTo(id2);
//		return n;
		
		// using logic without inbuilt method of compareTo of Integer class
		
//		if(id1>id2)
//		{
//			return 1;
//		}
//		else if(id2>id1)
//		{
//			return -1;
//		}
//		else
//		{
//			return 0;
//		}
		
	}
}
public class Test5 
{
	public static void main(String[] args)
	{
		Employee e1=new Employee(2,"tim","IT",100000);
		Employee e2=new Employee(1,"Jeeva","IT",200000);
		Employee e3=new Employee(3,"Raju","IT",100000);
		
		ArrayList al=new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}

}
