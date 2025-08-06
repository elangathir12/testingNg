import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webtable1example  extends untilfunction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 launch();
		 untilfunction.url("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		 max () ;
		 //switching to table in webpage 
		 List<WebElement> tables =driver.findElements(By.tagName("table"));
		int sizee = tables.size();
		 System.out.println("tablesize"+sizee);
		 //pick table 2 from webpage
	WebElement table1= tables.get(1);
	//count of table row - tag name TR//taking table row only ..we using tbale1 ref name 
	 List<WebElement> tablerow = 	table1.findElements(By.tagName("tr"));
	 //size of row ? in table 
int row = tablerow.size();
System.out.println("rowsize"+row);
//switching to table 1st row lone 
       WebElement zero = tablerow .get(2);
       
    for(int j=0 ;j<row ;j++ ) {
			WebElement eachcolu =  tablerow.get(j);
		List<WebElement>eachdatas =eachcolu.findElements(By.tagName("td"));
		int sizeofdata = eachdatas.size();
		
		for(int j1 =0 ; j1<sizeofdata;j1++) {
			WebElement nameofdata = eachdatas.get(j1);
			String  getdatatxt =nameofdata .getText();
			System.out.println( getdatatxt);
		//row	
			if(getdatatxt.equals("Mecca")) {
			System.out.println("Row"+(j+1));
			System.out.println("col"+(j1+1));
			WebElement meccarow = tablerow.get(j);
			List<WebElement> zeroe=	 meccarow.findElements(By.tagName("td"));
			int columssize= zeroe.size();
			 for(int i =0 ;  i < columssize  ;i++) {
				WebElement c=  zeroe.get(i);
				String scenoria = c.getText();
				System.out.println(scenoria);
				
			 }
			}
			System.out.println("----------------------------");
			//column; 
			for(int h =3;h<row ;h++) {
				WebElement y = tablerow.get(h);
				List<WebElement> colposition =	y .findElements(By.tagName("td"));
				WebElement meccaclposition = colposition.get(j1);
				String textclmecca =  meccaclposition.getText();
				System.out.println(textclmecca);
				
				}
			}
			
    }

}
}