package exception;

public class Arithmeticexample {
	public static void main(String[]args) {
		System.out.println("Welcome");
		int a=5;
		int b=0;
		System.out.println(a+b);
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("Do not divide any number by "+b);
		}
		System.out.println(a-b);
		System.out.println("Thank you");
	}

}
