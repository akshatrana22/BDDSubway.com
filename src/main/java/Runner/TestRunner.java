package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\aksrana\\eclipse-workspace\\com.subway.automationBDD\\src\\main\\java\\Features"
		,glue={"stepDefinition"}
		,strict=true
		)

public class TestRunner {

}
