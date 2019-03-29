package testRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features ="Feature",
		glue= {"stepDefinition"},
		plugin= {"pretty"},
		monochrome=true
		
		
		)



/*
 * @CucumberOptions( features = "Feature", glue={"StepDefinition"}, tags=
 * {"@login,@Reporttravelsummary"}, plugin =
 * {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})
 */
public class Runner {
	
	
	

}
