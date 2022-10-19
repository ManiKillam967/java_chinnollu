package Buffer;

public class String_Methods 
{
	public static void main(String[] args) {
	  String s1 = "wancura";
	  
	  //size
	  System.out.println("size : " + s1.length());
	  
	String s2 = new String("Carry Minati");	
    s2 = s2.substring(3);
    System.out.println(s2);
     int i1=s2.indexOf(" ");
     System.out.println(i1);
}
}
