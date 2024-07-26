package jul26th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("New User Register Here")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
