package Script_TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class Annotations_Code 
{
  @BeforeSuite
  public void BeforeSuite ()
  {
	  System.out.println("Before Suite");
  }
  @BeforeTest
  public void BeforeTest ()
  {
	  System.out.println("Before Test");
  }
  @BeforeClass
  public void BeforeClass ()
  {
	  System.out.println("Before Class");
  }
  @BeforeMethod
  public void BeforeMethod ()
  {
	  System.out.println("Before Method");
  }
  @Test (priority=1)
  public void Registration() 
  {
	  System.out.println("Registration Test Case");
  }
  @Test (priority=2)
  public void Login() 
  {
	  System.out.println("Login Test Case");
  }
  @Test (priority=3)
  public void AddToCart() 
  {
	  System.out.println("AddToCart Test Case");
  }
  @AfterMethod
  public void AfterMethod ()
  {
	  System.out.println("After Method");
  }
  @AfterClass
  public void AfterClass ()
  {
	  System.out.println("After Class");
  }
  @AfterTest
  public void AfterTest ()
  {
	  System.out.println("After Test");
  }
  @AfterSuite
  public void AfterSuite ()
  {
	  System.out.println("After Suite");
  }
  
  
  
}
