package locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class robotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe" );
		 ChromeOptions opition = new ChromeOptions();
		 opition.addArguments("--remote-allow-origins=*");
	          WebDriver driver = new ChromeDriver(opition);
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 
	 Actions a = new Actions(driver);	
	WebElement  electronics = driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']//div[2]"));
	 a.moveToElement(electronics).build().perform();
		WebElement  audio= driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
	      a.moveToElement(electronics).build().perform(); audio.click();   
 Robot d = new Robot();
 Thread.sleep(2000);
 d.keyPress(KeyEvent.VK_PAGE_DOWN);
 d.keyRelease(KeyEvent.VK_PAGE_DOWN);
 
 d.keyPress(KeyEvent.VK_PAGE_UP);
 d.keyRelease(KeyEvent.VK_PAGE_UP);


 
 
 d.keyPress(KeyEvent.VK_ENTER);
 d.keyRelease(KeyEvent.VK_ENTER);
 WebElement  aboutusbtn = driver.findElement(By.xpath("//a[text()='About Us']"));
 a.moveToElement(aboutusbtn ).build().perform();
 aboutusbtn.click();
	}
}
