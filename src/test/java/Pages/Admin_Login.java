package Pages;

import org.openqa.selenium.*;

public class Admin_Login {
WebDriver driver;

public Admin_Login(WebDriver Driver) {
	this.driver = Driver;
}

// 	Admin Login

By Login_Dropdown_Field_loc = By.xpath("//*[@id=\"btntype\"]/select");
By LoginID_Email_Field_loc = By.xpath("//*[@id=\"logform\"]/div[2]/input");
By Password_Field_loc = By.xpath("//*[@id=\"show_hide_password\"]/input");
By Show_Hiden_Password_loc = By.xpath("//*[@id=\"show_hide_password\"]/div/span");
By Login_Btn_loc = By.xpath("//*[@id=\"logform\"]/button");

//	Order
By Orders_Dropdn_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[2]/a");
By All_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[2]/div/a[1]");
By OD57_View_Order_Details_loc = By.xpath("//*[@id=\"orders\"]/tbody/tr[1]/td[10]/div/a[1]");

//	Order Details
By Payment_Status_Dropdown_loc = By.xpath("//*[@id=\"payment_status\"]");
By Change_Payment_Status_Text_Loc = By.xpath("//*[@id=\"changePaymentstatusModal\"]/div/div/div[1]/h5");
By Remark_Input_Field_loc = By.xpath("//*[@id=\"notes\"]");
By Change_Payment_Status_Alert_YesBtn_loc = By.xpath("//*[@id=\"changePaymentstatusModal\"]/div/div/div[3]/button[2]");
By Order_Status_DropdownBox_loc = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div/div[4]/select");
By Add_Tracking_URL_Field_loc = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div/div[6]/div/input");
By Order_Tracking_Alert_Box_loc = By.xpath("//*[@id=\"trackingOrderUrl\"]/div/div");
By Tracking_Url_Field_loc = By.id("tracking_url");
By Order_Tracking_Alert_YesBtn_loc = By.xpath("//*[@id=\"trackingOrderUrl\"]/div/div/div[4]/button[2]");

By Type_continue_Text_Field_loc = By.xpath("//*[@id=\"confirmnote\"]");
By Change_Order_Alert_YesBtn_loc = By.xpath("//*[@id=\"changeOrderStatus\"]/div/div/div[3]/button[2]");

//	Amount Calculation
By Santhigiri_Kashayam_Amount_loc = By.xpath("/html/body/div[6]/div[1]/div[2]/div/section[2]/table/tbody/tr[1]/td[6]");
By Acitrom_Amount_loc = By.xpath("/html/body/div[6]/div[1]/div[2]/div/section[2]/table/tbody/tr[2]/td[6]");
By Subtotal_loc = By.xpath("/html/body/div[6]/div[1]/div[2]/div/section[2]/div/div[2]/div/div/div/div[1]/div/div[2]");
By Delivery_Charge_loc = By.xpath("/html/body/div[6]/div[1]/div[2]/div/section[2]/div/div[2]/div/div/div/div[2]/div/div[2]");
By Grand_Total_loc = By.xpath("/html/body/div[6]/div[1]/div[2]/div/section[2]/div/div[2]/div/div/div/div[3]/div/div[2]");


//Admin Login

public WebElement Login_Dropdown_Field() {
	return driver.findElement(Login_Dropdown_Field_loc);
}
public WebElement LoginID_Email_Field() {
	return driver.findElement(LoginID_Email_Field_loc);
}
public WebElement Password_Field() {
	return driver.findElement(Password_Field_loc);
}
public WebElement Show_Hiden_Password() {
	return driver.findElement(Show_Hiden_Password_loc);
}
public WebElement Login_Btn() {
	return driver.findElement(Login_Btn_loc);
}

//Orders
public WebElement Orders_Dropdn() {
	return driver.findElement(Orders_Dropdn_loc);
}
public WebElement All() {
	return driver.findElement(All_loc);
}
public WebElement OD57_View_Order_Details() {
	return driver.findElement(OD57_View_Order_Details_loc);
}
public WebElement Payment_Status_Dropdown() {
	return driver.findElement(Payment_Status_Dropdown_loc);
}
public WebElement Change_Payment_Status_Text() {
	return driver.findElement(Change_Payment_Status_Text_Loc);
}
public WebElement Remark_Input_Field() {
	return driver.findElement(Remark_Input_Field_loc);
}
public WebElement Change_Payment_Status_Alert_YesBtn() {
	return driver.findElement(Change_Payment_Status_Alert_YesBtn_loc);
}
public WebElement Order_Status_DropdownBox() {
	return driver.findElement(Order_Status_DropdownBox_loc);
}
public WebElement Add_Tracking_URL_Field() {
	return driver.findElement(Add_Tracking_URL_Field_loc);
}
public WebElement Order_Tracking_Alert_Box() {
	return driver.findElement(Order_Tracking_Alert_Box_loc);
}
public WebElement Tracking_Url_Field() {
	return driver.findElement(Tracking_Url_Field_loc);
}
public WebElement Order_Tracking_Alert_YesBtn() {
	return driver.findElement(Order_Tracking_Alert_YesBtn_loc);
}

public WebElement Type_continue_Text_Field() {
	return driver.findElement(Type_continue_Text_Field_loc);
}
public WebElement Change_Order_Alert_YesBtn() {
	return driver.findElement(Change_Order_Alert_YesBtn_loc);
}

//	Amount Calculation
public WebElement Santhigiri_Kashayam_Amount() {
	return driver.findElement(Santhigiri_Kashayam_Amount_loc);
}
public WebElement Acitrom_Amount() {
	return driver.findElement(Acitrom_Amount_loc);
}
public WebElement Subtotal() {
	return driver.findElement(Subtotal_loc);
}
public WebElement Delivery_Charge() {
	return driver.findElement(Delivery_Charge_loc);
}
public WebElement Grand_Total() {
	return driver.findElement(Grand_Total_loc);
}






}
