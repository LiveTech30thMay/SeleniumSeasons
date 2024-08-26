package aug26th;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fileupload {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		driver= new ChromeDriver();
		
		driver.get("https://imgur.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

	@Test
	public void fileUploadTest() throws InterruptedException, IOException, AWTException {
		
		
		driver.findElement(By.xpath("//span[text()='New post']/preceding-sibling::img")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Choose Photo/Video']/child::img")).click();
		
		Thread.sleep(2000);
		
		String filePath="D:\\012LivetechWS\\SeleniumSeasons\\SQL joins.png";
		
		StringSelection selection=new StringSelection(filePath);
		
		Toolkit toolKit=Toolkit.getDefaultToolkit();
		
		Clipboard  clipboard=toolKit.getSystemClipboard();
		
		clipboard.setContents(selection, null);
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

	

	@AfterMethod
	public void teardown() throws InterruptedException {

		Thread.sleep(5000);
		
		driver.quit();
	}



}
