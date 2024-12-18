package constructor_Chaining;


class Tab
{
	int x,y;

	Tab()
	{
		//super();
		x=100;
		y=200;
	}
	Tab(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
class Tab2 extends Tab
{
	int a,b;

	Tab2()
	{
		this(9,99);
		a=300;
		b=400;
	}
	Tab2(int a,int b)
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

class Main2
{
	public static void main(String args[])
	{
		Tab2 t=new Tab2();
		t.disp();
	}
}
