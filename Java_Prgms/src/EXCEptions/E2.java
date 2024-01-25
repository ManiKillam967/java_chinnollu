package EXCEptions;

import java.util.Scanner;

public class E2 
{
public static void main(String[] args) 
{
    Scanner s1 =  new Scanner(System.in); 
    System.out.println("enter two numbers");
	int x = s1.nextInt();
    int y = s1.nextInt();
    int res=0;
   try { 
   res = x/y;
   }
   catch(ArithmeticException w )
   {
    System.out.println("exception handled");
   }
   System.out.println(res);
}
}
