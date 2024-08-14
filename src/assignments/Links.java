package assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {
	
	
	
	public static List<String> allList;

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.livetech.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=	driver.findElement(By.xpath("//ul[@class='topsocial']"));

		List<WebElement> allEleLinks=ele.findElements(By.tagName("a"));
		
		
		for(WebElement e:allEleLinks) {
			e.click();
		}
			
	Set<String> allHandles=	driver.getWindowHandles();
	List<String> allList=new ArrayList<>(allHandles);
	
	for(int i=0;i<allList.size();i++) {
		driver.switchTo().window(allList.get(i));
		Thread.sleep(3000);
		System.out.println("url of the link = "+ i +" " + driver.getCurrentUrl());
	}
	
	//Switching to different windows
	
	driver.switchTo().window(allList.get(0));
	System.out.println("Tittle of the page " +driver.getTitle());
	Thread.sleep(2000);
	
	driver.switchTo().window(allList.get(1));
	System.out.println("Tittle of the page " +driver.getTitle());
	Thread.sleep(2000);
	
	driver.switchTo().window(allList.get(2));
	System.out.println("Tittle of the page " +driver.getTitle());
	Thread.sleep(2000);
	
	driver.switchTo().window(allList.get(3));
	System.out.println("Tittle of the page " +driver.getTitle());
	Thread.sleep(2000);
	
	driver.switchTo().window(allList.get(4));
	System.out.println("Tittle of the page " +driver.getTitle());
	Thread.sleep(2000);
	
	driver.switchTo().window(allList.get(5));
	System.out.println("Tittle of the page " +driver.getTitle());
	Thread.sleep(2000);
	
	driver.switchTo().window(allList.get(0));
	Thread.sleep(2000);
	driver.quit();
	
	
	
		




	}

}
