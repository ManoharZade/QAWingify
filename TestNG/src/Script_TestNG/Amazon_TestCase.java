package Script_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_TestCase 
{
  
  WebDriver driver;
	
  @BeforeSuite
  public void LaunchBrowser () throws InterruptedException
  {
	    WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);                   // Launch Browser
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
  }
  
  @BeforeTest
  public void ProductSearch () throws InterruptedException
  {
	  WebElement Amazon = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	  Amazon.click();
	  Amazon.sendKeys("Mobile");
	  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	  Thread.sleep(2000);
  }
  
  @Test  (priority=1)
  public void MobilePhone () throws InterruptedException 
  {
	  driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	  Thread.sleep(2000);
  }
  @Test  (priority=2)
  public void Electronics () throws InterruptedException
  {
	  Set<String> handle = driver.getWindowHandles();
	  Iterator<String> itr = handle.iterator();
	  String parentWindow=itr.next();
	  String childWindow=itr.next();
	  driver.switchTo().window(childWindow);
	  
	  driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[7]")).click();
	  Thread.sleep(2000);
  }
  
  @AfterTest
  public void Logout () throws InterruptedException
  {
	  driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	  Thread.sleep(2000);
  }
  
  @AfterSuite 
  public void CloseBrowser ()
  {
	  driver.quit();
  }
  
  
}
