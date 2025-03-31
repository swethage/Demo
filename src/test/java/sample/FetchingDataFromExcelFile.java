package sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelFile
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		ExcelUtility exUtil=new ExcelUtility();
		String value=exUtil.getDataFromExcelFile("Names", 2, 0);
		System.out.println(value);
		String value1=exUtil.getDataFromExcelFile("Courses", 2, 1);
		System.out.println(value1);
		
	}
}
