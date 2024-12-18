package constructor_Chaining;

class Customer
{
	int cId;
    String cName;
	int cNum;
	
	public Customer()
	{
		cId=1;
		cName="Dinesh";
		cNum=12345;
	}
	public Customer(int cId,String cName,int cNum)
	{
		this();	
	}
	
}
public class Ok
{
	public static void main(String[] args) 
	{
		Customer c=new Customer(2,"Deepu",3256);
		System.out.println(c.cId);
		System.out.println(c.cName);
		System.out.println(c.cNum);
		
	}
	
}