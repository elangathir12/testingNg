package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class fakenakuri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
		ChromeOptions opition = new ChromeOptions();
		opition.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opition);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement  header = driver.findElement(By.xpath("//h1[@class='qsb-title']"));
		String texthead =header.getText();
	         System.out.println(texthead);
		
	WebElement register	=driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
        Thread.sleep(2000);
        
        WebElement   headertext= driver.findElement(By.xpath("//h1[contains (text(),'Create your Naukri profile')]"));
      String headtxt=  headertext.getText();
      System.out.println(headtxt);
   
  WebElement name =  driver.findElement(By.xpath("//input[@placeholder='What is your name?']"));
		       name .sendKeys("elankathir");
		      String attributename = name.getAttribute("value");
		      System.out.println("name"+attributename);
		 Thread.sleep(2000);
		 
		WebElement mail=	driver.findElement(By.xpath("//input[@placeholder='Tell us your Email ID']"));
		mail.sendKeys("elangathirmamse@gmail.com");
		String attributemail = mail.getAttribute("value");
	      System.out.println("mail"+attributemail);
		 Thread.sleep(2000);
		 
		 WebElement passwordkey=	driver.findElement(By.xpath("//input[contains(@id,'password')]"));
		 passwordkey.sendKeys("nakuriSystem007");
			String attributepassword =  passwordkey.getAttribute("value");
		      System.out.println("password"+attributepassword);
			 Thread.sleep(2000);
		
			 WebElement number=	driver.findElement(By.xpath("//input[contains(@id,'mobile')]"));
			 number.sendKeys("8838022463");
				String attributenumber =  number.getAttribute("value");
			      System.out.println("number"+ attributenumber);
			      
				 Thread.sleep(2000);
				 
				 WebElement status =	driver.findElement(By.xpath("(//h2[contains(@class,'main-3')])[1]"));
			      status.click();
			
			 WebElement agreecondition =	driver.findElement(By.xpath("//span[contains(@class,'chk-label')]"));
			 agreecondition.click();
			 
			 WebElement registernow =	driver.findElement(By.xpath("//button[contains(text(),'Register now')]"));
			 registernow .click();
		
			 
	}

}
