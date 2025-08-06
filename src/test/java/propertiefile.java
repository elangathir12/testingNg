import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiefile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties  pr = new Properties();
		pr.load(new FileInputStream("C:\\Users\\elang\\eclipse-workspace\\bixby\\screenshots\\text.properties"));
		String name = pr.getProperty("name");
		System.out.println(name);
		String age =	pr.getProperty("age");
		System.out.println(age);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
