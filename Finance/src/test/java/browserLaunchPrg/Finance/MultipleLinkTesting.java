package browserLaunchPrg.Finance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class MultipleLinkTesting extends BasePage
{ 
	@BeforeClass
	@Parameters("browser")
	  public void StartProcess(String browser) throws Exception 
	  {
		browserLaunch(browser,getData("bingurl"));
	  }
	
  @Test(priority=2,enabled=false)
  public void singleLink() 
  {
	  driver.findElement(By.linkText("Register Now")).click();
  }
  
  @Test(priority=1,enabled=false)
  public void multipleLinks() 
  {
	 List<WebElement> var=driver.findElements(By.tagName("a"));
	 for(int i=0;i<var.size();i++)
	 {
		 if(!var.get(i).getText().isEmpty())
		 {
		 String links=var.get(i).getText();
		 System.out.println(links);
		 }
		 
	 }
	  
  }
  @Test(priority=0)
  public void staticHeaderLinks() 
  {
	 WebElement header= driver.findElement(By.id("sc_hdu"));
	List<WebElement> links= header.findElements(By.tagName("a"));
	
	for(int i=0;i<links.size();i++)
	{
		if(!links.get(i).getText().isEmpty())
		{
			if(links.get(i).getText().equals("Videos"))
			{
				links.get(i).click();
			}
		}
		header= driver.findElement(By.id("sc_hdu"));
		links= header.findElements(By.tagName("a"));
	}
	}
  
  @AfterClass
  public void endProcess() 
  {
  }

}
