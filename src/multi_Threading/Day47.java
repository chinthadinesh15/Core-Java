package multi_Threading;


// Damean Thread

class Captain extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Captain enters the Ground");
		
		try
		{
			BattingCoach bac=new BattingCoach();
			bac.setName("Bac");
			
			BowlingCoach boc=new BowlingCoach();
			boc.setName("Boc");
			
			bac.setDaemon(true);
			boc.setDaemon(true);
			
			bac.start();
			boc.start();
			
			Thread.sleep(3000);
			System.out.println("Captain will do Warm-up");
			Thread.sleep(3000);
			System.out.println("Captain will do Catching");
			Thread.sleep(3000);
			System.out.println("Captain will do Running");
			Thread.sleep(3000);
			System.out.println("Captain will do Bowling");
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Captain will go to hotel");
	}
}
class BattingCoach extends Thread
{
	@Override
	public void run() 
	{
		for(; ;)
		{
			System.out.println("Batting Coach is in The Ground");
			try 
			{
				Thread.sleep(3000);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
	}
}
class BowlingCoach extends Thread
{
	@Override
	public void run()
	{
		for(; ;)
		{
			System.out.println("Bowling coach is in the Ground");
			try
			{
				Thread.sleep(3000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
	}
}
public class Day47 {

	public static void main(String[] args) 
	{
		Captain c=new Captain();
		c.setName("Captain");
		
		c.start();

	}

}
