package exception;

public class NullpointExcep {
	public static void main(String[]args) {
System.out.println("Welcome");
String a=null;
try {
System.out.println(a.toUpperCase());
}
catch(ArithmeticException ae) {
	System.out.println("assign a value");
}
catch(NullPointerException n) {
	System.out.println(n);
	n.printStackTrace();
}
catch(Exception e) {
	System.out.println(" assign");
}
System.out.println("Thank you");
}
}
