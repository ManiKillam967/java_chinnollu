package constructors_abc;

public class const_c 
{
	 public const_c()
	  {
		System.out.println("inside default constructor");   
	  }
	 public const_c(int a, char t)
	 {
		 System.out.println("inside parameterized constructor");
		 
	 }
public static void main(String[] args) 
{
      const_c a1 = new const_c(12, 'q');
      const_c a2 = new const_c();
	
}
}
