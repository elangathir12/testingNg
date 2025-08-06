package locators;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class selectclass {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
	ChromeOptions opition = new ChromeOptions();
	opition.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(opition);
 driver.get("https://demoqa.com/select-menu");
 driver.manage().window().maximize();
 Thread.sleep(2000);
 WebElement selectvalue =driver.findElement(By.xpath("//div[@id='withOptGroup']//div[1]//div[1]//div[@class=' css-1wa3eu0-placeholder']"));
 selectvalue.click();
   Robot vr = new Robot();
   for(int i=0;i<2;i++) {
   vr.keyPress(KeyEvent.VK_DOWN);
   }
   vr.keyPress(KeyEvent.VK_ENTER);
   Thread.sleep(2000);
   
   WebElement  SelectTitle = driver.findElement(By.xpath("//div[@id='selectOne']//div[1]//div[1]//div[@class=' css-1wa3eu0-placeholder'or@text()='Select Title']"));
   SelectTitle .click();
 Robot cr = new Robot();
  for(int u=0;u<2;u++) {
   cr.keyPress(KeyEvent.VK_DOWN);
   }
   cr.keyPress(KeyEvent.VK_ENTER);
   WebElement   selectid = driver.findElement(By.xpath("//select[@id='oldSelectMenu']")) ;
  Select element= new Select( selectid );
  element.selectByIndex(4);
WebElement  multicolr =driver.findElement(By.xpath("(//div[@class=' css-yk16xz-control']//div[@class='css-12jo7m5'])[2]"));
 multicolr.sendKeys("Red",Keys.ENTER);
 WebElement crs =driver.findElement(By.xpath("//select[@id='cars']"));
Select element2= new Select(crs);
  element2.selectByIndex(2);
}}


//Robot ir = new Robot();
//for(int uo=0;uo<2;uo++) {
//  ir.keyPress(KeyEvent.VK_DOWN);
// }
// ir.keyPress(KeyEvent.VK_ENTER);
//WebElement  green = driver.findElement(By.xpath("//div[@class='css-12jo7m5']"));
// green .click();