/*\
 * 
    *
   ***
  *****
 *******
*********
 */

package Arrays;
import java.util.Scanner;

public class A3 
{
public static void main(String[] args) {
	
	{
	 	Scanner scan = new Scanner(System.in);
	 	System.out.println("enter no of rows");
		int x= scan.nextInt();
		int stars=0;
		int spaces = x;
		for(int i=1;i<=x;i++)
		{
			stars+=2;
			spaces--;
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=stars-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
}