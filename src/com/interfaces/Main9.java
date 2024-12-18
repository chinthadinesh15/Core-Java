package com.interfaces;

interface OperatingSystem
{
	 void boot();
	abstract public void shutdown();
	default void update()
	{
		System.out.println("Update to latest Version");
	}
	static  void installApp()
	{
		System.out.println("Instal App"); 	
	}
	 
}

class Mac implements OperatingSystem
{
	@Override
	public void boot()
	{
		System.out.println("Mac is booting");
		
	}
	@Override
	public void shutdown() 
	{
		System.out.println("Mac is ShutDowning");
		
	}
	public void update()
	{
		System.out.println("Mac is updating for latest Version");
	}
}
class Windows implements OperatingSystem
{
	@Override
	public void boot() 
	{
		System.out.println("Window is booting");
	}
	@Override
	public void shutdown()
	{
		System.out.println("Window is Shutdowning");
		
	}
	public void update()
	{
		System.out.println("Window is updating for latest Version");
	}
}
class linux implements OperatingSystem
{
	@Override
	public void boot() 
	{
		System.out.println("Linux is booting");
	}
	@Override
	public void shutdown()
	{
		System.out.println("Linux is Shutdowning");
		
	}
	
}
public class Main9 
{
	public static void main(String[] args) 
	{
		OperatingSystem myOs= new linux();
		myOs.boot();
		myOs.shutdown();
		myOs.update();
		
		OperatingSystem.installApp();
	}

}
