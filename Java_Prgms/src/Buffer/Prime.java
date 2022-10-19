package Buffer;

public class Prime {
   public static void main(String[] args) 
  {
    int a[] = {6,9,13,90,63,23,37};
    int rem,c=0;
    for(int i=0;i<=a.length-1;i++)
        	{
    		for(int j=2;i<=a[i]/2;j++)
    		{
    			rem = (a[i]%j);
    		    if(rem == 0)
    		    {
    		        System.out.println(a[i] + "is not a prime");
    		    	break;
    		    }
    		    else {
    		  System.out.println(a[i] + "is a prime");    
    		}
    		    
    	}
    }
    

}}