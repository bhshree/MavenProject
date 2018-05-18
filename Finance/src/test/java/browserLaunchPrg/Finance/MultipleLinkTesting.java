package browserLaunchPrg.Finance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;

public class MultipleLinkTesting extends BasePage
{ 
	@BeforeClass
	@Parameters("browser")
	  public void StartProcess(String browser) throws Exception 
	  {
		browserLaunch(browser,getData("ecommerceurl"));
	  }
	
  @Test
  public void singleLink() 
  {
  }
  

  @AfterClass
  public void endProcess() 
  {
  }

}
