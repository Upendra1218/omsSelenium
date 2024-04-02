package testScheduleRun;

import java.util.ArrayList;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.testng.TestNG;

import data.TestData;

public class SeleniumTestJob implements Job {
	private static TestData TD = new TestData();
	
	 public void execute(JobExecutionContext context) throws JobExecutionException {
		    // Create an instance of TestNG
		    TestNG testNG = new TestNG();

		    // Create a list of test suite XML files
		    List<String> testSuites = new ArrayList<>();
		    testSuites.add("C:\\Users\\Upendra Reddy\\git\\ProvidioLatestCode\\proVidioETG\\src\\test\\java\\testSuiteRunner\\smokeTestSuite.xml");
		   
		    // Set the test suite classes or packages to be executed
		    testNG.setTestSuites(testSuites);

		    // Run the test suite
		    testNG.run();
	 }
}