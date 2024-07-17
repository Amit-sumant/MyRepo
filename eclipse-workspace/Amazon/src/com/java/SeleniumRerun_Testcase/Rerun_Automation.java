package com.java.SeleniumRerun_Testcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun_Automation implements IRetryAnalyzer
{
	private int retryCnt = 0;
	private static final int maxCnt = 5;
	
	@Override
	public boolean retry(ITestResult result)
	{
		if(retryCnt < maxCnt)
		{
			retryCnt++;
			return true;
		}
		
		return false;
	}

}
