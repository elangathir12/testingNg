import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class javascript {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe" );
		 ChromeOptions opition = new ChromeOptions();
		 opition.addArguments("--remote-allow-origins=*");
	          WebDriver driver = new ChromeDriver(opition);
	          driver.navigate().to("https://www.amazon.in/?&tag=googinhydr1-21&ref=pd_sl_8lvvl5pp8a_e&adgrpid=171770161190&hvpone=&hvptwo=&hvadid=714840681071&hvpos=&hvnetw=g&hvrand=10929543016913726898&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007812&hvtargid=kwd-3704926535&hydadcr=18657_2389208&mcid=a684625856e53b7aba1406fdfbcd950e&gad_source=1");
	          driver.manage().window().maximize();
	       
	  WebElement   frame1   =  driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
	  frame1 .click();
	  Thread.sleep(2000);
         JavascriptExecutor  javasc=(JavascriptExecutor)driver;
                javasc.executeScript("arguments[0].setAttribute('value','marshall')",frame1);
                frame1  .sendKeys(Keys.ENTER);
                Thread.sleep(2000);
              //Object psd=  javasc.executeScript("return arguments[0].getAttribute('value')",frame1);
             // System.out.println(psd);
              WebElement   deliver =   driver.findElement(By.xpath("(//div[@id='deliveryRefinements']//i[@class='a-icon a-icon-checkbox'])[1]"));
         	 javasc.executeScript("arguments[0].click()",deliver);
         	Thread.sleep(2000);
       WebElement down=   driver.findElement(By.xpath("//h5[text()='Amazon Web Services']"));
         javasc.executeScript("arguments[0].scrollIntoView(true)",down);
         Thread.sleep(2000);
WebElement up =   driver.findElement(By.xpath("//a[text()='Amazon Pay']"));
 javasc.executeScript("arguments[0].scrollIntoView(false)",up);
 WebElement	img1  = driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']//img[@data-image-index='1']"));
 javasc.executeScript("arguments[0].click()",img1);
 //>>windowhandle
String parentwindow  = driver.getWindowHandle();
System.out.println( parentwindow );
Set<String>allwinid =driver.getWindowHandles();
System.out.println(allwinid);
for(String page1:allwinid) {
	if(!page1.equals(parentwindow)) {
		driver.switchTo().window(page1);
	}
}
driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

	}
}
