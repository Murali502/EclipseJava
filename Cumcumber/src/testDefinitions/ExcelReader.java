package testDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {
	
	public static String EnvName="";
	public static HashMap<String,String> readDataSheet(String TestCaseName,String SheetNam) throws IOException
	{
		String  value=null;
		FileInputStream fs;
		HashMap<String,String> hashmap=new HashMap<>();
		try {
			
			Path path=Paths.get(new File("").getAbsolutePath());
			fs=new FileInputStream(path+Prop.getPropValues("Vendor_file_path"));
			
			XSSFWorkbook workbook=new XSSFWorkbook(fs);
			XSSFSheet sheet=workbook.getSheet(SheetNam);
			String key="";
			int rows=sheet.getLastRowNum()+1;
			
			
			for (int i = 0; i <rows; i++) {
				
				XSSFRow row=sheet.getRow(i);
				XSSFRow initrow=sheet.getRow(0);
				
				String testcase_value=sheet.getRow(i).getCell(0).toString();
				 
				if(testcase_value.equalsIgnoreCase(TestCaseName))
				{
					for(int j = 0; j <initrow.getLastCellNum(); j++) {
						
						value=null;
						if(initrow.getCell(j).getStringCellValue()==null)
						{
							key="";
						}
						else
						{
							key=initrow.getCell(j).getStringCellValue();
						}
						
						try
						{
							int datatype=row.getCell(j).getCellType();
							
							if(datatype==1)
							{
								value=row.getCell(j).getStringCellValue();
							}
							if(datatype==0)
							{
								value=row.getCell(j).getRawValue();
							}
						}
						catch(Exception e)
						{
							value=null;
						}
						
						hashmap.put(key,value);
						break;
				}
				}
			}
		}
				
				catch(FileNotFoundException e1)
				{
				e1.printStackTrace();	
				}
				EnvName=hashmap.get("Environment");
				return hashmap;
				
	}

}
