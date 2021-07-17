package main.java.utils;

import org.testng.ITestResult;

public class RetryAnalyser {

	
	int count=0;
	int retryCount=1;
    public boolean retry(ITestResult result) {
		while(count<retryCount) {
			count++;
			return true;
		}
		return false;
	}
}
