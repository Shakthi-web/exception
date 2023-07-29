package exception;

public class NumberFormat {
	public static void main(String[]args) {
		System.out.println("Welcome");
		String a=args[0];
		try {
		int x=Integer.parseInt(a);
		System.out.println(x);
		}
		catch(ArithmeticException ae) {
			System.out.println("assign int");
		}
	
		catch(NumberFormatException f) {
			System.out.println(f);
			f.printStackTrace();
			
		}
		catch(Exception e) {
			System.out.println("assign a int");
		}
		
		System.out.println("thank you");
		System.out.println("come Again");
	}
}
