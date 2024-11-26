package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import constants.Constants;
public class ExelUtilities//no need if extend?
{
	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	public static String getStringData(int i,int j,String sheet) throws IOException
	{
		String filepath=Constants.TESTDATAFILE;//constants is a class static method calling classname.variable name
		//constant is class name and testdatafile is variable name ie static method
		f=new FileInputStream(filepath);//filepath is a variablename
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		return c.getStringCellValue();
	}
	    public static String getIntegerData(int i,int j,String sheet) throws IOException
		{
		String filepath=Constants.TESTDATAFILE;
		f=new FileInputStream(filepath);
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);
	}
	}








//poi and pooi xml is used in excel reading

//apache poi is collection of external library ie.red and write from excel notpad word
//dependecys meansexternal java librry (class and interface)
