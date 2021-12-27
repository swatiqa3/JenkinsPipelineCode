package Code;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.gherkin.model.Feature;

import Utilities.ExtentReportUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks{ 



	@Before
	public void initialize(Scenario scenario) throws ClassNotFoundException {	
		String temp = scenario.getId().split(";")[0];
		if(ExtentReportUtil.Testfeature== null || !temp.equals(ExtentReportUtil.TestfeatureName)) {
			ExtentReportUtil.Testfeature = ExtentReportUtil.extent.createTest(new GherkinKeyword("Feature"),scenario.getId().split(";")[0]);
			ExtentReportUtil.TestfeatureName = temp;
		}
		ExtentReportUtil.Testscenario = ExtentReportUtil.Testfeature.createNode(new GherkinKeyword("Scenario"), scenario.getName());		
	}
	
	
	@After
	public void setUp(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			ExtentReportUtil.Testscenario.fail("failed Scenario");		
			 TakesScreenshot scrShot =((TakesScreenshot) pages.driver);
			 File SrcFileSS = scrShot.getScreenshotAs(OutputType.FILE);
			 String path = "C:\\Users\\SK\\eclipse-workspace\\JenkinsPipelineGitProject\\Reports\\Screenshots\\"+scenario.getName()+".png";
			 File destFile = new File(path);
			 FileUtils.copyFile(SrcFileSS, destFile);
			 ExtentReportUtil.TestStep.fail(scenario.getStatus(), MediaEntityBuilder.createScreenCaptureFromPath(path).build());			
			 
		}
	}
	

}
