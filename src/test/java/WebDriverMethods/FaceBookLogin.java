package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("email")).sendKeys("harikrishna@");
		  driver.findElement(By.id("password")).sendKeys("harikrishn2727");
		  driver.findElement(By.name("login")).click();
		 Thread.sleep(3000);
		 driver.quit();

	}

}
