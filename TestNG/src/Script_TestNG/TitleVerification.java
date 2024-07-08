package Script_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleVerification 
{
  WebDriver driver;
  @Test
  public void MyntraTestCase () throws InterruptedException 
  {
	    WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);                   // Launch Browser
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		String ActualTitle = driver.getTitle();
		System.out.println("Actual Title "+ActualTitle);
		
		String ExpectedTitle = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
  }
}
