package encapsulation;
class Customer
{
	private String name;
	private long cin;
	private float balance;
	private long accountNo;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setCin(long cin)
	{
		this.cin=cin;
	}
	public long getCin()
	{
		return cin;
	}
	public void setBalance(float balance)
	{
		this.balance=balance;
	}
	public float getBalance()
	{
		return balance;
	}
	public void setAccountNo(long accountNo)
	{
		this.accountNo=accountNo;
	}
	public long getAccountNo()
	{
		return accountNo;
	}
}
public class Main 
{
	public static void main(String[] args) 
	{
		 Customer b=new Customer();
		 b.setName("Dinesh Deepu");
		 b.setCin(3351);
		 b.setBalance(100000);
		 b.setAccountNo(3351801);
		 
		 System.out.println(b.getName());
		 System.out.println(b.getCin());
		 System.out.println(b.getBalance());
		 System.out.println(b.getAccountNo());
		
	}

}
