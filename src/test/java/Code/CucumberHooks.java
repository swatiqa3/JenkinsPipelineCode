package Code;

import Utilities.ExtentReportUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks {
	
	ExtentReportUtil extentReport = new ExtentReportUtil();
	
	
	@Before
	public void initialize() {		
		extentReport.CreateReport();
	}
	
	
	@After
	public void setUp(Scenario scenario) {
		extentReport.CloseReport();
	}

}
