import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class reuseablecode extends untilfunction{
public static void main(String[]args) throws FileNotFoundException, IOException {
	 launch();
	 Properties  pr = new Properties();
		pr.load(new FileInputStream("C:\\Users\\elang\\eclipse-workspace\\bixby\\screenshots\\text.properties"));
		String k = pr.getProperty("URL");
	       url(k);
	     max();
	  String currenturl= currenturl();
	 System.out.println(currenturl);
	String name =  pr.getProperty("name");
	 type(driver.findElement(By.id("email")),name);
String password =getdata(1,1);
	 type(driver.findElement(By.id("pass")),password);
	 click(driver.findElement(By.xpath("//Button[@type=\"submit\"]")));
	 
	 
	
	 
	 
}
}

