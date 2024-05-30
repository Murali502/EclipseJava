package read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel1 {

	//ofc logic
	public static String EnvName="";
	public static HashMap<String,String> globalmap;
	public static HashMap<String,String> readDataSheet(String TestCaseName,String SheetNam) throws IOException
	{
		String  value=null;
		FileInputStream fs;
		HashMap<String,String> hashmap=new HashMap<>();
		try {
			
			Path path=Paths.get(new File("").getAbsolutePath());
			fs=new FileInputStream(path+getPropValues("Vendor_file_path"));
			
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
						//break;
				}
					break;
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


	public static String getPropValues(String key) throws IOException
	{
	FileInputStream inputstream=null;
	String result= null;

	try {
		Properties prop=new Properties();
		
		String propFileName=".\\Resources\\config.properties";
		inputstream =new FileInputStream(propFileName);
		
		if(inputstream!=null)
		{
			prop.load(inputstream);
		}
		else
		{
			throw new FileNotFoundException("property file "+propFileName +"not found in the classpath");
		}
		
		result=prop.getProperty(key);
	}
	catch(Exception e)
	{
		System.out.println("Exception :"+e);
	}
	finally
	{
	inputstream.close();	
	}
	return result;
	}	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readDataSheet("Create_Contact_Page", "TableData");
	}

}
