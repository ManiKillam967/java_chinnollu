package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class BuBBle_sort 
{
   public static void main(String[] args) 
   {
	 int a[] = {45,76,92,12,90,22,11};
	 int l = a.length;
	 for(int i=0;i<l-1;i++)
	 {
		 for(int j=0;j<l-1;j++)
		 {
			 if(a[j] > a[j+1] )
			 {
			 int temp = a[j];
             a[j]=a[j+1];    
			 a[j+1]=temp;
		 }
		 } 
	 }
	   System.out.println("sorted array" + Arrays.toString(a));
	   
}
	
}
