package constructor_Chaining;

class Pen
{
	int x,y;

	Pen()
	{
		x=100;
		y=200;
	}
	Pen(int x,int y)
	{
		//super();
		this.x=x;
		this.y=y;
	}
}
class Pen2 extends Pen
{
	int a,b;

	Pen2()
	{
		a=300;
		b=400;
	}
	Pen2(int a,int b)
	{
		super(a,b);
		this.a=a;
		this.b=b;
	}
	void disp()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}

public class Main
{
	public static void main(String args[])
	{
		Pen2 t=new Pen2(9,99);
		t.disp();
	}
}