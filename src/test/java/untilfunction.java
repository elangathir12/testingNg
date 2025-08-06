import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class untilfunction {

	static WebDriver driver ;
	public static void launch() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elang\\eclipse-workspace\\bixby\\drive\\chromedriver.exe");
		ChromeOptions opition = new ChromeOptions();
		opition.addArguments("--remote-allow-origins=*");
	       driver = new ChromeDriver(opition);
	}
	public static void url(String url) 
	{
		 driver.get(url);
	}
	public static void max () 
	{
		 driver.manage().window().maximize();
	}
	public static String currenturl( )
	{
	String CurrentUrl=	driver.getCurrentUrl();
	return CurrentUrl;
	}
	public static void type (WebElement ele, String val) {
		ele.sendKeys(val);
	}
	public static void click(WebElement ele ) {
		ele.click();
	}
	public static void close() {
		driver.close();
	}
	public static void Actionclass(WebElement ele ) {
		Actions a = new Actions(driver);
		a.moveToElement (ele).click().build().perform();
	}
	public static String getdata( int Row, int column) throws IOException  {
		//to find the location 
				File f = new File("E:\\New folder\\Book1.Xlsx");
		//file input steam (read value )
				FileInputStream f2 = new FileInputStream ( f );//fis - class
			//type of workbook 
				Workbook g = new XSSFWorkbook(f2);
			Sheet s1= g.getSheet("Sheet1");
			//row
			
			
				Row r =s1.getRow( Row);
				//cell
			Cell c =r.getCell(column);
				System.out.println(c);
			// to get row value count
			int k = s1.getPhysicalNumberOfRows();
			System.out.println(k);
			 Row h= s1.getRow(0);

			
				//0,1 == 0 string , 1 date,num
		int celltyp = 	c.getCellType();
					System.out.println( celltyp);

					String excelvalue = null;
					
					if(celltyp==1) {
						excelvalue =c.getStringCellValue();
				System.out.println( excelvalue);
				
					}else if(celltyp==0) {
						if(DateUtil.isCellDateFormatted(c)) {
						Date d=	c.getDateCellValue();
						SimpleDateFormat sd = new SimpleDateFormat("mm-dd-yyyy");
					 excelvalue	= sd.format(d);
					System.out.println(excelvalue);
						}else {
							double ys = c.getNumericCellValue();
							long l =(long)ys ;
							String excelvalue1= String.valueOf(1);
							System.out.println (excelvalue);
						}
					}
							
					return excelvalue;}
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

