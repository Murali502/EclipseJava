package testDefinitions;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.plaf.synth.SynthSeparatorUI;


public class CaptureScreenshotswithoutusingSeleniumApi {
	
	
	public static String CaptureScreenshot(String ScreenshotName) throws AWTException
	{
		Robot robot=new Robot();
		String format="jpg";
		
		File file=new File(".//HtmlOutput//"+ScreenshotName+"."+format);
		try
		{
			Rectangle screenRect=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			
			BufferedImage screenFullImage;
			screenFullImage=robot.createScreenCapture(screenRect);
			ImageIO.write(screenFullImage, format, file);
			System.out.println("A full screenshot saved!"+ScreenshotName+"."+format);
			
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
		
		return ScreenshotName;
		
	}

}
