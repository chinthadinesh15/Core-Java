package encapsulation;

import java.util.Scanner;

class Employee
{
	private int id;
	private String name;
	private String email;
	private String department;
	private float salary;
	
	public Employee()
	{
		
	}
	public Employee(int id,String name,String email,String department,float salary)
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
public class day25 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Employee[] a=new Employee[n];
		
		for(int i=0;i<a.length;i++)
		{
			int id=1001+i;
			String name=sc.next();
			String email=sc.next();
			String department=sc.next();
			float salary=sc.nextFloat();
			
			Employee e=new Employee(id,name,email,department,salary);
			a[i]=e;
		}
		 
		for(int i=0;i<a.length;i++)
		{
			Employee e=a[i];
			System.out.println("\nEMPLOYEE : "+ (i+1) + " DETAILS");
			System.out.println("Id : " + e.getId());
			System.out.println("Name : "+ e.getName());
			System.out.println("Email :"+ e.getEmail());
			System.out.println("Department :"+e.getDepartment());
			System.out.println("Salary :" +e.getSalary());
		}
		
	}

}
