package tests;

import org.junit.ClassRule;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import util.TestBase;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        tags = "",
        glue = {"steps"}
)
public class RunTest {

    @ClassRule
    public static TestBase testRule = new TestBase();

}
