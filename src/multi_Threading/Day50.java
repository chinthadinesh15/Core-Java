package multi_Threading;

// dead Lock
class Warriors extends Thread
{
	
	String res1="BRAHMASTRA";
	String res2="PASHUPATASTRA";
	String res3="SARPASTRA";
	@Override
	public void run() 
	{
		String name=Thread.currentThread().getName();
		
		if(name.equals("ARJUNA"))
		{
			arjuna();
		}
		else
		{
			karna();
		}
	}
	public void arjuna()
	{
		try
		{
			Thread.sleep(3000);
			synchronized (res1)
			{
				System.out.println("Arjuna acquired :"+res1);
			    Thread.sleep(3000);
			   synchronized (res2) 
			   {
				System.out.println("Arjuna acquired :"+res2);
			   }
			   Thread.sleep(3000);
			   synchronized (res3)
			   {
				   System.out.println("Arjuna acquired :"+res3);
			   }
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	void karna()
	{
		try
		{
			Thread.sleep(3000);
			synchronized (res3)
			{
				System.out.println("Karna acquired :"+res3);
			    Thread.sleep(3000);
			   synchronized (res2) 
			   {
				System.out.println("Karna acquired :"+res2);
			   }
			   Thread.sleep(3000);
			   synchronized (res1)
			   {
				   System.out.println("Karna acquired :"+res1);
			   }
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class Day50
{
	public static void main(String[] args) 
	{
		Warriors w1=new Warriors();
		Warriors w2=new Warriors();
		
		w1.setName("ARJUNA");
		w2.setName("KARNA");
		
		w1.start();
		w2.start();
	}

}
