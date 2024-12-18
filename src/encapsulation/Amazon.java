package encapsulation;

public class Amazon 
{
	String name;
	double price;
	double qty;
	
	void addTocart()
	{
		System.out.println(this.name+" Product added to cart");
		System.out.println("Cart total "+this.price*this.qty);
	}
	void makePay()
	{
		double sum=this.price*qty;
		System.out.println(sum+" RS payment DOne");
	}
}
class Watch extends Amazon
{
	String company_name;
}
class Shirt extends Amazon
{
	double size;
}
