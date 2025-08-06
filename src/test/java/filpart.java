import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class filpart {

	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
	 ChromeOptions opition = new   ChromeOptions();
	 opition.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver( opition);
	 driver.navigate().to("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 String parent= driver.getWindowHandle();
	WebElement serbtn = driver.findElement(By.xpath("//span[text()='Electronics']"));
	 serbtn .click();
	 Thread.sleep(1000);
	 WebElement game1 = driver.findElement(By.xpath("//a[text()='Gaming']"));
	Actions a = new Actions(driver);
	 a.moveToElement(game1).perform();
	 Thread.sleep(1000);
	 WebElement	pad =  driver.findElement(By.xpath("//a[text()='Gaming']//ancestor::div[2]//child::div[2]//object//div//following-sibling::a[5]"));
	 pad.click();
	// WebElement gamepad= driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']//child::div[1]//object//following-sibling::a[4]"));
	JavascriptExecutor j = (JavascriptExecutor)driver;
//j.executeScript("arguments[0].click()",gamepad);
driver.findElement(By.xpath("//a[@title='Gaming Accessories']//preceding-sibling::a[2]")).click();
Thread.sleep(1000);
WebElement  img = driver.findElement(By.xpath("(//div[@data-id='COMHCQ4KEGAZXE5Z']//child::div[1])[1]//a//child::div//div//parent::div//div//img"));
j.executeScript("arguments[0].click()", img );

driver.switchTo().window(parent);











	}

}
