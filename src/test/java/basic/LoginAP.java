package basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAP {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		LoginIntoFacebook login=new LoginIntoFacebook(driver);
		login.email("harikrishna@");
		login.pass("53647gh");
		login.path();
		Thread.sleep(3000);
		driver.quit();

	}

}
