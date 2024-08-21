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

public class LinksTesting4 {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		driver= new ChromeDriver();
		
		driver.get("https://www.pepperfry.com/");
		
		driver.manage().window().maximize();
		
	}

	@Test
	public void noOflinksTest() throws InterruptedException {
		
		WebElement block=driver.findElement(By.xpath("//p[text()='Partner With Us']/parent::div"));

		List<WebElement> allLinks=block.findElements(By.tagName("div"));
		
		System.out.println("No of links in Partner With Us Module "+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", allLinks.get(i));
			Thread.sleep(3000);
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0, -200);");
			Thread.sleep(3000);
			allLinks.get(i).click();
			Thread.sleep(3000);
			
			
		}
	}

	@AfterMethod
	public void teardown() {

		driver.quit();
	}

}
