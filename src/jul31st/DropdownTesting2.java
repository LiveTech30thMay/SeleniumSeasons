package jul31st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(dropdown);
		
		//s1.selectByIndex(12);
		
		// s1.selectByValue("search-alias=computers");
		
		s1.selectByVisibleText("Books");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
