package exception;
import java.util.Scanner;
public class VoterApplication {
public static void main(String[]args)throws AgeException {
	System.out.println("Welcome");
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your name");
	String a=s.next();
	System.out.println(a.toUpperCase());
	System.out.println("Enter age");
	int c=s.nextInt();
	if(c>=18) {
		System.out.println("Eligible");
	}
	else {
		throw new AgeException("you are below 18");
	}
	System.out.println("Enter gender");
	String b=s.next();
	System.out.println("Thank you");
}
}
