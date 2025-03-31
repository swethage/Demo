package sample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingSampleExcel1_03 
{
	public static void main(String[] args) throws Exception, IOException 
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\geswe\\OneDrive\\Desktop\\sample.xlsx");
		Workbook wb= WorkbookFactory.create(fs);
		Sheet s=wb.getSheet("Names");
		Row r= s.getRow(0);
		Cell c=r.getCell(1);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(c);
		System.out.println(value);
		Row r1= s.getRow(2);
		Cell c1=r1.getCell(0);
		String value1=df.formatCellValue(c1);
		System.out.println(value1);
	}

}
