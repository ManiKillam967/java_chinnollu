package Buffer;

public class Prime11 
{
public static void main(String[] args) 
{
	int ar[] = {23,45,67,31,98,7};
    int rem;
    for(int j=0;j<ar.length-1;j++)
    {
     int count=0;
	    for(int i=1;i<=ar[j];i++)
	    {
	    	rem = (ar[j]%i);
	    	if(rem==0)
	    	{
	    		count++;
	    	}
	    }
	if(count<=2)
	{
		System.out.println(count);
		System.out.println(ar[j] + "  Prime");
	}
	else
	{
		System.out.println(count);
		System.out.println(ar[j] +  "  not a prime");
	}}
}
}