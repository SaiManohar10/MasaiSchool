package RunnerClass02;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Program Files\\sts-4.21.1.RELEASE\\CucummberInclass\\src\\test\\resources\\InclassTestng\\Inclasstestng.feature",
		glue = "stepDefination02"
		)
public class Run03 extends AbstractTestNGCucumberTests {
	

}
