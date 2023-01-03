package Interview;

import java.util.Scanner;

//second highest number in an array
public class FAct_systems1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter size of an array");
	int size = scan.nextInt();
	int temp;
	int a1[]= new int[size]; 
    for(int i=0;i<size;i++) {
    	a1[i]=scan.nextInt();
    }
	
    for(int j=0;j<size;j++)
    {
    	for(int k=j+1;k<size;k++)
    	{
    		if(a1[j]>a1[k])
    		{
    			temp = a1[j];
    			a1[j]= a1[k];
    			a1[k]=temp;
    		}
    	}
    }
    System.out.println(a1);
    System.out.println(a1[size-1]);
    
}
}
