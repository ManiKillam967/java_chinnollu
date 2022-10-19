package Buffer;

public class buf 
{
public static void main(String[] args) 
{
    int arra1[] = { 5,89,45,16,78,18,45,11 };
    int c1=0;
	int c2=0;
	int c3=0;
    for(int x : arra1)  	
    {
     	
    	if(x>18)
    	{
    		//System.out.println(x);
    		c1++;
    	}	
    	else if(x<18)
    	{
    		//System.out.println(x);
    		c2++;
    	}
    	else
    	{
    		//System.out.println(x);
    		c3++;
    	}
    	
    }
    System.out.println("number of adults  " + c1);
	System.out.println("number of chilren "+c2);
	System.out.println(c3);
	
}
}
