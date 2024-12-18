package com.sorting_using_Comparator;


import java.util.*;
class  Demo1 implements Comparator<Employee>
{
	@Override
	public  int compare(Employee e1,Employee e2)
	{
		Integer i1=e1.getId();
		Integer i2=e2.getId();
		
		return i1.compareTo(i2);
	}
}
class Demo2 implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1,Employee e2)
	{
		String s1=e1.getName();
		String s2=e2.getName();
		
		return s1.compareTo(s2);
	}
}
class Demo3 implements Comparator<Employee>
{
	@Override
    public int compare(Employee e1,Employee e2)
    {
    	String s1=e1.getEmail();
    	String s2=e1.getEmail();
    	
    	return s1.compareTo(s2);
    }
}
class Demo4 implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) 
	{
		String s1=e1.getDepartment();
		String s2=e2.getDepartment();
		
		return s1.compareTo(s2);
	}
}
class Demo5 implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) 
	{
		Integer i1=e1.getSalary();
		Integer i2=e2.getSalary();
		
		return i1.compareTo(i2);
	}
}
class Employee 
{
	private int  id;
	private String name;
	private String email;
	private String department;
	private int salary;
	
	public Employee()
	{
		
	}
	public Employee(int id,String name,String email,String department,int salary)
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
		this.email = email;
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

	
	
}
public class Test9
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		Demo4 d4=new Demo4();
		Demo5 d5=new Demo5();
		
		TreeSet<Employee> al=null;
		
		System.out.println("Sort Based on\n 1.ID\n 2.NAME\n 3.EMAIL\n 4.DEPARTMENT\n 5.SALARY");
		int option=sc.nextInt();
		
		switch(option)
		{
		    case 1:al=new TreeSet<Employee>(d1);
		           break;
		    case 2:al=new TreeSet<Employee>(d2);
	           break;
		    case 3:al=new TreeSet<Employee>(d3);
	           break;
		    case 4:al=new TreeSet<Employee>(d4);
	           break;
		    case 5:al=new TreeSet<Employee>(d5);
	           break;  
	           default:System.out.println("Invalid Input");
		}
		
		System.out.println("Enter the number of Employees");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			Employee e=new Employee();
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
		sc.close();
	}

}
