package Code;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.MediaEntityBuilder;
import Utilities.ExtentReportUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks extends ExtentReportUtil{

	@Before
	public void initialize(Scenario scenario) throws ClassNotFoundException {		
		Testfeature = extent.createTest(new GherkinKeyword("Feature"), "FeatureName");
		Testscenario = Testfeature.createNode(new GherkinKeyword("Scenario"), scenario.getName());		
	}
	
	
	@After
	public void setUp(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			Testscenario.fail("failed Scenario");		
			 TakesScreenshot scrShot =((TakesScreenshot) pages.driver);
			 File SrcFileSS = scrShot.getScreenshotAs(OutputType.FILE);
			 String path = "C:\\Users\\SK\\eclipse-workspace\\JenkinsPipelineGitProject\\Reports\\Screenshots\\ScreenShot.png";
			 File destFile = new File(path);
			 FileUtils.copyFile(SrcFileSS, destFile);

			 Testscenario.fail("Failed").addScreenCaptureFromPath("./Screenshots/ScreenShot.png");
			 TestStep.fail("Test is Failed", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			
		}
		CloseReport();
	}

}
