package Method_Overiding;

class Plane
{
	void takeOff()
	{
		System.out.println("Plane is Taking Off");
	}
	void fly()
	{
		System.out.println("Palne is Flying on the sky");
	}
	void land()
	{
		System.out.println("Plane is landing");
	}
}
class Cargoplane extends Plane
{
	@Override
	void fly()
	{
		System.out.println("CargoPlane is flying on Low level Area");
	}
	void carryCargo()
	{
		System.out.println("CargoPlane is carrying Goods ");
	}
}
class PassengesPlane extends Plane
{
	@Override
	void fly()
	{
		System.out.println("PassengerPlane is flying on mediam area");
	}
	void carrypassengers()
	{
		System.out.println("PassengerPlane carrying Passengers");
	}
}
class FigtherPlane extends Plane
{
	@Override
	void fly()
	{
		System.out.println("FighterPlane flying higher Area");
	}
	void carryFighter()
	{
		System.out.println("FigherPlane Carrying Weapons");
	}
}
public class Main 
{
	public static void main(String[] args) 
	{
		FigtherPlane f=new FigtherPlane();
		f.takeOff();
		f.fly();
		f.land();
		f.carryFighter();
		
		PassengesPlane p=new PassengesPlane();
		p.takeOff();
		p.fly();
		p.land();
		
		Cargoplane c=new Cargoplane();
		c.takeOff();
		c.fly();
		c.land();
		
	}

}
