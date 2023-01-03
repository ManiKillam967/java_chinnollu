package INheritance;

class A1{
	public void s() {
		System.out.println("run 5 kms");
	}

//	public void t() {
//		System.out.println("run 20 kmss");
//		
//	}
}
class A2 extends  A1{
//	public void s() {
//		System.out.println("run 10 kms");
//	}	
//	
	public void t() {
		System.out.println("run 15 kms");
		//super.s();
	}
}
public class Exam_1 {	
public static void main(String[] args) 
{

	 A1 a2 = new A2();
	 ((A2) a2).t();
	
	  A2 f1 = new A2();
	  f1.s();
	  A1 f3  = new A1();
	  //((A2)f3).t();
	  
}
}
