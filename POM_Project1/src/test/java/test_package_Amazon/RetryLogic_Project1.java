package test_package_Amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic_Project1 implements IRetryAnalyzer
{
     int initial_count = 0;
     int total_count = 2;
	@Override
	public boolean retry(ITestResult result) {
		if(initial_count<total_count) {
			initial_count++;
			return true;
		}

		return false;
	}

}
