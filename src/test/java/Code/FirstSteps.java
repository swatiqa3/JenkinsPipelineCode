package Code;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.Status;

import Utilities.ExtentReportUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class FirstSteps extends ExtentReportUtil{
	
	pages Objpages = new pages();
	
	

	
	@Given("^User searches for a product$")
	public void user_searches_for_a_product() throws Throwable {
		TestStep=Testscenario.createNode(new GherkinKeyword("Given"), "User searches for a product");
		Objpages.func1();
	}

	@Then("^Search should be successful$")
	public void search_should_be_successful() throws Throwable {
		TestStep=Testscenario.createNode(new GherkinKeyword("Then"), "Search should be successful");
		//Assert.assertTrue(Objpages.verifySearch());
		Assert.assertTrue(false);
		Objpages.close();		
	}

}
