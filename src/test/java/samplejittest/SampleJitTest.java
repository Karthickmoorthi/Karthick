package samplejittest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleJitTest {
	//@Test
	public static void loginTest() throws IOException {
		// TODO Auto-generated method stub
		WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
File src =((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("C:\\workspace\\samplejittest\\Screenshot\\snapshot.png"));
	}
}
