package proj_encap2;

public class Account 
{
	int accountNumber;
	double balance;
	public Account()
	{
		
	}
	public Account(int accountNumber, double balance)
	{
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amt)
	{
		if(amt > 0)
		{
			balance=balance+amt;
			System.out.println("Deposited Amount is: "+amt);
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	public void withdraw(double amt)
	{
		if(amt <=balance && amt >0)
		{
			balance=balance-amt;
			System.out.println("Withdrawn amount is : "+amt);
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	public double calculateInterest()
	{
		return 0.0;
	}
}
class SavingsAccount extends Account
{
	double interestRate;

	public SavingsAccount()
	{
		super();
		
	}

	public SavingsAccount(int accountNumber, double balance,double interestRate) 
	{
		super(accountNumber, balance);
		this.interestRate=interestRate;
		
	}
	@Override
	public double calculateInterest() 
	{
		
		return getBalance() *(interestRate / 100);
	}
}
class CheckingAccount extends Account
{
	double monthlyFee;

	public CheckingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckingAccount(int accountNumber, double balance,double monthlyFee) 
	{
		super(accountNumber, balance);
		this.monthlyFee=monthlyFee;
	}
	@Override
	public double calculateInterest() 
	{
		
		return 0.0;
	}
	public void applyMonthlyFee() 
	{
        withdraw(monthlyFee);
    }
	
}
