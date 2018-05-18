package browserLaunchPrg.Finance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;

public class LimeroadLogin extends BasePage
{
	@BeforeClass
	@Parameters("browser")
	  public void setUp(String browser) 
	{
		browserLaunch(browser, "limeroadurl");
	}
	
  @Test
  public void customerLogin() 
  {
	  //driver.findElement(By.)
  }
  

  @AfterClass
  public void killProcess() {
  }

}
