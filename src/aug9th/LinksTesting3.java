package aug9th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksTesting3 {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
	}

	@Test
	public void noOflinksTest() {
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		}

	}

	@AfterMethod
	public void teardown() {

		driver.quit();
	}

}
