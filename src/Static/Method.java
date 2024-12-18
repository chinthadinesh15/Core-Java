package Static;

class Car
{
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public static void mileStone(float mile)
	{
		System.out.println(mile * 1.6f);
	}
}
public class Method 
{
	public static void main(String[] args)
	{
		Car c=new Car();
		c.setName("nano");
		c.mileStone(2);
		Car.mileStone(2);
		
	}

}