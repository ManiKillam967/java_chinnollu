package String_prgms;

public class S 
{
	//program to replace numbers 
public static void main(String[] args) 
{
   String s1 ="manikADF234";
  String a1= s1.replaceAll("[^0-9]", "");
	System.out.println(a1);
	
}
}