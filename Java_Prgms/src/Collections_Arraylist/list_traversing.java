package Collections_Arraylist;
import java.util.*;
public class list_traversing {

	public static void main(String[] args) {
       List <String> r1 =  new ArrayList();
	   r1.add("manikanta1");
	   r1.add("manikanta2");
	   r1.add("manikanta3");
	   r1.add("manikanta4");
	   System.out.println(r1);	
	  // r1.remove("manikanta2");
	   r1.set(1,"killam");
	   System.out.println(r1);
	   Set <String>r2 = new HashSet<String>();
	   r2.add("killam1");
	   r2.add("killam2");
	   r2.add("killam3");
	   r2.add("killam4");
	   r2.add("killam5");
	   System.out.println(r2);
	   Iterator g1 = r2.iterator();
	   while(g1.hasNext())
	   {
		   System.out.print(g1);
	   }
	   
	}
}
