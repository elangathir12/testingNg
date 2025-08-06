package locators;
//actions
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;

public class flipart {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe" );
	 ChromeOptions opition = new ChromeOptions();
	 opition.addArguments("--remote-allow-origins=*");
          WebDriver driver = new ChromeDriver(opition);
          driver.navigate().to("https://www.flipkart.com/");
          driver.manage().window().maximize();
         
     WebElement Fashion  = driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']//span[text()='Fashion']"));
     Thread.sleep(2000);
	    Actions a=new Actions(driver);
	    a.moveToElement(Fashion).perform();
	    Thread.sleep(1000);
	    
	    WebElement  menstopwaer =  driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
	a.moveToElement( menstopwaer).build().perform();
	
	  WebElement   tshirt= driver.findElement(By.xpath("//a[text()=\"Men's T-Shirts\"]"));
a.moveToElement(tshirt).build().perform();
tshirt.click();

driver.navigate().back();

WebElement Fashionpage2 = driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']//span[text()='Fashion']"));
a.moveToElement( Fashionpage2).build().perform();
Thread.sleep(1000);

WebElement  menstopwaer1 =  driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
	a.moveToElement( menstopwaer1).build().perform();
	 Thread.sleep(2000);
	 
	  WebElement  CasualShirts= driver.findElement(By.xpath("//a[text()=\"Men's Casual Shirts\"]"));
	  a.moveToElement(CasualShirts).build().perform();
	  
	  CasualShirts.click();
	
	driver.findElement(By.xpath("(//a[@title='Men Regular Fit Checkered Spread Collar Casual Shirt'])[1]")).click();
	 WebElement addtocard	=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
	// addtocard.getAttribute(name)
	
	
	
	}

}
