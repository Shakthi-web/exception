package exception;


public class Arrayindexoutofbound {
	public static void main(String[]args) {
		System.out.println("Welcome");
		try {
		String a=args[0];
		System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println("assign");
		}
		catch(ArrayIndexOutOfBoundsException i) {
			System.out.println(i);
		}
		catch(Exception y) {
			System.out.println("assign value");
		}
		finally {
			System.out.println("hello");
		}
		System.out.println("Thank you");
	}

}
