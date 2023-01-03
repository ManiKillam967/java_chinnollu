package Interview;

import java.util.Scanner;

public class reverse_tarun {
public static void main(String[] args) {
    Scanner c2 = new Scanner(System.in);
    System.out.println("enter any sentence");
	String s1 =c2.next();
	System.out.println(s1.length());
	String a1[] = s1.split(" ");
	System.out.println(a1.length);
	char c1;
	String temp="";
	String temp2 = "";
    for(int i=0;i<a1.length;i++) {
    	String word = a1[i];
    	String temp3="";
    //	System.out.println(word); 
    	for(int j=word.length()-1;j>=0;j--) {
    		 c1 = word.charAt(j);
    	    temp3= temp3 + c1;
    	}
    	//System.out.println(temp);
    	temp2 = temp2 + temp3 + " ";   
    }
    
    System.out.print(temp2);
}
public void sub1() {
	
}

}