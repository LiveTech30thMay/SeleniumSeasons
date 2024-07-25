package assignments;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\010LiveTech\\jars\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		new FirefoxDriver();

	}

}
