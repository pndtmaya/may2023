package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
				(
				 features="src/test/resources/BUSINESS_LOGIC",
				 glue="mapping",
				 tags="@SmokeTest",
				 plugin="pretty",
				 monochrome=true					
						
				)


public class RunTest extends AbstractTestNGCucumberTests
{

	
}
