package locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class nakurilogin {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
		ChromeOptions opition = new ChromeOptions();
		opition.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opition);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
    WebElement loginbtn   = driver.findElement(By.xpath("//a[contains(@class,'nI-gNb-lg-rg__login')]"));
    loginbtn .click();
	 Thread.sleep(2000);
    WebElement mail=	driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID / Username')]"));
	mail.sendKeys("elangathirmamse@gmail.com");
	String attributemail = mail.getAttribute("value");
      System.out.println("mail"+attributemail);
      
      WebElement passwordkey=	driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your password')]"));
		 passwordkey.sendKeys("nakuriSystem007");
			String attributepassword =  passwordkey.getAttribute("value");
		      System.out.println("password"+attributepassword);
		
			 
			   WebElement   loginbtn2 =driver.findElement(By.xpath("//button[contains(@class,'btn-primary loginButton')]"));
			   loginbtn2.click();
			String typeattiribute=   loginbtn2 .getAttribute("type");
			   System.out.println(typeattiribute);

			   Thread.sleep(2000);
		
			   WebElement  completebtn  = driver.findElement(By.xpath("//div[@class='view-profile-wrapper']"));
			  completebtn.click();
			   
	  Thread.sleep(2000);
	Actions a= new Actions(driver);
	          
	          WebElement   headers5 = driver.findElement(By.xpath("//div[@class='col left-row s5']"));
	           a.moveToElement(headers5).build().perform();
	          
	          
	          
	          
	}}
//***resume
	   //WebElement resumepage =  driver.findElement(By.xpath("(//div [@id='root']//ul[@class='collection']//li[@class='collection-item typ-14Medium'])[1]"));
			  // resumepage.click();
			
			   //WebElement uploadbtn=   driver.findElement(By.xpath("(//a[@class='secondary-content typ-14Bold'])[1]"));
			  // uploadbtn.click();
			  
			  // WebElement xbutton =  driver.findElement(By.xpath("//span[@class='icon'])[13]"));
			 //  xbutton.click();

//***resumeheadline
//WebElement titlebutton = driver.findElement(By.xpath("//div[@id='root']//ul[@class='collection']//li[@class='collection-item typ-14Medium'][2]"));
//titlebutton.click();
			  // WebElement  addbutton  = driver.findElement(By.xpath("(//a [@class='secondary-content typ-14Bold'])[2]"));
			  // addbutton .click();
			 //  Thread.sleep(2000);
			  // WebElement resumeheadtext =driver.findElement(By.xpath("//textarea[@id='resumeHeadlineTxt']"));
			 //  resumeheadtext .sendKeys("technicalsupport,well versed in microstation");
			  // WebElement savebutton = driver.findElement(By.xpath("(//button[@class='btn-dark-ot'])[3]"));
			  // savebutton.click();
			   
//**keyskill

   //WebElement keyskillbuttonaddbutton= driver.findElement(By.xpath("(//div[@id='root']//ul[@class='collection']//li[@class='collection-item typ-14Medium'][3]"));
  //keyskillbuttonaddbutton.click();
//WebElement  keyskillbutton  = driver.findElement(By.xpath("(//a [@class='secondary-content typ-14Bold'])[3]"));
//keyskillbutton .click();
//Thread.sleep(2000);
//WebElement  keyskillinputbox =driver.findElement(By.xpath("//form//input[@id='keySkillSugg']"));
//keyskillinputbox .sendKeys("java,");
//Thread.sleep(2000);
//WebElement savebutton	=   driver.findElement(By.xpath("(//button[@class='btn-dark-ot'])[3]"));
//savebutton.click();
			  
//***********education
//WebElement eduction=  driver.findElement(By.xpath("(//div[@id='root']//ul[@class='collection']//li[@class='collection-item typ-14Medium'])[4]"));
//eduction.click();
//Thread.sleep(2000);
//WebElement educationaddbtn= driver.findElement(By.xpath("(//a[@class='secondary-content typ-14Bold'])[2]"));
//educationaddbtn.click();
//Thread.sleep(1000);
//WebElement  selecteducation= driver.findElement(By.xpath("//form[@class='lbpadding container educationForm']//input[@placeholder='Select education']"));
//selecteducation.click();
//Thread.sleep(1000);
//WebElement be=	driver.findElement(By.xpath("//div[@id='dp_highEdu']//ul//li[3]//a"));
//be.click();
//WebElement university= driver.findElement(By.xpath("//form[@class='lbpadding container educationForm']//input[@placeholder='Select university/institute']"));
//university.sendKeys("College of Engineering, Anna University, Guindy");

//Thread.sleep(1000);
//WebElement coursebox  =  driver.findElement(By.xpath("//form[@class='lbpadding container educationForm']//input[@placeholder='Select course']"));
//coursebox.click();
//WebElement courseselection = driver.findElement(By.xpath("(//div[contains(@id,'dp_crs')]//ul//li//a)[1]"));
//courseselection.click();
//Thread.sleep(1000);
//WebElement  specialbox =driver.findElement(By.xpath("//form[@class='lbpadding container educationForm']//input[@placeholder='Select specialization']"));
//specialbox.click();
//WebElement   specialboxcatogeries=  driver.findElement(By.xpath("//div[contains(@id,'dp_specialization')]//div//ul//li[16]/a"));
//specialboxcatogeries.click();
//WebElement  yearstart = driver.findElement(By.xpath("//input[contains(@placeholder,'Starting year')]"));
//yearstart.sendKeys("2020");
//driver.findElement(By.xpath("//a[@data-id='yosField_2020']")).click();
//WebElement  yearends = driver.findElement(By.xpath("//input[contains(@placeholder,'Ending year')]"));
//yearends.sendKeys("2025");

//WebElement  yearbtn = driver.findElement(By.xpath("//a[contains(@data-id,'yopField_2025')]"));
//yearbtn .click();
//Robot rb= new   Robot (); 
//rb.keyPress(KeyEvent.VK_DOWN);
//rb.keyRelease(KeyEvent.VK_DOWN);
//WebElement cgpa =  driver.findElement(By.xpath("//input[contains(@placeholder,'Select grading system')or@id='gradeFieldFor']"));
//cgpa .sendKeys("Course Requires a Pass");
//cgpa .click();
//Thread.sleep(1000);

//WebElement  cpgabtn= driver.findElement(By.xpath("//a[@data-id='gradeField_4']"));
//cpgabtn.click();
//driver.findElement(By.xpath("//button[@id='saveEducation']")).click();


