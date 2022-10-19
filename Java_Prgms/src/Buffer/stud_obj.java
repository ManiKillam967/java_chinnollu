package Buffer;


class student
{
	int rollno;
	String name;
	String address;
	String branch;
	double percent;
   public student(int a,String b,String c,String d,Double e)
   {
	    
	    rollno =a;
	    name = b;
	    address=c;
	    branch=d;
	    percent =e;
	  	    
   }
   public void print()
   {
	   
	   System.out.println(rollno + name + address + branch + percent);
   
   }
}
public class stud_obj
{

	public static void main(String[] args) 
	{
		student s1 = new student(10,"mani","kphb","ece",76.89);
	    s1.print();
	}
}
