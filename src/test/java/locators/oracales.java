package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class oracales {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
	ChromeOptions opition = new ChromeOptions();
	opition.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(opition);
	driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
	WebElement containstext = driver.findElement(By.xpath("//h3[contains(text(),'Java SE 8 Archive Downloads (JDK 8u202 and earlier)')]"));
           String text = containstext.getText();
           System.out.println(text);
           
           WebElement addtional= driver.findElement(By.xpath("//p[contains(text(),'This page includes archive downloads for Java SE 8u202 and earlier. The archive downloads for ')]"));
         String no =  addtional.getText();
         System.out.println(no);
         WebElement getlink  =  driver.findElement(By.xpath("//a [contains (text(),'Java SE 8u211 and later updates')]"));
       String hreflink=   getlink.getText();
      String outlink= getlink.getAttribute("href");
      System.out.println(outlink);
	}

}
