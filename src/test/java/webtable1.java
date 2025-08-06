import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webtable1 extends untilfunction {

	public static void main(String[] args) {
		 launch();
		 untilfunction.url("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		 max () ;
		 //switching to table in webpage 
		 List<WebElement> tables =driver.findElements(By.tagName("table"));
		int sizee = tables.size();//2
		 System.out.println("tablesize"+sizee);
		 //pick table 2 from webpage
	WebElement table1= tables.get(1);
	
	//count of table row - tag name TR//taking table row only ..we using tbale1 ref name 
	 List<WebElement> tablerow = 	table1.findElements(By.tagName("tr"));
	 //size of row ? in table 
int rowsize = tablerow.size();//6
System.out.println("rowsize"+rowsize);

//switching to table 1st row lone //body kulla iruka 2 row switch
       WebElement body = tablerow .get(2);
      
       //row header
    List <WebElement> header = body.findElements(By.tagName("th"));
  int headersize =  header .size();//1
  System.out.println("headersize"+headersize);//
   //taking header in row 2 
    WebElement headerone  = header.get(0);
   String text= headerone .getText();//Burj Khalifa
   System.out.println(text);
   // taking data in row 2 
   List <WebElement> datainrow2 =  body.findElements(By.tagName("td"));
   WebElement dataone  =datainrow2.get(0);
   String text2=    dataone .getText();//uae 
   System.out.println(text2);
   
   
   // printing only headers in table 
for(int j=0 ;j<rowsize ;j++ ) {
			WebElement eachrow=  tablerow.get(j);
		    List<WebElement>eachdatas =eachrow.findElements(By.tagName("th"));
		    int sizeofdata = eachdatas.size();
		
for(int j1 =0 ; j1<sizeofdata;j1++) {
			WebElement nameofdata = eachdatas.get(j1);
			String  getdatatxt =nameofdata .getText();
			System.out.println( getdatatxt);
			 // printing only dates in table 		   
	for(int i=0 ;i<rowsize ;i++ ) {
				WebElement eachrow2=  tablerow.get(i);
			    List<WebElement>eachdatas2 =eachrow.findElements(By.tagName("td"));
			    int sizeofdata1 = eachdatas.size();
			
	for(int j3 =0 ; j3<sizeofdata;j3++) {
				WebElement nameofdata3 = eachdatas.get(j1);
				String  getdatatxt3 =nameofdata .getText();
				System.out.println( getdatatxt);
				   		
			
			
			
			if ( getdatatxt.equals("China")) {
				 WebElement fiverow = tablerow.get(5);
				  List<WebElement>fourcol=fiverow.findElements(By.tagName("td"));
				  WebElement four=  fourcol.get(4);
				String rank=  four.getText();
				System.out.println(rank);
			}
			
			
			
			System.out.println("row"+j+1);
			System.out.println("col"+j1+1);
			
			
			
	}
	}	 

}
}

