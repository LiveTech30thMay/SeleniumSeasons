package aug14th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHanlding1 {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		driver= new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
	}

	@Test
	public void alertHandlingTest() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		
		String actAlertText=alert.getText();
		
		Assert.assertEquals(actAlertText, "Please enter a valid user name");
		
		alert.accept();
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();
	}


}
