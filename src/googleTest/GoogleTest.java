package googleTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E://Testing//Webdriver//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}// setup

	@Test(groups="Title")
	public void TitleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Google", "Google");
	}

	@Test(groups="Logo")
	public void LogoTest()
	{
		Boolean b=driver.findElement(By.xpath("//img[@id='hplogo'")).isDisplayed();
		System.out.println(b);

	}

	//
	@Test()
	public void LinkTest()
	{
		Boolean b1=driver.findElement(By.linkText("")).isEnabled();
		System.out.println(b1);
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}//

}
