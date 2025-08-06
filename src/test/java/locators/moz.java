package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class moz {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
		ChromeOptions opition = new ChromeOptions();
		opition.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opition);
	driver.navigate().to("https://www.naukri.com/");
    driver.manage().window().maximize();
    
     WebElement  skill = driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]"));
          skill.sendKeys("technicalsupport");
         
          WebElement searchbutton=   driver.findElement(By.xpath("//div[@class='qsbSubmit']"));
          searchbutton.click();
          Thread.sleep(2000);
          driver.navigate().refresh();
          driver.navigate().back();
          
          WebElement  location =  driver.findElement(By.xpath("//input[@placeholder='Enter location']"));
          location.sendKeys("chennai");
  
          WebElement searchbutton1=   driver.findElement(By.xpath("//div[@class='qsbSubmit']"));
         searchbutton1.click();
         Thread.sleep(4000);
       driver.navigate().refresh();
       
       WebElement  errortext  = driver.findElement(By.xpath("//div[@class='server-err']"));
       String text =  errortext.getText();
       System.out.println(text);
              

	                      
	}

}
                      