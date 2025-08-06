import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazon {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe" );
		 ChromeOptions opition = new ChromeOptions();
		 opition.addArguments("--remote-allow-origins=*");
	          WebDriver driver = new ChromeDriver(opition);
driver.navigate().to("https://www.amazon.in/?&tag=googinhydr1-21&ref=pd_sl_8lvvl5pp8a_e&adgrpid=171770161190&hvpone=&hvptwo=&hvadid=714840681071&hvpos=&hvnetw=g&hvrand=10929543016913726898&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007812&hvtargid=kwd-3704926535&hydadcr=18657_2389208&mcid=a684625856e53b7aba1406fdfbcd950e&gad_source=1");
	          driver.manage().window().maximize();
                     WebElement tabone  =driver.findElement(By.xpath("//div[@id='nav-search']"));
                     tabone.click();
                     driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")) .sendKeys("marshall",Keys.ENTER);
                     Thread.sleep(2000);
                     WebElement    marshall   = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
                     marshall .click();
                   //String  text  =    marshall .getText();
             // System.out.println( text );
              Thread.sleep(2000);
String parentwindow   = driver.getWindowHandle();
 System.out.println(parentwindow );
 Set<String> allwidow1 = driver.getWindowHandles();
 System.out.println( allwidow1);
 int count = 0;
 for(String page1 :allwidow1) {
	 if(!page1.equals(parentwindow)) {
		driver.switchTo().window(page1);
	 }  count ++;
	 }
 WebElement  add =driver.findElement(By.xpath("(// span[@class='a-button-inner']//a)[2]"));
	 add .click();
	 driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("8838022463");
	 driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
	 driver.switchTo().window(parentwindow);
	 WebElement  header =driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
     header.click();
              Robot bh = new Robot();
              for(int i=0;i<8;i++) {
              bh.keyPress(KeyEvent.VK_BACK_SPACE);
              bh.keyRelease(KeyEvent.VK_BACK_SPACE);}
              WebElement  header1  =driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
              header1 .sendKeys("Sonyxepria",Keys.ENTER);
	 
	 
              
              
          
	}
}