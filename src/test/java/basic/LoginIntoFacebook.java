package basic;

import java.security.PrivateKey;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginIntoFacebook {
//declaration

	@FindBy(id="email")
	private WebElement emailTF;

	@FindBy(name="pass")
	private WebElement passwordTF;

	@FindBy(name="login")
	private WebElement loginTF;

	@FindBy(linkText="Forgotten password?")
	private WebElement forgotLink;

	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createPage;

	// initial
	
	LoginIntoFacebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void email(String e) {
		emailTF.sendKeys(e);
		

	}
	public void pass(String p) {
		passwordTF.sendKeys(p);
	}
	public void login() {
		loginTF.click();
	}
	public void text(String t) {
		forgotLink.click();
		
	}
	public void path() {
		createPage.click();
	}
	

}


