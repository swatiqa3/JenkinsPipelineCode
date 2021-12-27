package Code;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.GherkinKeyword;

import Utilities.ExtentReportUtil;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src\\test\\java\\Code\\"
			,glue={"Code"}
			)

	public class Runner {	
		static ExtentReportUtil objExtentReportUtil = new ExtentReportUtil();
		
		@BeforeClass
		public static void Launch() throws ClassNotFoundException {
		
		}
		
		
		@AfterClass
		public static void close() {
			objExtentReportUtil.CloseReport();
		}
	
	}


