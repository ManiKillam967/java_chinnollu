package INheritance;

class a
{  int x;
public a()
{
  System.out.println("default a class constructor");	
}
public a(int x)
	{
		this.x = x;
        System.out.println(x);
	}
}
class b extends a 
{
	char t;
double z;
	public b(int x , char y)
	{
		super(x);
		this.t=y;
		System.out.println( "output " + x + "  " + y);
	}
	public b (int x, char y, double z)
	{
		this(x,y);
		this.z=z;
		System.out.println(z);
	}
}
public class Single 
{
public static void main(String[] args) 
{
	b b1 = new b(34,'a');
	a a1 = new a(45);
	b b2 = new b(78,'R',34.90);
	a c1  = new a();
}
}
