package retryAnalyzer;

import org.testng.IRetryAnalyzer;

//this function for execute only failed test cases
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
{
	int cnt=0;
	int retryLimit = 3;
	
	//this code for execute only failed test cases
	
	public boolean retry(ITestResult result)
	{
		if(cnt<retryLimit)
		{
			cnt++;
			return true;
		}
		
		return false;
		
	}
}
