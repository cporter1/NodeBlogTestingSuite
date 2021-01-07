package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//This class is inherited by other classes for configuration functions
public class TestParentClass {
	
	public WebDriver driverConfig() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Colin Porter\\eclipse-workspace\\Jars\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		return new ChromeDriver();
	}
}
