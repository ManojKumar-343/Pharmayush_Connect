package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Admin_Login;
import Pages.Login_Page;
import Utils.Utility;

public class Wallet_Checking_test {
	WebDriver driver;
	WebDriver Driver;
	
	Admin_Login objAdminLogin;
	Login_Page objLoginPage;
	Utility objUtility;

	@BeforeTest
	public void beforetest() {
	
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--guest");
    driver = new ChromeDriver(options);
	driver.get("https://gspedia.com/projects/pharmdoctor");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		objLoginPage = new Login_Page(driver);
		objAdminLogin = new Admin_Login(driver);
		objUtility = new Utility(driver);
	}
	
	@Test(priority = 1)
	public void Verify_DocterLogin_Tab() throws InterruptedException {
		
			objLoginPage.Login_Tab().click();
			Thread.sleep(1000);
			Assert.assertEquals(driver.getCurrentUrl(),"https://gspedia.com/projects/pharmdoctor/doctor-login","Login page is not displayed");
			objLoginPage.LoginID_Email_Field().sendKeys("manoj@gmail.com");
			objLoginPage.Password_Field().sendKeys("manoj@123");
			objLoginPage.Show_Hiden_Password().click();
			objLoginPage.Login_Btn().click();
			Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void Verify_Wallet_Amount() {
		objLoginPage.Wallet_Tab().click();
		String Total_Wallet_Amount = objLoginPage.Total_Wallet_Amoun().getText();
		String numeric = Total_Wallet_Amount.replaceAll("[^0-9.]", "");
		System.out.println(numeric);
		String[] parts = numeric.split("\\.");
        String corrected = parts[0];
        if (parts.length > 1) {
            corrected += "." + String.join("", java.util.Arrays.copyOfRange(parts, 1, parts.length));
        }
//		double amount = Double.parseDouble(corrected);
		float Total_Wallet_amount = Float.parseFloat(corrected);
		System.out.println(Total_Wallet_amount);
		
//		ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
//        Driver = new ChromeDriver(options);
//        
//		Driver.get("https://gspedia.com/projects/pharmdoctor/auth");
//		Driver.manage().window().maximize();
//		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		objLoginPage = new Login_Page(Driver);
//		objAdminLogin = new Admin_Login(Driver);
//		objUtility = new Utility(Driver);
//		
//		objUtility.Select_Option(objAdminLogin.Login_Dropdown_Field(), "Admin Login");
//		objAdminLogin.LoginID_Email_Field().sendKeys("1001");
//		objAdminLogin.Show_Hiden_Password().click();
//		objAdminLogin.Password_Field().sendKeys("y8,C5Q");
//		objAdminLogin.Login_Btn().click();
//		Assert.assertEquals(driver.getCurrentUrl(),"https://gspedia.com/projects/pharmdoctor/dashboard","Admin Login failed");
		
		objLoginPage.Patient_Dropdn_Btn().click();
		objLoginPage.Prescriptions().click();
		objLoginPage.Convert_To_Order().click();
		objLoginPage.Convert_To_Order_Yes_Btn().click();
		
	}
	
	
	
	
	
	
	
	
	
}
