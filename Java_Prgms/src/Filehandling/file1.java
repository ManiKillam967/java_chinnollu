package Filehandling;
import java.io.*;
public class file1 {
public static void main(String[] args) throws IOException {
	 File f1 = new File("map1.txt");
	  FileOutputStream fout = new FileOutputStream(f1,true); //opening file in write mode
	  String s1 = "where ever we go this is our fortress";
	  fout.write(s1.getBytes());
	/*if(f1.exists())
	  {
		  System.out.println("thankyou");
		  System.out.println(f1.getName());
		  System.out.println(f1.getAbsolutePath());                                                                                
	  }
	*/
	  System.out.println("write mode done");
	  fout.close();	  
	  FileWriter fr = new FileWriter(f1); 
	  String s2 = "where ever we go this is our fortress2" ;
	  fr.write(s2);
	  System.out.println("writemode on ");
	  fr.close();	  
}}


