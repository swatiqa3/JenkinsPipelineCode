package Code;

	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src\\test\\java\\Code\\First.feature"
			,glue={"Code"}
			)

	public class Runner {

	}


