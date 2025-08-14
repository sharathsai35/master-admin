package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features="./feature/AddPartner.feature",
@CucumberOptions(features="./feature/Notification.feature",

glue = { "stepdefinition", "hooks" },
publish = true,
//plugin= {"pretty","html:target/Masteradmin/Add&EditPartner.html"}
plugin= {"pretty","html:target/Masteradmin/Notification.html"}
)
public class MyRunner {

}
