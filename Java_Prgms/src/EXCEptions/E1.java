
// INPUTMISMATCH EXCEPTION
package EXCEptions;
import java.util.InputMismatchException;

import java.util.Scanner;
public class E1 
{
public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number");
		try {
			int ch = scan.nextInt();
			System.out.println(ch);
		}
		catch(InputMismatchException e )
		{
			System.out.println("invalid number of students");
		}
	  scan.nextLine();
	  int r=0;
	  try {
			int ch = scan.nextInt();

			int ch1 = scan.nextInt();
			 r = ch*ch1;
			 System.out.println(r);
		}
		catch(InputMismatchException e )
		{
			System.out.println("invalid number of students");
		}
	
}
}
