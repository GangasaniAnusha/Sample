package strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="anusha is in vjit which is in moinabad and leaves in hyderabad";
		String s2=new String("hello");
		System.out.println(s1.charAt(5));
//System.out.println(s2.charAt(5));
System.out.println(s1.length());
System.out.println(s2.length());
System.out.println(s1.toUpperCase());
System.out.println(s1.replace("is","hello"));
System.out.println(s1.startsWith("anusha"));
	}

}
