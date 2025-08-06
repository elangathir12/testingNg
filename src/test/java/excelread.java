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

public class excelread {

	public static void main(String[] args) throws IOException {
		//to find the location 
		File f = new File("E:\\New folder\\Book1.Xlsx");
		
		
//file input steam (read value )
		FileInputStream f2 = new FileInputStream ( f );//fis - class
	//type of workbook 
		Workbook g = new XSSFWorkbook(f2);
	Sheet s1= g.getSheet("Sheet1");
	//row
		Row r =s1.getRow(1);
		//cell
	Cell c =r.getCell(1);
		System.out.println(c);
	// to get row value count
	int k = s1.getPhysicalNumberOfRows();
	System.out.println(k);
	 Row h= s1.getRow(0);

	
		for(int i =0;i<k;i++) {
			Row lo = s1.getRow(i);
			
			int ji=	r.getPhysicalNumberOfCells();
			System.out.println(ji);
			
			for(int i1 =0;i1<ji;i1++) {
			Cell cell=	h.getCell(i1);
			System.out.println(cell);
			
int celltyp = 	c.getCellType();
			System.out.println( celltyp);
			if(celltyp==1) {
		String celvalue=c.getStringCellValue();
		System.out.println( celvalue);
			}else if(celltyp==0) {
				if(DateUtil.isCellDateFormatted(c)) {
				Date d=	c.getDateCellValue();
				SimpleDateFormat sd = new SimpleDateFormat("mm-dd-yyyy");
			String datevalue 	= sd.format(d);
			System.out.println(datevalue );
				}else {
					double ys = c.getNumericCellValue();
					long l =(long)ys ;
					String num= String.valueOf(1);
					System.out.println (num );
				}
			}
					
			}
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
