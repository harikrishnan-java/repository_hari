package projectnumber_one;

public class Class_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="java";
System.out.println(s.length());

String s1="java";
String s2="Java";
String s3="java";
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s.startsWith("ja"));
System.out.println(s.endsWith("va"));
System.out.println(s.charAt(2));
int x=100;
System.out.println(String.valueOf(x));
}
}