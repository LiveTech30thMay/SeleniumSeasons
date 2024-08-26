package aug26th;

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

public class ShadowDom {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		driver= new ChromeDriver();
		
		driver.get("http://watir.com/examples/shadow_dom.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

	@Test
	public void shadowDomTest() throws InterruptedException, IOException {
		
		
		WebElement shadowHost1=driver.findElement(By.xpath("//div[@id='shadow_host']"));
		
		SearchContext  shadowRoot1=shadowHost1.getShadowRoot();
		
		//org.openqa.selenium.InvalidArgumentException: invalid argument: invalid locator
		
		//WebElement element1=shadowRoot1.findElement(By.xpath("//input[@type='text']"));
		
		
		//using cssSelector
		
		WebElement element1=shadowRoot1.findElement(By.cssSelector("input[type='text']"));
		
		element1.sendKeys("Selenium");
		
	}

	

	@AfterMethod
	public void teardown() throws InterruptedException {

		Thread.sleep(5000);
		
		driver.quit();
	}


}
