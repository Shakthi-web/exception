package exception;
import java.util.Scanner;

public class Mailid {
	public static void main(String[]args)throws MailException {
		String y="@gmail.com";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id");
		String a=s.next();
		if(a.contains(y)) {
			System.out.println("logged in");
		}
		else {
			throw new MailException("Wrong id");
		}
		}
	}
