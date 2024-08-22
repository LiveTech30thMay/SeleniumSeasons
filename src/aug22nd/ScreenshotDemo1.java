package aug22nd;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotDemo1 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
	}

	@Test
	public void screenshotTest() throws InterruptedException, IOException {
		
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		date=date.replace(":", "-");
		System.out.println(date);
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(srcFile, new File("D:\\010LiveTech\\Screenshots\\AdactinHomePage.png"));
		
		FileUtils.copyFile(srcFile, new File("D:\\010LiveTech\\Screenshots\\AdactinHomePage"+date+".png"));
		
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException {

		Thread.sleep(5000);
		
		driver.quit();
	}

}
