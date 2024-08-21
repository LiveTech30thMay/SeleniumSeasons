package aug21st;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptScrollDemo1 {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		driver= new ChromeDriver();
		
		driver.get("https://www.pepperfry.com/");
		
		driver.manage().window().maximize();
		
	}

	@Test
	public void scrollTest() throws InterruptedException {
		
		
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 1000);");
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,document.body.scrollHeight);");
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException {

		Thread.sleep(5000);
		
		driver.quit();
	}

}
