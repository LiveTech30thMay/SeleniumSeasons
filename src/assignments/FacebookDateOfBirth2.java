package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDateOfBirth2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("10");
		
		Thread.sleep(2000);
		
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Oct");
		
		Thread.sleep(2000);
		
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2000");
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
	}

}
