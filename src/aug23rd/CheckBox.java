package aug23rd;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBox {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		driver= new ChromeDriver();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

	@Test
	public void checkBoxTest() throws InterruptedException, IOException {
		
	
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	
		
	
	}

	@Test
	public void checkBoxTest2() throws InterruptedException, IOException {
		
		//driver.findElement(By.xpath("//input[@value='Butter']")).click();
		WebElement e1=driver.findElement(By.xpath("//input[@value='Butter']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", e1);
		
		Thread.sleep(3000);
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	
		
	
	}
	
	@Test
	public void checkBoxTest3() throws InterruptedException, IOException {
		
		
		List<WebElement> allChecks=driver.findElements(By.xpath("//td[@class='table5']/input"));
		
		for(int i=0;i<allChecks.size();i++)
		{
			if(allChecks.get(i).isSelected())
			{
				//allChecks.get(i).click();
				
				WebElement e1=allChecks.get(i);
				
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", e1);
				
				Thread.sleep(3000);
			}
		}
		
		Thread.sleep(3000);
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	
		
	
	}
	

	@Test
	public void radioButtonTest4() throws InterruptedException, IOException {
		
		
		List<WebElement> allChecks=driver.findElements(By.xpath("//td[@class='table5']/input"));
		
		for(int i=0;i<allChecks.size();i++)
		{
			if(!allChecks.get(i).isSelected())
			{
				//allChecks.get(i).click();
				
				WebElement e1=allChecks.get(i);
				
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", e1);
				
				Thread.sleep(3000);
			}
		}
		
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
		
	
		
	
	}
	@AfterMethod
	public void teardown() throws InterruptedException {

		Thread.sleep(5000);
		
		driver.quit();
	}


}
