package Buffer;

public class string_immutable
{
public static void main(String[] args) 
{
   String s1= "manikanta";
  System.out.println(s1);
   for(int i=0;i<=4;i++)
   {
	   s1="regular";
	   System.out.println(s1);
   }
   
   String s2 ="sql";
   String s4 ="sql";
   
   System.out.println(s2 + s4);
   System.out.println();
   
   
   //Creating using string objects
   
		   String o1 =  new String("html");
		 //  String o1 = new String("keka");
		   System.out.println(o1);
		   o1 = "keka";
		   System.out.println(o1);
		   int i1 = 34;
		  System.out.println(i1);
		   i1 = 56+30;
		   System.out.println(i1);
		   String k1 = "MAni";
		   k1 = "Mani" + "delecacy";
		   System.out.println(k1);
		  k1=  k1.concat("manikanat");
		   System.out.println(k1);
		   System.out.println(k1);
		   k1= "hello";
          System.out.println(k1);
  
          int v1 = 90;
          int v2 = 90;
          int v3 = 90;
         
      System.out.println(v1);
      System.out.println(v2);    
      System.out.println(v3);
       
      v2=60;
      
    System.out.println(v1);
    System.out.println(v2);    
    System.out.println(v3);
     
      
}
}
