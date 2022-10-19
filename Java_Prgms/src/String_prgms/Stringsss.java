package String_prgms;
public class Stringsss {

	public static void main(String[] args) {
		String s1 ="  therewill be a small change in the company address"  ;
		System.out.println(s1.substring(1));
		System.out.println(s1.indexOf('e'));
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.trim());
		String s2 = "sachin";
		s2.concat("tendulkar");
		System.out.println(s2);
		
		String s3 = new String("mahendra");
		System.out.println(s3.concat("singh dhoni"));
		
		String s4 = "sachin";
		s4 =s4.concat("tendulkar");
		System.out.println(s4);
	}
}
