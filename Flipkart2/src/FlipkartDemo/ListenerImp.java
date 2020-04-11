package FlipkartDemo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImp implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		Date date = new Date();
		int day = date.getDate();

		String[] dateArry = date.toString().split(" ");
		String month = dateArry[1];
		String year = dateArry[5];
		String time1 = dateArry[3];
		String time = time1.replaceAll(":", "-");

		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName);
		EventFiringWebDriver fire = new EventFiringWebDriver(Base.Scrdriver);
		File src = fire.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"./screenshots/" + methodName + "_" + day + "_" + month + "_" + year + "_" + time + ".png");

		try {
			FileUtils.copyFile(src, dest);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
