package constructors_abc;

class apple
{
      static int x;
	public apple(){
		
		x++;
	}}


class orange 
{
	const_a h1 =  new const_a(45,44.22);
	public static void amount1() 
	{
	System.out.println("inside orange class amount1 method");	
	}
}

public class const_a 
{
	 private const_a()
	{
		 System.out.println("inside default constructor");	
	}
	public const_a(int a , double d)
    {
	System.out.println("inside parameterised constructor");	
	}
public static void main(String[] args) 
{
     apple a1 = new apple();
     
     apple b12 = new apple();
	
     orange l1 =  new orange();
     l1.amount1();
     
     orange.amount1();
     
     apple i22 = new apple();
     
   const_a x1 = new const_a(3,2.6);
 //  const_a x2 = new const_a();

     
    orange l1_ =  new orange();
     
     apple b122 = new apple();
     apple b12g = new apple();

    orange l61 =  new orange();

  //   orange l51 =  new orange();
     System.out.println(apple.x);
}

public void amount()
{
	 System.out.println();
	// const_a x3 = new const_a();
}
}



