package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class facebookkeysusing {

	public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
	ChromeOptions opition= new ChromeOptions();
	opition.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(opition);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
	String title = driver.getTitle();
	
	  Thread.sleep(2000);
	WebElement entermail =  driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
	
Actions a = new Actions(driver);
	a.keyDown(entermail,Keys.SHIFT).sendKeys(entermail,"8838022463").keyUp(entermail, Keys.SHIFT).build().perform();
	
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("elangathirmamse8838022",Keys.ENTER);

	


	}

}
 