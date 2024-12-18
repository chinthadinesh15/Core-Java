package multi_Threading;

// synchronized
class BathRoom
{
	synchronized void bathRoom()
	{
		try
		{
			String name=Thread.currentThread().getName();
			System.out.println(name+" has entered the bathRoom");
			Thread.sleep(3000);
			System.out.println(name+" is using the bathroom");
			Thread.sleep(3000);
			System.out.println(name+" has excited from the bathroom");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Boy extends Thread
{
	BathRoom ba;
	
	@Override
	public void run() 
	{
		ba.bathRoom();
	}
	public  Boy(BathRoom ba)
	{
		this.ba=ba;
	}
}
class Girl extends Thread
{
	BathRoom ba;
	
	@Override
	public void run() 
	{
		ba.bathRoom();
	}
	
	public Girl(BathRoom ba)
	{
		this.ba=ba;
	}
}
class Others extends Thread
{
	BathRoom ba;
	
	@Override
	public void run() 
	{
		ba.bathRoom();
	}
	
	public Others(BathRoom ba)
	{
		this.ba=ba;
	}
}
public class Sysn 
{
	public static void main(String[] args) 
	{
		BathRoom ba=new BathRoom();
		
		Boy b=new Boy(ba);
		Girl g=new Girl(ba);
		Others o=new Others(ba);
		
		b.setName("Boy");
		g.setName("Girl");
		o.setName("Others");
		
		try
		{
			b.start();
			b.join();
			g.start();
			g.join();
			o.start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
