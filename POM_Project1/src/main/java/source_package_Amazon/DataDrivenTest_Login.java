package source_package_Amazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DataDrivenTest_Login {
	public static String username;
	public static String password;
	public static void main() throws EncryptedDocumentException, IOException {
		
	
	FileInputStream f1 = new FileInputStream("C:\\Users\\SSSH\\eclipse-workspace\\POM_Project1\\src\\main\\java\\source_package_Amazon\\Excel_Data1.xlsx");
	Workbook w1 = WorkbookFactory.create(f1);
	username = NumberToTextConverter.toText(w1.getSheet("login").getRow(0).getCell(1).getNumericCellValue());
	System.out.println(username);

	password = w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	System.out.println(password);
}
}