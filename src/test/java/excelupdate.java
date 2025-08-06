import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelupdate{


	public static void main(String[] args) throws IOException {
File e = new File ("E:\\New folder\\Book1.Xlsx");
FileInputStream str = new FileInputStream(e);
Workbook book = new XSSFWorkbook(str);
Sheet one =  book.getSheet("Sheet1");
Row  r= one .getRow(1);
Cell c = r.getCell(0);
System.out.println(c);
   String get = c.getStringCellValue();
   if(get.equals("kathir")) {
	   c.setCellValue("elangathir");
   }
FileOutputStream  vb = new FileOutputStream(e);
book.write(vb);
System.out.println("updated");













}

}
