package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/pharmConnect/Feature_Folder/Login_Cucumner.feature",
//		"Feature_Folder\\Login_Cucumber.feature",
			glue = "Step_Definition"
		)
public class Login_Cucumber {

}
