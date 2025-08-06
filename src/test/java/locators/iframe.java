package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iframe {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe" );
		 ChromeOptions opition = new ChromeOptions();
		 opition.addArguments("--remote-allow-origins=*");
	          WebDriver driver = new ChromeDriver(opition);
	          driver.navigate().to("https://demo.guru99.com/test/guru99home/");
driver.manage().window().maximize();
JavascriptExecutor  javasc=(JavascriptExecutor)driver;
WebElement  down = driver.findElement(By.xpath("//h3[text()='All provided FREE!!!']"));
javasc.executeScript("arguments[0].scrollIntoView(true)",  down);
                    WebElement   frame = driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
                    driver.switchTo().frame(frame);
       //     partice      //   frame .sendKeys("google",Keys.ENTER);
                    WebElement   playbutton = driver.findElement(By.xpath("//button[@aria-label='Play']"));
                    playbutton.click();
                    
                    
                    
                    
                    
	}

}
