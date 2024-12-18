package proj_encap2;

public class Bank 
{
	public static void main(String[] args) 
	{
		SavingsAccount s=new SavingsAccount();
		s.deposit(1000);
		s.withdraw(500);
		double interest=s.calculateInterest();
		System.out.println("Interest for Saving Account"+interest);
		
		CheckingAccount c=new CheckingAccount();
		c.deposit(2000);
		c.withdraw(1000);
		c.applyMonthlyFee();
		interest=c.calculateInterest();
		System.out.println("Interest for checking Account"+interest);
		
	}

}
