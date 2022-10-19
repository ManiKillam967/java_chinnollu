package Collections_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_sort 
{
public static void main(String[] args) 
{
    ArrayList <Integer>a1 = new ArrayList();
    a1.add(23);
    a1.add(78);
    a1.add(11);
    a1.add(587);
    a1.add(45);
    System.out.println("Before sorting"+ a1);
    Collections.sort(a1);
    System.out.println("After sorting"+ a1);
    
    //sorting in descending order
    Collections.sort(a1,Collections.reverseOrder());
    System.out.println(a1);
    
    //shuffling collection 
    Collections.shuffle(a1);
    System.out.println(a1);
    
    
	
}
}
