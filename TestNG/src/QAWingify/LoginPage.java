package QAWingify;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	
	WebDriver driver;
	
  @BeforeMethod
  public void setup() throws InterruptedException 
  {
	    WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);                   // Launch Browser
		driver.manage().window().maximize();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,786)");
		Thread.sleep(2000);
	    
  }
  
  
  @Test(priority = 1)
  public void LoginWithValidCredentials() throws InterruptedException
  {

	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Manohar");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Manohar143");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='form-check-input']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@id='log-in']")).click();
	  Thread.sleep(2000);
	  JavascriptExecutor js =(JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,786)");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//th[@id='amount']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//th[@id='amount']")).click();
	  Thread.sleep(2000);
	  
  }
  
  
  @Test(priority = 2)
  public void LoginWithBlankUsername() throws InterruptedException
  {
	 
	  driver.findElement(By.xpath("//input[@id='username']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Manohar143");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='form-check-input']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@id='log-in']")).click();
	  Thread.sleep(2000);
	  
	  WebElement errorMessage = driver.findElement(By.className("alert-warning"));
	  
	  String expectedMessage = "Username must be present";
	  String actualMessage = errorMessage.getText();
	  
	  Assert.assertTrue(actualMessage.contains(expectedMessage));
  }
  
  
  @Test(priority = 3)
  public void LoginWithBlankPassowrd() throws InterruptedException
  {
	 
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Manohar");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='password']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='form-check-input']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@id='log-in']")).click();
	  Thread.sleep(2000);
	  
      WebElement errorMessage = driver.findElement(By.className("alert-warning"));
	  
	  String expectedMessage = "Password must be present";
	  String actualMessage = errorMessage.getText();
	  
	  Assert.assertTrue(actualMessage.contains(expectedMessage));
	  
  }
  
  
  @Test(priority = 4)
  public void LoginWithBlankCredentials() throws InterruptedException
  {

	  driver.findElement(By.xpath("//input[@id='username']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='password']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='form-check-input']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@id='log-in']")).click();
	  Thread.sleep(2000);
	  
      WebElement errorMessage = driver.findElement(By.className("alert-warning"));
	  
	  String expectedMessage = "Both Username and Password must be present";
	  String actualMessage = errorMessage.getText();
	  
	  Assert.assertTrue(actualMessage.contains(expectedMessage));
	  
  }
  
  @AfterMethod
  public void CloseBrowser ()
  {
	  driver.quit();
  }
  
  
}
