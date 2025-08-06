package locators;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alertinterface {

	public static void main(String[] args) throws InterruptedException,IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
	ChromeOptions opition = new ChromeOptions();
	opition.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver( opition);
	driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//div[@id='OKTab']//button")).click();
	Alert a = driver.switchTo().alert();////////////////////
	Thread.sleep(1000);
	a.accept();
	
	 TakesScreenshot scrn1=( TakesScreenshot )driver;
	  File yy=   scrn1.getScreenshotAs(OutputType.FILE);
	    System.out.println(yy);
	  File d1 = new File("C:\\Users\\elang\\eclipse-workspace\\bixby\\screenshots\\yy.png");
	FileUtils.copyFile(yy,d1);
	  
    driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
    driver.findElement(By.xpath("//div[@id='CancelTab']")).click();
    Thread.sleep(1000);
    a.dismiss();
    driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
    Thread.sleep(1000);
    a.sendKeys("kathir");
    
   String text= a.getText();
   System.out.println(text);
    a.accept();
  //screen shot  
    TakesScreenshot scrn=( TakesScreenshot )driver;
  File ww=   scrn.getScreenshotAs(OutputType.FILE);
    System.out.println(ww);
  File d = new File("C:\\Users\\elang\\eclipse-workspace\\bixby\\screenshots\\ss.png");
FileUtils.copyFile(ww,d);
 
  WebElement framme = driver.findElement(By.xpath("//iframe[@name='aswift_0']"));
  driver.switchTo().frame(framme) ;
  framme.click();
 
  
	}

}
