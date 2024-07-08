package Script_TestNG;

import org.testng.annotations.Test;

public class GroupTestCase 
{
  @Test (groups = {"Sanity"})
  public void TestCase1 () 
  {
	  System.out.println("Test case 1");
  }
  @Test (groups = {"Sanity","Retesting"})
  public void TestCase2 () 
  {
	  System.out.println("Test case 2");
  }
  @Test (groups = {"Smoke","Retesting"})
  public void TestCase3 () 
  {
	  System.out.println("Test case 3");
  }
  @Test (groups = {"Sanity","Smoke"})
  public void TestCase4 () 
  {
	  System.out.println("Test case 4");
  }
  @Test (groups = {"Retesting"})
  public void TestCase5 () 
  {
	  System.out.println("Test case 5");
  }
  @Test (groups = {"Smoke"})
  public void TestCase6 () 
  {
	  System.out.println("Test case 6");
  }
  @Test (groups = {"Sanity","Smoke","Restesting"})
  public void TestCase7 () 
  {
	  System.out.println("Test case 7");
  }
}
