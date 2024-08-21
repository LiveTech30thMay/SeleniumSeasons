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

public class ValidateLogin {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
	}

	@Test
	public void validateLoginTest() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement e1=driver.findElement(By.xpath("//input[@name='username']"));
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red');",e1);
		Thread.sleep(2000);
		e1.sendKeys("reyaz0806");
		
		
			
		
		WebElement e2=driver.findElement(By.xpath("//input[@name='password']"));
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red');",e2);
		Thread.sleep(2000);
		e2.sendKeys("reyaz123");
		

		WebElement e3=driver.findElement(By.xpath("//input[@name='login']"));
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red');",e3);
		Thread.sleep(2000);
		e3.click();
		
		
		
		
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException {

		Thread.sleep(5000);
		
		driver.quit();
	}

}
