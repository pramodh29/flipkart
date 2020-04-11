package FlipkartDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This Class is used to read the data from Properties fiel and Excel File
 * 
 * @author Madankumar
 *
 */

public class FileLib {
	/**
	 * this method used to write the data in excelfile
	 * 
	 * @param SheetName
	 * @param rownum
	 * @param cellnum
	 * @param value
	 */
	public void writeTOExel(String SheetName, int rownum, int cellnum, String value) {
		Workbook wb = null;
		String path = "./commondata/product.xlsx";
		try {

			FileInputStream fi = new FileInputStream(path);
			wb = WorkbookFactory.create(fi);
			wb.getSheet(SheetName).getRow(rownum).createCell(rownum).setCellValue(value);

			FileOutputStream op = new FileOutputStream(path);
			wb.write(op);
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/**
	 * This method is used to read an expected data from Excel file
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return String
	 * @throws Exception
	 */

	public String getExcelData(String sheetName, int rowNum, int cellNum) {
		FileInputStream ip = null;
		Workbook wb = null;
		try {
			ip = new FileInputStream("./commondata/product.xlsx");
			wb = WorkbookFactory.create(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
	}

	/**
	 * This method is used to access expected value from properties file
	 * 
	 * @param key
	 * @return value
	 */
	public String getPropertyKeyValue(String key) {
		FileInputStream ip = null;
		Properties p = null;
		try {
			ip = new FileInputStream("./commondata/commondata.properties");
			p = new Properties();
			p.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p.getProperty(key);

	}

	public static String ExcelDataNumStr(String sheetName, int rowNum, int cellNum) throws Exception {
		FileInputStream ip = new FileInputStream("./commondata/product.xlsx");
		Workbook wb = WorkbookFactory.create(ip);
		Cell c = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		String type = c.getCellType().toString();
		if (type.equals("NUMERIC")) {
			int numericdata = (int) c.getNumericCellValue();
			return String.valueOf(numericdata);
		} else {
			String strdata = c.getStringCellValue();
			return strdata;
		}

	}

}
