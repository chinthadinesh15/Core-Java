package encapsulation;


public class Library {
	private String name;
	private String address;
	public  void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setaddress (String address)
	{
		this.address=address;
	}
	public String getaddress()
	{
		return this.address;
	}
	public void displaybookDetails(Book b)
	{
		System.out.println("Book Details:"+b.gettitle()+" "+b.getauthor()+" "+b.getisbn());
		
	}

}
