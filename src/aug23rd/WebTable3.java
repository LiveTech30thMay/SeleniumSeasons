package aug23rd;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTable3 {

WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		driver= new ChromeDriver();
		
		driver.get("https://www.timeanddate.com/worldclock/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

	@Test
	public void webTableTest() throws InterruptedException, IOException {
		
		WebElement table=driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']/tbody"));
	
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		for(WebElement row:rows)
		{
			List<WebElement> cols=row.findElements(By.tagName("td"));
			for(WebElement col:cols)
			{
				System.out.print(col.getText()+"\t");
			}
			System.out.println();
		}
	
	}

	

	@AfterMethod
	public void teardown() throws InterruptedException {

		Thread.sleep(5000);
		
		driver.quit();
	}


}
