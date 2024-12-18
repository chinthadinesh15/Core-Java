package org.problems_OOPS;

import java.util.Scanner;

class BankAccount
{
	protected String accName;
	protected String accNo;
	protected String bankName;
	public BankAccount(String accName, String accNo, String bankName) 
	{
		super();
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
	}
	
	public void display()
	{
		System.out.println("Account Name: "+accName);
		System.out.println("Account Number: "+accNo);
		System.out.println("Bank Name: "+bankName);
	}
}

class CurrentAccont extends BankAccount
{
	protected String tinNumber;

	public CurrentAccont(String accName, String accNo, String bankName, String tinNumber)
	{
		super(accName, accNo, bankName);
		this.tinNumber = tinNumber;
	}
	@Override
	public void display() 
	{
		super.display();
		System.out.println("Tin Number: "+tinNumber);
	}
}
class SavingAccount extends BankAccount
{
	private String orgName;

	public SavingAccount(String accName, String accNo, String bankName, String orgName)
	{
		super(accName, accNo, bankName);
		this.orgName = orgName;
	}
	@Override
	public void display() 
	{
		super.display();
		System.out.println("Organization Name: "+orgName);
	}
	@Override
	public String toString() 
	{
		return super.toString();
	}
}


public class Day_OopsProblems 
{
	 public static void main(String[] args)
	 {
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Chhpse type of Account");
		 System.out.println("1.Saving Account");
		 System.out.println("1.Current Account");
		 
		 int choice=sc.nextInt();
		 sc.nextLine();
		 
		 if(choice==1)
		 {
			 System.out.println("Enter the account details (Account Name, Account Number,Bank Name, Organization)");
			 String accDetails=sc.nextLine();
			 
			 String [] details=accDetails.split(",");
			 BankAccount savingAccount= new CurrentAccont(details[0],details[1],details[2],details[3]);
			 savingAccount.display(); 
		 }
		 else if(choice==2)
		 {
			 System.out.println("Enter the account details (Account Name, Account Number,Bank Name, Organization)");
			 String accDetails=sc.nextLine();
			 
			 String [] details=accDetails.split(",");
			 BankAccount currentAccount= new CurrentAccont(details[0],details[1],details[2],details[3]);
			 currentAccount.display(); 
		 }
		 else
		 {
			 System.out.println("Invalid Choice:..Enter a valid Choice ");
		 }
	 }

}
