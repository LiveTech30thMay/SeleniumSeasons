package jul30th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods3 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.name("option1")).getAttribute("checked"));
		
		System.out.println(driver.findElement(By.name("option2")).getAttribute("checked"));
		
		System.out.println(driver.findElement(By.name("option3")).getAttribute("checked"));
		
		driver.quit();

	}

}
