package exception;
import java.util.Scanner;
public class Facebook {
	public static void main(String[]args)throws LoginException {
		int a=5678;
		Scanner s=new Scanner(System.in);
    	System.out.println("Enter UserName");
		String name=s.next();
		System.out.println("Enter Password");
		int password=s.nextInt();
		if(password==a) {
			System.out.println("Successfully logged in");
		}
		else {
			throw new LoginException("Wrong password");
		}
		System.out.println("thank you");
	}

}
