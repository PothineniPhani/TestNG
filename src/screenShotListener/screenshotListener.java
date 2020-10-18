package screenShotListener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import testBase.Base;

public class screenshotListener extends Base implements ITestListener {

	@Override		
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed");
		screenShot(result.getMethod().getMethodName());
	}	

}
