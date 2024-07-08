package POM;

import Script_TestNG.LoginProcess_Script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calling_PageObjectModel {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);                   // Launch Browser
		driver.manage().window().maximize();
		
		LoginProcess_Script sw= new LoginProcess_Script(driver);
//		sw.url();
//		sw.UserName("standard_user");
//		sw.PassWord("secret_sauce");
//		sw.LoginBtn();
		
		sw.LoginProcess("standard_user", "secret_sauce");
		

	}

}
