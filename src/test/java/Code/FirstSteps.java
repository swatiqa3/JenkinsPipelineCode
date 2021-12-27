package Code;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.Status;

import Utilities.ExtentReportUtil;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FirstSteps{ 
	
	pages Objpages = new pages();
	

	@Given("^User searches for a product$")
	public void user_searches_for_a_product() throws Throwable {
		ExtentReportUtil.TestStep=ExtentReportUtil.Testscenario.createNode(new GherkinKeyword("Given"), "User searches for a product");
		Objpages.launch();
		Objpages.func1();
	}

	@Then("^Search should be successful$")
	public void search_should_be_successful() throws Throwable {
		ExtentReportUtil.TestStep=ExtentReportUtil.Testscenario.createNode(new GherkinKeyword("Then"), "Search should be successful");
		//Assert.assertTrue(Objpages.verifySearch());
		Assert.assertTrue("Search is not successful", false);
		//Assert.assertTrue(false);
		Objpages.close();		
	}
	
	@When("^first product is clicked$")
	public void firstProductClicked() throws Throwable {
		ExtentReportUtil.TestStep=ExtentReportUtil.Testscenario.createNode(new GherkinKeyword("When"), "first product is clicked");
		Objpages.clickFirstProduct();
	}
	
	@Then("^Click should be successful$")
	public void verifyclickfirst() throws Throwable {
		ExtentReportUtil.TestStep=ExtentReportUtil.Testscenario.createNode(new GherkinKeyword("Then"), "Click should be successful");
		Assert.assertTrue("Click is not successful",Objpages.verifyClickProduct());
		Objpages.close();		
	}


}
