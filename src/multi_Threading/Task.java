package multi_Threading;

// join method
class Print extends Thread
{
	

	@Override
	public void run() 
	{
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+" is started to excute");
		System.out.println(t.getName()+" is   excuting");
		System.out.println(t.getName()+" is   excuting");
		System.out.println(t.getName()+" is   excuting");
		System.out.println(t.getName()+" is   excuted");
		
	}
}
public class Task 
{
	public static void main(String[] args) 
	
	{
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+" is started to excute");
		System.out.println(t.getName()+" is Excuting");
		System.out.println(t.getName()+" is Excuting");
		Print p1=new Print();
		p1.start();
		try 
		{
			p1.join();
		} catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		System.out.println(p1.isAlive());
		System.out.println(t.getName()+" is Excuting");
		System.out.println(t.getName()+" is Excuted");

		
	}
	
	
}
