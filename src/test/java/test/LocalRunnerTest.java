package test;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.ClassRule;
import org.junit.runner.RunWith;
import utils.TestRule;

@RunWith(Cucumber.class)
@CucumberOptions(	features = "src/test/resources/features/teste03.feature",
					glue = {""},
					tags = "",
					monochrome = true,
					snippets = CucumberOptions.SnippetType.CAMELCASE,
					dryRun = false,
					plugin = { "pretty", "html:target/cucumber-reports" }
					)
public class LocalRunnerTest {

	@ClassRule
	public static TestRule testRule = new TestRule();
	
	public void start() {
		new LocalRunnerTest();
	}
}