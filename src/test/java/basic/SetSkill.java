package basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSkill {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		SkillrAryRegister Register=new SkillrAryRegister(driver);
		Register.setFirst("Chakali");
		Register.setlast("harikrishna");
		Register.setEmail("chakaliharikrishna@gamil.com");
		Register.setpass("Hari@123");
		Register.setrepass("Hari@123");
		Register.setSign();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		

	}

}
