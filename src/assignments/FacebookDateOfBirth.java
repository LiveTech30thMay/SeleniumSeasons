package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDateOfBirth {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
		WebElement  e1=driver.findElement(By.id("day"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("2");
		
		Thread.sleep(2000);
		
		WebElement  e2=driver.findElement(By.id("month"));
		Select s2=new Select(e2);
		s2.selectByVisibleText("Oct");
		
		Thread.sleep(2000);
		
		WebElement  e3=driver.findElement(By.id("year"));
		Select s3=new Select(e3);
		s3.selectByVisibleText("2000");
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
	}

}
