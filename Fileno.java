package exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileno {
public static void main(String[]args) throws FileNotFoundException,IOException {
	File f=new File("C:\\Users\\Admin\\Desktop\\Test.txt");
	FileReader fr=new FileReader(f);
	int temp=0;
	while((temp=fr.read())!=-1) {
		System.out.print((char)(temp));
	}
}
}
