package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"login_div\"]/button")).click();
		
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"user_div\"]/div/div[2]/button")))
		       .moveToElement((driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/div[2]/div/a[3]"))))
		       .pause(3000)
		       .click().build().perform();
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"user_div\"]/div/div[2]/button")))
		       .moveToElement((driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/div[2]/div/a[3]"))))
		       .click()
		       .pause(3000)
		       .build()
		       .perform();
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[2]/div[2]/button")))
				.pause(1000)
				.doubleClick()
				.build()
				.perform();
		
		Thread.sleep(3000);
		driver.quit();
		
		//thread
		

	}

}
