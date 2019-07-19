package scenario;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Training_C2a.05.01\\workspace\\scenario\\src\\resources\\java\\login.feature",
plugin= {"html:target/Reports"})
public class TestRunner {
}
