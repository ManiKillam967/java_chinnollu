package Collections_Arraylist;

import java.util.ArrayList;

public class Array_list_2 
{
public static void main(String[] args) 
{
    
	ArrayList h1 = new ArrayList();
	h1.add("baby");
	h1.add("pull");
	h1.add("me closer");
	h1.add("in");
	h1.add("23");
	h1.add("34.90");
	h1.add('F');
   
	
	System.out.println("h1_Array     ::::" + h1);
    ArrayList h3 = new ArrayList();
	
	h3.add("baby12");
	h3.add("pull34");
	h3.add("me closer56");
	h3.add("in78");
	h3.add("239_910");
	h3.add("34.9099");
	h3.add('H');

	System.out.println("h3_Array    ::::" + h3);
	//add total collection into an arraylist
	ArrayList h2 = new ArrayList();
	h2.addAll(h1);
	h2.addAll(h3);
	System.out.println(h2); 
	System.out.println("ok" + h1);
	System.out.println(h2);
	
	h2.removeAll(h3);
	System.out.println(h2);
    h2.removeAll(h1);
    System.out.println(h2);
	
	
}
}
