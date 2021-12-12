package Code;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

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
