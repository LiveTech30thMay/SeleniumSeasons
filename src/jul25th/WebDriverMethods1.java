package jul25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//app launch
		
		driver.get("https://adactinhotelapp.com/");
		
		//driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Thread.sleep(3000);
		
		//getTitle():String
		
	    System.out.println(driver.getTitle());
		
		//close the window/tab
		
		//driver.close();
		
		driver.quit();
		

	}

}
