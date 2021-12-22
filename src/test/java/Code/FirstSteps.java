package Code;

import org.junit.Assert;

import com.aventstack.extentreports.Status;

import Utilities.ExtentReportUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class FirstSteps {
	
	pages Objpages = new pages();
	
	@Given("^User searches for a product$")
	public void user_searches_for_a_product() throws Throwable {
		Objpages.func1();
	}

	@Then("^Search should be successful$")
	public void search_should_be_successful() throws Throwable {	
		Assert.assertTrue(Objpages.verifySearch());
		Objpages.close();		
	}

}
