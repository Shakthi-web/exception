package exception;

public class ErrorEg {
public void findX() {
	findY();
}
public void findY() {
	findX();
}
public static void main(String[]args) {
	ErrorEg e=new ErrorEg();
	e.findX();
}
}
