package Collections_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversions 
{
public static void main(String[] args) 
{
     String [] ar1 = {"manikanta","bloody","damn"};
     for(String d1 : ar1)
     {
    	 System.out.println(d1);
     }
	
    ArrayList a1 = new ArrayList(Arrays.asList(ar1)); 
    ArrayList a2 = new ArrayList();
    System.out.println(a1);
	
    
    
} 
}
