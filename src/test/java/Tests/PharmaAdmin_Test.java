package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Admin_Login;
import Pages.Login_Page;
import Utils.Utility;
import java.time.Duration;
import java.util.concurrent.StructuredTaskScope.ShutdownOnSuccess;

public class PharmaAdmin_Test {
WebDriver driver;
Admin_Login objAdminLogin;
Login_Page objLoginPage;
Utility objUtility;

@BeforeTest
public void beforetest() {
	driver = new ChromeDriver();
	driver.get("https://gspedia.com/projects/pharmdoctor/auth");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	objLoginPage = new Login_Page(driver);
	objAdminLogin = new Admin_Login(driver);
	objUtility = new Utility(driver);
}

@Test(priority = 1)
public void Admin_Login() {

	objUtility.Select_Option(objAdminLogin.Login_Dropdown_Field(), "Admin Login");
	objAdminLogin.LoginID_Email_Field().sendKeys("1001");
	objAdminLogin.Show_Hiden_Password().click();
	objAdminLogin.Password_Field().sendKeys("y8,C5Q");
	objAdminLogin.Login_Btn().click();
	Assert.assertEquals(driver.getCurrentUrl(),"https://gspedia.com/projects/pharmdoctor/dashboard","Admin Login failed");
}

@Test(priority = 2)
public void Orders() {
//	objUtility.Select_Option(objAdminLogin.Orders_Dropdn(), "All");
	objAdminLogin.Orders_Dropdn().click();
	objAdminLogin.All().click();
	Assert.assertEquals(driver.getCurrentUrl(),"https://gspedia.com/projects/pharmdoctor/order/status/all","All Order list is not");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(objAdminLogin.OD57_View_Order_Details()));
	objAdminLogin.OD57_View_Order_Details().click();
	Assert.assertTrue(driver.getCurrentUrl().contains("57"),"All Order list is not ");
}

@Test(priority = 3)
public void Verify_Order_Details() {
	objUtility.Select_Option(objAdminLogin.Payment_Status_Dropdown(), "PAID");
//	Assert.assertEquals(objAdminLogin.Change_Payment_Status_Text().getText(), "Change Payment Status","Change Payment Status alert box is not displayed");
//	objAdminLogin.Remark_Input_Field().sendKeys("Yes");
//	objAdminLogin.Change_Payment_Status_Alert_YesBtn().click();
//	objUtility.Select_Option(objAdminLogin.Order_Status_DropdownBox(), "ACCEPTED");

	
//	objAdminLogin.Add_Tracking_URL_Field().click();
	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"trackingOrderUrl\"]/div/div")));
//	Assert.assertTrue(modal.isDisplayed(),"Order Tracking alert box is not displayed");
//	objAdminLogin.Tracking_Url_Field().sendKeys("https://tracking-link.com/123");
//	objAdminLogin.Order_Tracking_Alert_YesBtn().click();
	
//	objUtility.Select_Option(objAdminLogin.Order_Status_DropdownBox(), "SHIPPED");
//	WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"changeOrderStatus\"]/div/div")));
//	Assert.assertTrue(modal.isDisplayed(),"Change Order Status alert box is not displayed");
//	objAdminLogin.Type_continue_Text_Field().sendKeys("continue");
//	objAdminLogin.Change_Order_Alert_YesBtn().click();
	
	objUtility.Select_Option(objAdminLogin.Order_Status_DropdownBox(), "DELIVERED");
	WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement Modal = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"changeOrderStatus\"]/div/div")));
	Assert.assertTrue(Modal.isDisplayed(),"Order alert box is not displayed");
	objAdminLogin.Type_continue_Text_Field().sendKeys("continue");
	objAdminLogin.Change_Order_Alert_YesBtn().click();
	
}

@Test(priority = 4)
public void Grand_Total_Calculation() {

	String Santhigiri_Sukumaram_Kashayam_Amount = objAdminLogin.Santhigiri_Kashayam_Amount().getText();
	String Acitrom4Mg_Amount = objAdminLogin.Acitrom_Amount().getText();
	
	float N1 =Float.parseFloat(Santhigiri_Sukumaram_Kashayam_Amount);
	float N2 = Float.parseFloat(Acitrom4Mg_Amount);
	
	float Sub_Total = (N1+N2);
	
	String Ex_Subtotal = objAdminLogin.Subtotal().getText();
	float Exp_Sub_Total = Float.parseFloat(Ex_Subtotal);
	
	Assert.assertEquals(Exp_Sub_Total,Sub_Total,"Subtotal failed");
	
	String Delivery_Charge = objAdminLogin.Delivery_Charge().getText();
	float Delivery_charge = Float.parseFloat(Delivery_Charge);
	
	float Grand_Total = (Sub_Total+Delivery_charge);
	
	String Exp_Grandtotal = objAdminLogin.Grand_Total().getText();
	float Exp_Grand_Total = Float.parseFloat(Exp_Grandtotal);
	
	Assert.assertEquals(Exp_Grand_Total,Grand_Total,"Grand Total failed");
}











}
