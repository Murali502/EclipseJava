package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class ReportHelper {

	public static void copyFileUsingChannel(File source,File dest) throws IOException
	{
		FileChannel soureChannel =null;
		FileChannel destChannel =null;
		
		try {
			soureChannel= new FileInputStream(source).getChannel();
			destChannel= new FileOutputStream(dest).getChannel();
			destChannel.transferFrom(soureChannel, 0, soureChannel.size());
			soureChannel.close();
			destChannel.close();
		}finally
		{
			soureChannel.close();
			destChannel.close();	
		}
		
	}
}
