package acer_windows;
public class prgm_windows_acer {
	
	public static void main(String[] args) 
	{
		System.out.println("starting from  main method");
		prgm_windows_acer t1 = new prgm_windows_acer();	
		t1.test_abc();
		t1.test_xyz();
		System.out.println("exit from main method");
	}
	
	public void test_abc()
	{
		System.out.println("inside method test_abc");
	}

	public void test_xyz()
	{
	System.out.println("inside method test_xyz");
	}
} 	




