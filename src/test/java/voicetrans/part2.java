package voicetrans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
;
// chrome
public class part2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
		// remote exception handling
		ChromeOptions opition = new ChromeOptions();
		opition.addArguments("--remote-allow-origins=*");
		//to lauch
		WebDriver driver =new ChromeDriver(opition);
		driver.get("https://www.flipkart.com/");
		// size 
	    driver.manage().window().maximize();
	    driver.close();
	}

}
