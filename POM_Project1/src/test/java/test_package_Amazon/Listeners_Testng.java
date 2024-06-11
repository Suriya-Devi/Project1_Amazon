package test_package_Amazon;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners_Testng implements ITestListener {
static WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		
		ITestListener.super.onTestStart(result);
		Reporter.log("Test Case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		
		TakesScreenshot t1 = (TakesScreenshot) driver;
		Date d = new Date();
		System.out.println(d.getTime());
		System.out.println("D is "+d);
		Date d1 = new Date(d.getTime());
		String date_format = d1.toString().replace(" ","_").replace(":","_");
		System.out.println(date_format);
		File source = t1.getScreenshotAs(OutputType.FILE);
		 File destination=new File("C:\\Users\\SSSH\\eclipse-workspace\\POM_Project1\\Screenshot_Pass\\Pass_"+date_format+".png");
		 try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Reporter.log("Test case is Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		TakesScreenshot t1 =  (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\SSSH\\eclipse-workspace\\POM_Project1\\Screenshot_Failed\\Fail_"+Math.random()+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Test case is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Test case is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		Reporter.log("Started the execution");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		Reporter.log("Finished the execution");
	}
	
	

}
