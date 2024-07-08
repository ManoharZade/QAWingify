package Script_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Provider 
{
  WebDriver driver;
  @DataProvider
  public Object[][] searchdata ()
  {
	  Object[][] searchMobile=new Object[3][2];
	  searchMobile [0][0]="Realme ";
	  searchMobile [0][1]="9 Pro+ 5g";
	  searchMobile [1][0]="One Plus ";
	  searchMobile [1][1]="Nord 3t";
	  searchMobile [2][0]="Iphone ";
	  searchMobile [2][1]="15 pro max";

	return searchMobile;
  }
  
  @Test   (dataProvider="searchdata")
  public void searchbox(String brand, String variant) throws InterruptedException 
  {
	    WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);                   // Launch Browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.click();
		searchbox.sendKeys(brand+" "+variant);
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
  }
}
