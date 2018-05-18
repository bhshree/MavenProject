package browserLaunchPrg.Finance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class DynamicLinks extends BasePage
{
	@BeforeClass
	@Parameters("browser")
	public void StartProcess(String browser) throws Exception 
	{
	browserLaunch(browser,getData("bbcurl"));
	}

	
  @Test
  public void dynamicLinks() throws InterruptedException 
  {
	  WebElement header=driver.findElement(By.className("most-popular"));
	  List<WebElement> links=header.findElements(By.tagName("a"));
	  
	  for(int i=0;i<links.size();i++)
	  {
		 
		 String var=links.get(i).getText();
		 System.out.println(var);
		 links.get(i).click();
		 driver.navigate().back();
		 Thread.sleep(5000);
		 
		 header=driver.findElement(By.className("most-popular"));
		 links=header.findElements(By.tagName("a"));
		   
	  }
	  
  }
  

  @AfterClass
  public void afterClass() 
  {
  }

}
