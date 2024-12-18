package encapsulation;

public class AmazonApp 
{
	public static void main(String[] args) 
	{
		Watch w=new Watch();
		w.name="FastTrack";
		w.price=3000;
		w.qty=2;
		w.company_name="Fast";
		w.addTocart();
		w.makePay();
	}

}
