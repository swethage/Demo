package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{	
	/**
	 * This is generic method to fetch a cell from excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getDataFromExcelFile(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fs= new FileInputStream(IPathUtility.excelPath);
		Workbook w=WorkbookFactory.create(fs);
		Sheet sh=w.getSheet(sheetName);
		Row r=sh.getRow(rowIndex);
		Cell c=r.getCell(cellIndex);
		DataFormatter df= new DataFormatter();
		String value=df.formatCellValue(c);
		return value;
	}
	
	public List<String> getMultipleDataFromExcelFile(String sheetName, int startRowIndex, int startCellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\geswe\\OneDrive\\Desktop\\sample.xlsx");
		Workbook w=WorkbookFactory.create(fs);
		Sheet s= w.getSheet("Names");
		DataFormatter d=new DataFormatter();
		List<String> a1=new ArrayList<String>();
		for(int i=startRowIndex;i<s.getLastRowNum(); i++)
		{
			Row r=s.getRow(i);
			for(int j=startCellIndex; j<r.getLastCellNum(); j++)
			{
				Cell c= r.getCell(j);
				String value=d.formatCellValue(c);
				a1.add(value);
			}
		}
		return a1;
	}
}
