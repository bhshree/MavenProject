package browserLaunchPrg.Finance;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class RadioButton extends BasePage
{
	
	 @BeforeMethod(groups= {"smoke","regression"})
	 @Parameters("browser")
	  public void beforeMethod(String browser) throws Exception
	  {
		  browserLaunch(browser,getData("radiobtnurl"));
	  }
	  
	  @Test(groups= {"smoke","regression"})
	  public void Radiobutton() 
	  {
		  WebElement radiobtn=driver.findElement(By.name("//input[2][@name='group1']"));
		  radiobtn.click();
		
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
		driver.close();  
	  }
  }


