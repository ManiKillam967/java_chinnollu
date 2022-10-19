package Mani_buffer;

public class String_reverse {
public static void main(String[] args) {
	  String s1 = "manikanta";
	  String s2 = "";
	  System.out.println(s1.length());
	  for(int  i=s1.length()-1;i>=0;i--)
	  {
		  char ch = s1.charAt(i);
		  s2 = s2+ch;
      }
	  System.out.println(s2);
}}
