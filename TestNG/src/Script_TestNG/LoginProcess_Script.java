package Script_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginProcess_Script 
{
	WebDriver driver;
	
	public LoginProcess_Script(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// Repository of WebElement
	
	By username=By.name("user-name");
	By password=By.name("password");
	By login=By.xpath("//input[@type='submit']");
	
	// Repository Methods
	
	public void url() throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	public void UserName(String un)
	{
		driver.findElement(username).sendKeys(un);;
	}
	public void PassWord(String pw)
	{
		driver.findElement(password).sendKeys(pw);;
	}
	public void LoginBtn()
	{
		driver.findElement(login).click();
	}
	public void LoginProcess(String un, String pw) throws InterruptedException
	{
		url();
	    UserName(un);
	    PassWord(pw);
	    LoginBtn();
		
	}
}
