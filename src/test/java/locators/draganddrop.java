package locators;
//drag and drop  //actions class
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
	ChromeOptions opition = new ChromeOptions();
	opition.addArguments("--remote-allow-origins=*");
WebDriver driver= new ChromeDriver(opition);
driver.manage().window().maximize();
driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
Actions a = new Actions(driver);
            WebElement  valueofsource = driver.findElement(By.xpath("//div[@id='products']//li[2]//a"));
            a.moveToElement(valueofsource).build().perform();
            WebElement  valueofdesigination = driver.findElement(By.xpath("(//div[@id='shoppingCart4']//li)[1]"));
            a.moveToElement(valueofdesigination).build().perform();
           Thread.sleep(2000);
           a.clickAndHold().build().perform();
           
           a.dragAndDrop( valueofsource,valueofdesigination).build().perform();
           Thread.sleep(4000);
           WebElement  loanbtn= driver.findElement(By.xpath("//a[text()=' LOAN ']"));
           a.moveToElement(loanbtn).perform();
           a.doubleClick().build().perform();

	}

}

