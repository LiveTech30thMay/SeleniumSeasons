package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTesting4 {

	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
	}

	@Test
	public void noOflinksTest() {
		
		
		WebElement element1=driver.findElement(By.id("searchDropdownBox"));

		List<WebElement> allItems=element1.findElements(By.tagName("option"));
		
		System.out.println("no of items "+allItems.size());
		
		for(int i=0;i<allItems.size();i++)
		{
			System.out.println(allItems.get(i).getText());
		}
			
			
	}

	@AfterMethod
	public void teardown() {

		driver.quit();
	}

		
		

	}

