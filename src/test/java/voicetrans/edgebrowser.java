package voicetrans;
// edge
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class edgebrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drivers\\msedgedriver.exe");
		// remote exception handling
		EdgeOptions opition = new EdgeOptions();
		opition.addArguments("--remote-allow-origins=*");
		//to lauch
		WebDriver driver =new EdgeDriver(opition);
		//driver.get("https://www.flipkart.com/");
		//navigates -
		driver.navigate().to("https://www.flipkart.com/");
		
		// size 
	    driver.manage().window().maximize();


	    
	    
	    Thread.sleep(3000);
	    driver.navigate().forward();
	    driver.close();//last page only close
	    driver.quit();// close entire session
	}

}
// gecko.driver
//