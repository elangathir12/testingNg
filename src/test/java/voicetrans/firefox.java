package voicetrans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class firefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\firefoxdriver\\geckodriver.exe");
		//FirefoxOptions  opition = new FirefoxOptions ();
		//opition.addArguments("--remote-allow-origins=*");
		WebDriver driver =new FirefoxDriver();
		//driver.get("https://www.flipkart.com/");
		//driver.close();
		driver.navigate().to("https://www.flipkart.com/");
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		    driver.navigate().back();
		  driver.close();
		
	}

}
 // firefox