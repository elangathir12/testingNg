package locators;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class windowsclass {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe" );
		 ChromeOptions opition = new ChromeOptions();
		 opition.addArguments("--remote-allow-origins=*");
	          WebDriver driver = new ChromeDriver(opition);
	          driver.navigate().to("https://www.flipkart.com/");
	          driver.manage().window().maximize();
	          driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Mobiles",Keys.ENTER);
	    	  Thread.sleep(2000);
	     WebElement click1  =  driver.findElement(By.xpath("(//div[@id='container']//div[@class='_4WELSP']//img)[@alt='SAMSUNG Galaxy S25 Ultra 5G (Titanium Black, 512 GB)']"));
	     click1.click();
	    String parent= driver.getWindowHandle();
	    System.out.println(parent);
	        Set<String>allwinid =driver.getWindowHandles();
	        System.out.println(allwinid);
	        int count = 0;
	        for(String page2 :allwinid) {
	        	if( page2!= parent) {
	        		driver.switchTo().window(page2);
	        	}count++;
	        }
	      WebElement addcardbutton = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
	     addcardbutton .click();
	     driver.switchTo().window(parent);
	     WebElement  header =driver.findElement(By.xpath("//input[@class='zDPmFV']"));
	     header.click();
	  Robot f =new Robot();
	  Thread.sleep(2000);
	  for(int i=0;i<7;i++) {
	  f.keyPress(KeyEvent.VK_BACK_SPACE);
	  f.keyRelease(KeyEvent.VK_BACK_SPACE);}
driver.findElement(By.xpath("//input[@class='zDPmFV']")).sendKeys("Apple iPhone 15 (Blue, 128 GB)",Keys.ENTER);
Thread.sleep(2000);
WebElement click2=driver.findElement(By.xpath("//div[@data-id='MOBGTAGPAQNVFZZY']//div[@class='_4WELSP']//img[@alt='Apple iPhone 15 (Blue, 128 GB)']"));
click2.click();
Set<String>allwinid2 =driver.getWindowHandles();
System.out.println(allwinid2);
for(String page3 :allwinid2) {
	if(page3!= parent) {
		driver.switchTo().window(page3);
	}count++;
}
WebElement addcardbutton2 =driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
addcardbutton2 .click();
Thread.sleep(2000);

TakesScreenshot scrn=( TakesScreenshot )driver;
File ww=   scrn.getScreenshotAs(OutputType.FILE);
  System.out.println(ww);
File d = new File("C:\\Users\\elang\\eclipse-workspace\\bixby\\screenshots\\flipart.png");
FileUtils.copyFile(ww,d);

Thread.sleep(2000);

Set<String>allwinid3 =driver.getWindowHandles();


System.out.println(allwinid3);
int count2 = 0;
for(String page4 :allwinid3) {
	if(count==4) {
		driver.switchTo().window(page4);
	}count++;
	
	WebElement placeorder= driver.findElement(By.xpath("//form[@method='post']//button[@class='QqFHMw zA2EfJ _7Pd1Fp']"));
placeorder.click();
WebElement phnumber=driver.findElement(By.xpath("//input[@class='r4vIwl Jr-g+f']"));
phnumber.sendKeys("8838022463");
driver.findElement(By.xpath("//button[@class='QqFHMw YhpBe+ _7Pd1Fp']")).click();

driver.findElement(By.xpath("//input[@name='name']")).sendKeys("kathir");
driver.findElement(By.xpath("(//div[@class='ACw3Xy U1LCmH']//input)[2]")).sendKeys("8838022463");
driver.findElement(By.xpath("(//input[@class='v2VFa- z2D4XG'])[3]")).sendKeys("600802");
	  }
}
}
//List<String>li=new ArrayList<String>();
//li.addAll(allwinid3);
//String page4= li.get(3);
//driver.switchTo().window(page4);
