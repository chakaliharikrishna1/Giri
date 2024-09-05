package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrAryRegister {
	
	 
	@FindBy(name="firstname")
	
	private WebElement FirstDC;
	
	@FindBy(name="lastname")
	private WebElement lasttDC;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailtDC;
	
	@FindBy(xpath="(//input[@placeholder='Password'])[2]")
	private WebElement PasstDC;
	
	@FindBy(name="repassword")
	private WebElement rePasstDC;
	
	@FindBy(partialLinkText="membership")
	private WebElement alreadytDC;
	
	@FindBy(xpath="//a[text()=' Home']")
	private WebElement hometDC;
	
	@FindBy(name="signup")
	private WebElement registerDC;
	
	public SkillrAryRegister(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void setFirst(String name) {
		FirstDC.sendKeys(name);
		
	}
	public void setlast(String last) {
		lasttDC.sendKeys(last);
	}
	public void setEmail(String Em) {
		emailtDC.sendKeys(Em);
	}
	public void setpass(String password) {
		PasstDC.sendKeys(password);
	}
	public void setrepass(String repass) {
		rePasstDC.sendKeys(repass);
	}
	public void setmemeber() {
		alreadytDC.click();
	}
	public void sethome() {
		hometDC.click();
	}

	public void setSign() {
		registerDC.click();
	
	}

	
	
		
	
	
	

	
	
	


	
	
	
	
	
	
	
	
	
	

}
