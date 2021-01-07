package test.listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter {
	
	@Override
	public void onTestSuccess(ITestResult tr) {
		log(".");
	}
	
	@Override
	public void onTestFailure(ITestResult tr) {
		log("F");
	}
	
	private void log(String string) {
		System.out.print(string);
	}
}
