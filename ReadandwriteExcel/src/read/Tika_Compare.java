package read;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;

public class Tika_Compare {

	public static void main(String[] args) throws IOException, TikaException {
		// TODO Auto-generated method stub
       String atualFile ="C:\\Users\\girish\\Desktop\\EclipseJava\\ReadandwriteExcel\\Resources\\ActualFile.xlsx";
       String originalFile ="C:\\Users\\girish\\Desktop\\EclipseJava\\ReadandwriteExcel\\Resources\\OriginalFile.xlsx";
       
       File file =new File(atualFile);
    		   
       File file1 =new File(originalFile);
       compareXlsx(file,file1);
		
	}
	
	private static void compareXlsx(File expected, File result) throws IOException, TikaException {
	     Tika tika = new Tika();
	     String expectedText = tika.parseToString(expected);
	     String resultText = tika.parseToString(result);
	     assertEquals(expectedText, resultText);
	}

}
