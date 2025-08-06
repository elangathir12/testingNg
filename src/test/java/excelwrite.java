import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelwrite {

	public static void main(String[] args) throws IOException {
	File f = new File ("C:\\Users\\elang\\eclipse-workspace\\bixby\\screenshots\\sample.xlsx");
Workbook  w = new XSSFWorkbook();
Sheet  one = w.createSheet();
Row xy = one.createRow(0);
Cell xyz = xy.createCell(0);
xyz.setCellValue("javaTeam");
FileOutputStream str = new FileOutputStream(f);
w .write(str);
System.out.println("Sucess");











		}

}
