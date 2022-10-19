package Collections_Arraylist;
import java.util.*;
public class Arraylistt_1
{
public static void main(String[] args) 
{
     ArrayList a1 = new ArrayList();
     
	  //add elements in ARRAYLIST
     a1.add(100);
     a1.add("manikanta");
     a1.add("213.313");
     a1.add('Q');
     a1.add(true);
     
     //Printing elements of an arraylist
    System.out.println(a1);
	System.out.println("number of elements in arraylist  " + a1.size());
    
	//Remove elements in an arraylist using INDEX value 
	a1.remove(3);
	//remove elements in Arraylist using values present in it
	a1.remove("manikanta");
	System.out.println(a1);
	
    //adding elements in an arraylist using index value
	a1.add(1, "kanta");
    System.out.println(a1);
	
    //adding elements in an arraylist at the end of arraylist
    a1.add("xerox"); 
    System.out.println(a1);
    
    //printing elements using index values
    System.out.println(a1.get(3));
    
    //change or replace element in arraylist
    a1.set(1,300);
    System.out.println(a1);
    
    //search elements present in arraylist
   Boolean b1 = a1.contains("xeroX");
    System.out.println(b1);
    
    System.out.println(a1.isEmpty());
    
      //a1.add(7,"ganesha");
      //System.out.println(a1);
    a1.remove("xerox");
    System.out.println(a1);
    
      
   //Read data from an ArrayList
  
    //using for loop
    System.out.println("reading elements using for loop");

    System.out.println("reading elements using for loops");
    for(int i=0;i<=a1.size()-1;i++)
    {
    	System.out.println( a1.get(i));    	
    }
 
    //using for each loop
    System.out.println("reading elements using foreach loop");
    for(Object o1:a1)
    {
    	System.out.println(o1);
    }
    
    //using iterator method
    System.out.println("using iterator method");
    Iterator it1 = a1.iterator();
    while(it1.hasNext())
    {
    	System.out.println(it1.next());
    }
    
    
    
    
    
    
    

}
}
