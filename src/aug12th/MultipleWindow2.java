package aug12th;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindow2 {

	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
	}

	@Test
	public void multipleWindowsTest() throws InterruptedException {
		
		String homeWindowId=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Thread.sleep(3000);
		
		switchToWindow("Not Found");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowId);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		
		switchToWindow("TestFlight - Apple");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowId);
		
	}

	private void switchToWindow(String expTitle) {
		
		Set<String>  allWindowIds=driver.getWindowHandles();
		
		Iterator<String> it=allWindowIds.iterator();
		
		while(it.hasNext())
		{
			String windowId=it.next();
			
			driver.switchTo().window(windowId);
			
			if(driver.getTitle().equals(expTitle))
			{
				break;
			}
		}
		
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();
	}

		
}
