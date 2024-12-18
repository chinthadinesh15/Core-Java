package multi_Threading;

class Queue
{
	private int data;
	boolean dataisPresent=false;

	public synchronized void setData(int data) 
	{
		if(dataisPresent==false)
		{
			this.data = data;
			System.out.println("Producer produced:"+data);
			dataisPresent=true;
			notify();
			
		}
		else
		{
			try 
			{
				wait();
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	public synchronized void getData() 
	{
		if(dataisPresent==true)
		{
			System.out.println("Consumer consumed :"+data);
			dataisPresent=false;
			notify();
		}
		else
		{
			try 
			{
				wait();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Producer extends Thread
{
	Queue q;
	Producer(Queue q)
	{
		this.q=q;
	}
	@Override
	public void run() 
	{
		int i=1;
		for(; ;)
		{
			q.setData(i++);
		}
	
	}
}
class Consumer extends Thread
{
	Queue q;
	
	public Consumer(Queue q)
	{
		this.q=q;
	}
	@Override
	public void run() 
	{
		for(; ;)
		{
			q.getData();
		}
	}
}

public class Day51 
{
	public static void main(String[] args) 
	{
		Queue q=new Queue();
		
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		p.setName("PRODUCER");
		c.setName("CONSUMER");
		
		p.start();
		c.start();
				
	}

}
