package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(id="Email")
	WebElement usernameTextbox;
	
	@FindBy(id="Password")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//div/button[contains(text(), 'Log in')]")
	WebElement loginButton;
	
	/*
	 * private By usernameTestBox =By.id("Email"); private By
	 * passwordTextBox=By.id("Password"); private By
	 * loginButton=By.xpath("//div/button[contains(text(), 'Log in')]");
	 */
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username)
	{
		usernameTextbox.clear();
		usernameTextbox.sendKeys(username);
		//driver.findElement(usernameTestBox).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
		
		/*
		 * driver.findElement(passwordTextBox).clear();
		 * driver.findElement(passwordTextBox).sendKeys(password);
		 */
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
	

}
