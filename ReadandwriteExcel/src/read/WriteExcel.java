package read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static HashMap<String,String> map1=new HashMap();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     String testcase="Login_Testcase";
		FileInputStream fs;
		Properties prop = null;
		HashMap<String,String> map=new HashMap();
		try {
		
			fs = new FileInputStream("C:\\Users\\girish\\Desktop\\Resources\\FreeCrmTestData.xlsx");
			XSSFWorkbook XSSFWorkbook= new XSSFWorkbook(fs);
			Cell cell;
		
			XSSFSheet xssfSheet= XSSFWorkbook.getSheet("TableData");
			String key="";
			String Value;
			
			int rownum=xssfSheet.getLastRowNum();
		
			int flagnum=0;
			for (int i = 1; i < rownum; i++) {
				
				XSSFRow row=xssfSheet.getRow(i);
				XSSFRow initrow=xssfSheet.getRow(0);
				int columlast=initrow.getLastCellNum();
				String testcase_value=xssfSheet.getRow(i).getCell(0).toString();
				System.err.println("");
				
				if(testcase_value.trim().equalsIgnoreCase(testcase))
				{
					//System.out.println(testcase_value);
					for (int j = 0; j <columlast; j++) {
						flagnum=1;
						key=initrow.getCell(j).toString();
						Value=row.getCell(j).toString();
						map.put(key, Value);
						//System.out.println(key);
					}
					
					break;
				}		
		if(flagnum==1)
		{
			  
		  break;	
		}
	
			}
		
		}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		for (Map.Entry<String, String> entry:map1.entrySet())
		   {
			   String key1=entry.getKey();
			   String value=entry.getValue();
			   System.out.println(key1+value);
		}		
	}

	private static boolean checkhead(XSSFRow row, String text) {
	for (Cell cell : row) {
		if (cell.getRichStringCellValue().getString().trim().equals(text));
		{
			return true;
		}
		
	}
		
		
		return false;
	}
	
public static String ReadfromExcel() throws IOException
{
	
	FileInputStream file=new FileInputStream("C:\\Users\\girish\\Desktop\\Resources\\FreeCrmTestData.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("TableData");
	int rows=sheet.getLastRowNum();
	int flag=0;
	for (int i = 0; i <rows; i++) {
		
		String testcase=sheet.getRow(i).getCell(0).toString();
		XSSFRow initrow=sheet.getRow(0);
		XSSFRow row=sheet.getRow(i);
		int lastcolumn=initrow.getLastCellNum();
		 
		if(testcase.equalsIgnoreCase(""))
		{
			for(int j = 0; j <lastcolumn; j++) {
			String Key=initrow.getCell(i).toString();
			String value=row.getCell(i).toString();
			map1.put(Key, value);
			}
			flag=1;
			break;
		}
		
		if(flag==1)
		{
		   for (Entry<String, String> entry:map1.entrySet())
		   {
			   String key=entry.getKey();
			   String value=entry.getValue();
		}
		   
		   for (String key:map1.keySet()) {
			
			   String value=map1.get(key);
			   if(testcase.equals(value))
			   {
				   String keyAndValue=key+value;
			   }
		}
		   
			
			break;
		}
	}
	
	return null;
}	

}
