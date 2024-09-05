package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.className("Pke_EE")).sendKeys("remdinote4");
	driver.findElement(By.className("_2iLD__")).click();
	Thread.sleep(2000);
	driver.quit();

	}

}
