package encapsulation;

import java.util.Scanner;

class Employees
{
	private int id;
	private String name;
	private String email;
	private String department;
	private float salary;
	
	public Employees()
	{
		
	}
	public Employees(int id,String name,String email,String department,float salary)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.department=department;
		this.salary=salary;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
public class day_25A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Employees []a=new Employees[n];
		
		for(int i=0;i<a.length;i++)
		{
			String s=sc.next();
			String arr[]=s.split(",");
			
			int id=1001 + i;
			String name=arr[0];
			String email=arr[1];
			String department=arr[2];
			float salary=Float.parseFloat(arr[3]);
			
			Employees e=new Employees(id,name,email,department,salary);
			
			a[i]=e;	
		}
		for(int i=0;i<a.length;i++)
		{
			Employees e=a[i];
			System.out.println("\nEMPLOYEE : "+ (i+1) + " DETAILS");
			System.out.println("Id : " + e.getId());
			System.out.println("Name : "+ e.getName());
			System.out.println("Email :"+ e.getEmail());
			System.out.println("Department :"+e.getDepartment());
			System.out.println("Salary :" +e.getSalary());
		}
		
	}
}
