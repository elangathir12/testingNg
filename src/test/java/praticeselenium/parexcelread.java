package praticeselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class parexcelread {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\\\New folder\\\\Book1.Xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet("sheet1");
		Row r = s.getRow(10);
		Cell c = r.getCell(3);
		System.out.println(c);

	}

}
