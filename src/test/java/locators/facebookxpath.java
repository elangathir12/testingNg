package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebookxpath {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
	 ChromeOptions opition = new  ChromeOptions();
opition.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(opition);
driver.get("https://www.facebook.com/");
driver.manage().window().minimize();
         WebElement  linkof = driver.findElement(By.xpath("(//link[contains(@crossorigin,'anonymous')])[3]"));
    // String href =  linkof.getAttribute("href");
           String  as= linkof.getAttribute("as");
         String rel =   linkof.getAttribute("rel");
               //  System.out.println( href);
                 Thread.sleep(2000);
                 System.out.println(as);
                 System.out.println(rel);
                 
                 WebElement   ulclass=driver.findElement(By.xpath("//ul[contains(@data-nocookies,'1')]"));
             String classconatains   = ulclass.getAttribute("class");
             System.out.println(classconatains);
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
            
                 
                 
	}

}
