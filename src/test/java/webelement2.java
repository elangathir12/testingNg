import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webelement2 extends  untilfunction {
static int row =0 ;
static int clo =0 ;
	public static void main(String[] args) {
		launch();
		 untilfunction.url("https://demo.guru99.com/test/web-table-element.php");
		 max () ;
		 //header size 
                   List<WebElement> header   =  driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
                   int sizeofheader=header.size();
                   System.out.println("column"+sizeofheader);
           // row size    
                   List<WebElement> rowsize   =  driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
                   int sizeofrow= rowsize .size();
                   System.out.println("row"+sizeofrow);
                   
             // without header count //table[@class='dataTable']//tbody//tr      
      for(int i =1; i<=sizeofrow ;i++) {
    	  for(int j=1;j<=sizeofheader;j++) 
    	  {
    	WebElement	each  = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
    	String text= each.getText();
    	System.out.println(text);
    	  }
      	}
      for(int i =1; i<=sizeofrow ;i++) {
    	  for(int j=1;j<=sizeofheader;j++) 
    	  {
    	WebElement	each  = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
    	String text= each.getText();
    	System.out.println(text);
    	  
      	
    	if( text.contains("YES Bank Ltd.")) {
    		System.out.println(text);
    		System.out.println("rownum"+i);
    		row=i;
    		System.out.println("clonum"+j);
    		clo=j;
    	
      }}}
      
      
      //columnvalue            
      //   for(int i1=1;i1<sizeofrow;i1++) {
          //   WebElement each  =  driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i1+"]//td["+clo+"]"));
           // String text4 =each  .getText();
           // System.out.println(text4);
        // }   
         //rowvalue 
      // for(int y =1; y<sizeofheader;y++) {
    	//   WebElement each  = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+row+"]//td["+y+"]"));
    	 // String textc= each .getText();
    	//  System.out.println(textc);
      // }     
                   
       WebElement Company   =  driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Company']")) ;    
       WebElement  Group= driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Group']")) ;    
       WebElement  PrevClose=    driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Prev Close (Rs)']")) ;    
       WebElement CurrentPrice = driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Current Price (Rs)']")) ;    
       WebElement  Change=  driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='% Change']")) ;    
                   
    int a =    header.indexOf(Company)+1;
    int b  =header.indexOf(Group)+1;
    int c= header.indexOf(PrevClose)+1;
    int d =   header.indexOf(CurrentPrice)+1;
    int e  =header.indexOf(Change)+1;
                   
                   for(int i2 =1 ; i2<sizeofrow;i2++) {
                	   WebElement  comtext=    driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i2+"]//td["+a+"]"));
                	String dd   = comtext.getText();
                	 System.out.println(dd);
                	   
                   }
                   
                   for(int i2 =1 ; i2<sizeofrow;i2++) {
                	   WebElement grptext=    driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i2+"]//td["+b+"]"));
                	String dd   = grptext.getText();
                	 System.out.println(dd);
                	   
                   }
                   for(int i2 =1 ; i2<sizeofrow;i2++) {
                	   WebElement prvtext=    driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i2+"]//td["+c+"]"));
                	String dd   = prvtext.getText();
                	 System.out.println(dd);
                	   
                   }
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
	}

}
