package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");

		ChromeOptions opition = new ChromeOptions();
		opition.addArguments("--remote-allow-origins=*");
		
          WebDriver driver = new ChromeDriver(opition);
          driver.get("https://www.facebook.com/");
         
            driver.manage().window().maximize();
            
            WebElement createbtn =    driver.findElement(By.xpath("//a [@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
            createbtn .click();
            WebElement  firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
            firstname.sendKeys("valentino");
            WebElement  lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
            lastname.sendKeys("rossi");
            WebElement  day = driver.findElement(By.xpath("//select [@aria-label='Day']"));
                day.sendKeys("27");
                WebElement month=   driver.findElement(By.xpath("//select [@aria-label='Month']"));
                month.sendKeys("FEB");
               WebElement year  = driver.findElement(By.xpath("//select [@aria-label='Year']"));
               year.sendKeys("1999");
             //  driver.findElement(By.xpath(("//div[@class='mtm mbs _2_68'])[1]")));
               WebElement    gender  = driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[1]"));
               gender.sendKeys("Male");
               WebElement   email  = driver.findElement(By.xpath("//input[@name='reg_email__']"));
               email.sendKeys("elangathirmamse@gamil.com");
               WebElement newpassword  =driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
               newpassword .sendKeys("WebElement12345@");
               WebElement sumbitbtn  = driver.findElement(By.xpath("//button[@name='websubmit']"));
               sumbitbtn.click();
          // driver.close();
               
       
	}

}
