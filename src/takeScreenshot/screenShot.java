package takeScreenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testBase.Base;
@Listeners({screenShotListener.screenshotListener.class,listners.ExtendReportListner.class})
public class screenShot extends Base{
	
	@BeforeMethod
	public void  intitialization()
	{
		stetUp();
	}
	
	@Test
	public void takescreenshot()
	{
		Assert.assertEquals(true, false);
	}
	@Test
	public void takescreenshot1()
	{
		Assert.assertEquals(true, true);
	}	
	@Test
	public void takescreenshot2()
	{
		Assert.assertEquals(true, false);
	}
	@Test 
	public void takescreenshot3()
	{
		Assert.assertEquals(true, false);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
