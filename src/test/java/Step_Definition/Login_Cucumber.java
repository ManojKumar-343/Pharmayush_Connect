package Step_Definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.Login_Page;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Cucumber {
	WebDriver driver;
	Login_Page objLoginPage;
 
@Given("user is in main page")
public void user_is_in_main_page() {
    // Write code here that turns the phrase above into concrete actions
	driver = new ChromeDriver();
	
	driver.get("https://gspedia.com/projects/pharmdoctor");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	objLoginPage = new Login_Page(driver);
}

@Given("User is in login page")
public void user_is_in_login_page() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	objLoginPage.Login_Tab().click();
	Thread.sleep(1000);
	Assert.assertEquals(driver.getCurrentUrl(),"https://gspedia.com/projects/pharmdoctor/doctor-login","Login page is not displayed");
	
}

@When("User enters {string} and {string}")
public void user_enters_and(String Username, String Password) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	objLoginPage.LoginID_Email_Field().sendKeys(Username);
	objLoginPage.Show_Hiden_Password().click();
	objLoginPage.Password_Field().sendKeys(Password);
	objLoginPage.Login_Btn().click();
	Thread.sleep(1000);
	
}

@When("User is in related page")
public void user_is_in_related_page() {
    String currentUr = driver.getCurrentUrl();
    
    if (currentUr.contains("dashboard")) {
        Assert.assertTrue(true, "Login successful, user is on related page.");
    } else {
        Assert.fail("Login failed, user is not on the related page.");
    }
}
@Then("Deiver is closed")
public void driver_is_closed() {
//	    if (driver != null) {
	        driver.quit();  // Close the browser after each scenario
//	    }
//	        throw new io.cucumber.java.PendingException();
	}

}

