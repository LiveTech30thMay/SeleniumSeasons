package assignments;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\010LiveTech\\jars\\edgedriver_win64\\msedgedriver.exe");
		new EdgeDriver();

	}

}
