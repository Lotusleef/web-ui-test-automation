package runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDefinitions"},
        features = "src/test/resources/features/login.feature",
        plugin = {"pretty"}
)
public class LoginTestRunner {
}
