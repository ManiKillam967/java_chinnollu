package Buffer;
class anand
{
	static int a = 20;
	public static void treat()
	{
		final int x = 30;
		System.out.println("final variable : " + x);
		System.out.println("treat for a day");
	}
}

final  class pavan
{
	int a=10;
	public static void run()
	{
		System.out.println("run 5 kms");
	}
}


class keeru extends anand
{
     int a = 40;
     public static void treat()
     {
         final int x=50;
         System.out.println(x);
    	 System.out.println("treat for a day");
     }
   
}
public class STaticvariables 
{
public static void main(String[] args) 
{
	System.out.println(anand.a);
	anand.treat();
	keeru k1 = new keeru();
	System.out.println(k1.a);
	pavan.run();
	
}
}
