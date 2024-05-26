package excelUtility;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.ConfigReader;
public class ExcelConfigReader {
	 XSSFWorkbook workbook;
	    XSSFSheet sheet;
	    ConfigReader cr;
	    public ExcelConfigReader() throws IOException
	    {
	        FileInputStream fis;
	        cr = new ConfigReader();
	        String filepath = cr.getExcelPath();
	        fis = new FileInputStream(filepath);
	        workbook = new XSSFWorkbook(fis);
	    }
	    public String getData(int sheetnumber,int row, int col)
	    {
	        sheet = workbook.getSheetAt(sheetnumber);
	        String data = sheet.getRow(row).getCell(col).getStringCellValue();
	        return data;
	    }
	    public int getRowCount(int sheetindex)
	    {
	        int rowcount = workbook.getSheetAt(sheetindex).getLastRowNum();
	        rowcount = rowcount + 1;
	        return rowcount;
	    }
}
