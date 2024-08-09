package aug9th;

import java.util.List;

import org.openqa.selenium.By;
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
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
	}

	@Test
	public void noOflinksTest() throws InterruptedException {
		
		WebElement block=driver.findElement(By.xpath("//div[text()='Make Money with Us']/parent::div"));

		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		
		System.out.println("No of links in Make money with us Module "+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
			allLinks.get(i).click();
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			Thread.sleep(3000);
			block=driver.findElement(By.xpath("//div[text()='Make Money with Us']/parent::div"));
			allLinks=block.findElements(By.tagName("a"));
			
		}
	}

	@AfterMethod
	public void teardown() {

		driver.quit();
	}

}
