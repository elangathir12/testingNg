package particeofselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webpage {

	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
	ChromeOptions opition = new ChromeOptions();
	 opition.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(opition);
driver.get("https:www.redbus.in");
Thread.sleep(1000);
	driver.manage().window().maximize();
	
	
WebElement from= driver.findElement(By.xpath("((//div[@id='root']//div[@class='searchWidgetWrapper__ind-home-styles-module-scss-fp9dm ']//div[@class='srcDestWrapper___da1fcf'])[1]//div//div[1])[1]"));
from.sendKeys("trichy");
from.click();



	WebElement to = driver.findElement(By.xpath("(//div[@id='root']//div[@class='searchWidgetWrapper__ind-home-styles-module-scss-fp9dm ']//div[@class='srcDestWrapper___da1fcf'])[2]"));
	to.sendKeys("coimbatore",Keys.ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
