package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class select2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
		ChromeOptions opition = new ChromeOptions();
		opition.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opition);
	 driver.get("https://practice.expandtesting.com/dropdown");
	 driver.manage().window().maximize();
	 
	 
	 WebElement box =driver.findElement(By.xpath("//select [@id='dropdown']"));
	 Select  ji = new Select (box);
	 ji.selectByIndex(1);
	  Thread.sleep(2000);
	  WebElement ele = driver.findElement(By.xpath("//select [@onchange='setElementsPerPage(this.value)']"));
	 Select  jd = new Select(ele);
jd.selectByIndex(1);

WebElement country = driver.findElement(By.xpath("//select [@id='country']"));
Select con= new Select(country );
	 con.selectByIndex(2);
	 
	 
	 
	 
	 
	}

}
