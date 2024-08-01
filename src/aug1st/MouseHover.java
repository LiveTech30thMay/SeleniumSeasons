package aug1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.kvb.co.in/");
		
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.partialLinkText("Personal")))
		         .pause(3000)
				 .moveToElement(driver.findElement(By.xpath("//*[@id=\"Personal\"]/ul/li/ul/li[3]/a")))
				 .pause(3000)
				 .click(driver.findElement(By.xpath("//*[@id=\"p-loans\"]/div/div[3]/div/div[2]/ul/li[2]/a")))
				 .build()
				 .perform();
		
		Thread.sleep(3000);
		
		
		driver.quit();

	}

}
