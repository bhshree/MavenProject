package browserLaunchPrg.Finance;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class LinkTesting extends BasePage
{
	
	@BeforeMethod
	@Parameters("browser")
	  public void setUP(String browser) throws Exception 
	  {		
		browserLaunch(browser, getData("amazoneurl"));
	  }
	
	
	@Test
	public void linkTesting() throws Exception 
	{
		driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]")).click();
	  
	}
  
	@AfterMethod
	public void killProcess() 
	{
	  driver.close();
	}

}
