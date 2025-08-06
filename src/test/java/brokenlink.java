import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class brokenlink {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe" );
		 ChromeOptions opition = new ChromeOptions();
		 opition.addArguments("--remote-allow-origins=*");
	          WebDriver driver = new ChromeDriver(opition);
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         List<WebElement> links = driver.findElements(By.tagName("link"));
     Iterator<WebElement> link=  links.iterator();
         while(link.hasNext()) {
        	 WebElement lo=  link.next();
        	String href =   lo.getAttribute("href");
        	 if( href.isEmpty()||href == null ) {
        		 System.out.println("href is empty or null ");
        	 }
        	 else {

        	try {
				HttpURLConnection http = (HttpURLConnection)(new URL(href).openConnection());
				 http .setRequestMethod("HEAD");
				 http .connect();
				int xyz =  http .getResponseCode();
				if (xyz == 200 ) {
					System.out.println("link is not an broken link"+href);
				}
				else {
					System.out.println("link is an broken link"+href);
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        	 }
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
	}

}
