package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
	(features=  "src/test/java/features",     // {"src/test/java/features/addressValidations.feature"},    //  
	
	 plugin =   "json:target/jsonReports/cucumber-report.json", //  {"pretty","html:reports/html.html"},
			  
	 glue= {"stepDefinations"})

public class TestRunner {
//tags= {"@DeletePlace"}  compile test verify
}
