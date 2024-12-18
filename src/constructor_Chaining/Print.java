package constructor_Chaining;


class Tap
{
	int x,y;

	Tap()
	{
		//super();
		x=100;
		y=200;
	}
	Tap(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
class Tap2 extends Tap
{
	int a,b;

	Tap2()
	{
		a=300;
		b=400;
	}
	Tap2(int a,int b)
	{
		//super();
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

class Print
{
	public static void main(String args[])
	{
		Tap2 t=new Tap2(9,99);
		t.disp();
	}
}