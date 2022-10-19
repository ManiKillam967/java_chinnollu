/*
 * 
 * * *
 * * * * *
 * * * * * * * 
 * * * * * * * * *
 */
package Arrays;
import java.util.Scanner;
public class A1
{
public static void main(String[] args) 
{
	Scanner s1 = new Scanner(System.in);
			System.out.println("enter a num");;
	int x= s1.nextInt();
	int str=-1;
    for(int i=1;i<=x;i++)
    {
    	str+=2;
    	for(int j=1;j<=str;j++)
    	{
    		System.out.print("* ");
    	}
    	System.out.println();
    }
	
}
}
