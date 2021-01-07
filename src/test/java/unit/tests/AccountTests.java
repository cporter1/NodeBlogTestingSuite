package unit.tests;

//simple Selenium test on person website

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Ignore;
import tools.TestParentClass; // importing class to be inheritted

public class AccountTests extends TestParentClass  {
	
	@Parameters({"email", "password"}) // email = coln.porter@gmail.com; password = 123
	@Test
	public void loginTest(String email, String password) throws InterruptedException {
		WebDriver driver = driverConfig();
		driver.get("http://192.168.1.66:3000");
		
		driver.manage().window().maximize(); // maximizes window size

		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		Thread.sleep(1 * 1000);
		driver.close();
		driver.quit();
	}
	
	@Ignore
	@Parameters({"email", "password"}) // email = coln.porter@gmail.com; password = 123
	@Test
	public void logOutTest(String email, String password) throws InterruptedException {
		WebDriver driver = driverConfig();
		driver.get("http://192.168.1.66:3000");
		
		driver.manage().window().maximize(); // maximizes window size

		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(1 * 1000);
		
		driver.findElement(By.xpath("//*[text()='Sign Out']")).click();
		Thread.sleep(1 * 1000);
		
		driver.close();
		driver.quit();
	}
}
