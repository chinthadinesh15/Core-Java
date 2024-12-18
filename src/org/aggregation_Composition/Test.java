package org.aggregation_Composition;

class Charger
{
	String brand;
	float voltage;
	
	public Charger(String brand,float voltage)
	{
		this.brand=brand;
		this.voltage=voltage;
		
	}
}
class Os
{
	String name;
	float size;
	
	public Os(String name,float size)
	{
		this.name=name;
		this.size=size;
	}
}
class Mobile
{
	Charger charger;
	Os os;
	
	public Mobile()
	{
		os = new Os("lollipop",512.0f);         //composition
	}
	void setCharger(Charger charger)
	{
		this.charger=charger;                    //achieved aggregation
		
	}
}

public class Test 
{
	public static void main(String[] args) 
	{
		Mobile mymobile = new Mobile();
		Charger myCharger=new Charger("mi ",40);
		
		mymobile.setCharger(myCharger);             //achieved aggregation
	    
		System.out.println(mymobile.os.name);
		System.out.println(mymobile.os.size);
		System.out.println(mymobile.charger.brand);
		System.out.println(mymobile.charger.voltage);
		
		//mymobile=null; 
	}
	

}
