package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependaonMethodsTestNG {
	@Test
	public void navigateToApp() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}
	@Test//(dependsOnMethods = "navigateToApp")
	public void loginToApp() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys("harikrisnha");
		driver.findElement(By.id("password")).sendKeys("hari@123");
		driver.findElement(By.id("last")).click();
		Thread.sleep(2000);
		driver.quit();

	}
}
