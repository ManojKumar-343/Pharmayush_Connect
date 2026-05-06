package Tests;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Login_Page;
import Utils.Utility;

public class PharmaDoctor_Test {
	WebDriver driver;
	Login_Page objLoginPage;
	Utility objUtility;
	
	@BeforeTest
	public void beforetest() {
//		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
		driver.get("https://gspedia.com/projects/pharmdoctor");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		objLoginPage = new Login_Page(driver);
		objUtility = new Utility(driver);
	}
	
	@Test(priority = 1)
public void Verify_Login_Tab() throws InterruptedException {
		objLoginPage.Login_Tab().click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://gspedia.com/projects/pharmdoctor/doctor-login","Login page is not displayed");
		objLoginPage.LoginID_Email_Field().sendKeys("manoj@gmail.com");
		objLoginPage.Password_Field().sendKeys("manoj@123");
		objLoginPage.Show_Hiden_Password().click();
		objLoginPage.Login_Btn().click();
		Thread.sleep(2000);
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
////		
//		try {
//            // Wait for any potential alerts to appear (password change prompt)
////            Alert alert = 
//            		wait.until(ExpectedConditions.alertIsPresent());
//
//            Alert alert = driver.switchTo().alert();
//            // Capture alert text and decide what to do (e.g., accept or dismiss)
//            String alertText = alert.getText();
//            System.out.println("Google Alert Text: " + alertText);
//
//            // If it's a "Change your password" alert, you can dismiss it
//            alert.accept();  // Or you can accept it depending on the scenario
//
//        } catch (Exception e) {
//            System.out.println("No alert appeared");
//     	}
		
		Actions actions = new Actions(driver);
		actions.moveByOffset(100, 100).click().perform();
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://gspedia.com/projects/pharmdoctor/dashboard","Dashboard is not displayed");
	}
	@Test(priority = 2)
	public void Orders_Tab() {
		Select oselect = new Select(objLoginPage.Orders_Dropdn());
		List <WebElement> option = oselect.getOptions();
		option.size();
		for(int i=0;i<option.size();i++) {
			String Text=option.get(i).getText();
			System.out.println(Text);
		}
//		objLoginPage.Orders_Dropdn().click();
//		objLoginPage.All().click();
//		Assert.assertEquals(driver.getCurrentUrl(), "https://gspedia.com/projects/pharmdoctor/order/status/all","All page verification Failed");
//		
//		objLoginPage.Ordered().click();
//		Assert.assertEquals(driver.getCurrentUrl(), "https://gspedia.com/projects/pharmdoctor/order/status/ordered","Ordered page verification Failed");
//		
//		objLoginPage.Accepted().click();
//		Assert.assertEquals(driver.getCurrentUrl(), "https://gspedia.com/projects/pharmdoctor/order/status/accepted","Accepted page verification Failed");
//
//		objLoginPage.Shipped().click();
//		Assert.assertEquals(driver.getCurrentUrl(), "https://gspedia.com/projects/pharmdoctor/order/status/shipped","Shipped page verification Failed");
//
//		objLoginPage.Delivered().click();
//		Assert.assertEquals(driver.getCurrentUrl(), "https://gspedia.com/projects/pharmdoctor/order/status/delivered","Delivered page verification Failed");
//
//		objLoginPage.Cancelled().click();
//		Assert.assertEquals(driver.getCurrentUrl(), "https://gspedia.com/projects/pharmdoctor/order/status/cancelled","Cancelled page verification Failed");
	}
	@Test(priority = 3)
	public void Quotes_Tab() {
		objLoginPage.Quotes().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://gspedia.com/projects/pharmdoctor/doctor/quote","Quotes page verification Failed");
	}
	@Test(priority = 4)
	public void Patient_Tab() {
//		objLoginPage.Patient_Dropdn_Btn().click();
//		objLoginPage.Patient_List().click();
		Select oselect = new Select(objLoginPage.Patient_Dropdn_Btn());
//		oselect.selectByVisibleText("Patients List");
		List <WebElement> option = oselect.getOptions();
		option.size();
		for(int i=0;i<option.size();i++) {
			String Text=option.get(i).getText();
			System.out.println(Text);
		}
//		oselect.getFirstSelectedOption().click();
//		Assert.assertEquals(driver.getCurrentUrl(),"https://gspedia.com/projects/pharmdoctor/patient","Patient page is not displayed");
	}

	@Test(priority = 5)
	public void Wallet_Tab() {
		objLoginPage.Wallet().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://gspedia.com/projects/pharmdoctor/doctor/wallet","Wallet page is not displayed");
	}
	
	@Test(priority = 6)
	public void  Subscriptions() {
		objLoginPage.Subscriptions().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://gspedia.com/projects/pharmdoctor/Subscription","Subscriptions page is not displayed");
	}
	@Test(priority = 7)
	public void  Appointments() {
		objLoginPage.Appointments().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://gspedia.com/projects/pharmdoctor/Appointment","Appointments page is not displayed");
	}
	@Test(priority = 8)
	public void Create_New_Patients() throws Exception {
		objLoginPage.Patient_Dropdn_Btn().click();
		objLoginPage.Patient_List().click();
		objLoginPage.New_Patient_Btn().click();
		objLoginPage.Full_Name_Field().sendKeys("Amal");
		objUtility.Select_Option(objLoginPage.Gender_Select_Field(),"Male");
		
      objLoginPage.DOB_Field().sendKeys("12-03-1992");
      String enteredDate = objLoginPage.DOB_Field().getAttribute("value");
      System.out.println(enteredDate);

      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      String maxDate = sdf.format(new Date());
      System.out.println("Formatted Current Date: " + maxDate);
      
//      Assert.assertTrue(enteredDate.compareToIgnoreCase(maxDate)<= 0, "Selected date exceeds the maximum allowed date!");
      Assert.assertTrue(enteredDate.compareTo(maxDate) <= 0, "Selected date exceeds the maximum allowed date!");
     
      Date dob = sdf.parse(enteredDate);
      Date CrntDate = sdf.parse(maxDate);
      
      int age = objUtility.calculateAge(dob, CrntDate);
      System.out.println("Calculated Age: " + age);
      
      String DisplayedAge = objLoginPage.Age_Field().getAttribute("value");
      Assert.assertEquals(DisplayedAge,String.valueOf(age) ,"Invalied age");
      
		objUtility.Select_Option(objLoginPage.Blood_Grp_Field(),"O+ve");
		objLoginPage.Contact_no1_Field().sendKeys("9435585162");
		objLoginPage.Contact_no2_Field().sendKeys("9435585161");
		objLoginPage.Email_Field().sendKeys("amal@gmail.com");
		objLoginPage.Local_guardian_name_Field().sendKeys("Amal Father");
		objLoginPage.Local_guardian_ContactNo_Field().sendKeys("9468864551");
		objUtility.Select_Option(objLoginPage.Patient_status_Field(),"Active");
//		objLoginPage.Save_Btn().click();
//		Assert.assertTrue(objLoginPage.Create_Patient_Sucess_Msg().isDisplayed(),"Patient details not created");
	}
	@Test(priority = 9)
	public void Verify_Edit_Details() throws ParseException {
		objLoginPage.Patient_Dropdn_Btn().click();
		objLoginPage.Patient_List().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://gspedia.com/projects/pharmdoctor/patient","Patient page is not displayed");
		objLoginPage.Roshini_Edit_Btn().click();
		Assert.assertTrue(objLoginPage.Update_Patient_details_Text().isDisplayed(),"Update Patient details page is not opened");
		
		objLoginPage.Full_Name_Field().clear();
		objLoginPage.Full_Name_Field().sendKeys("Roshini");
		
		objLoginPage.Gender_Select_Field().clear();
		objLoginPage.Gender_Select_Field().sendKeys("Female");
		
//		objUtility.Select_Option(objLoginPage.Gender_Select_Field(),"Female");
		
//      objLoginPage.DOB_Field().clear();
      objLoginPage.DOB_Field().sendKeys("22-05-1992");
      String enteredDate = objLoginPage.DOB_Field().getAttribute("value");
      System.out.println(enteredDate);

      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      String maxDate = sdf.format(new Date());
      System.out.println("Formatted Current Date: " + maxDate);
      
//      Assert.assertTrue(enteredDate.compareToIgnoreCase(maxDate)<= 0, "Selected date exceeds the maximum allowed date!");
      Assert.assertTrue(enteredDate.compareTo(maxDate) <= 0, "Selected date exceeds the maximum allowed date!");
     
      Date dob = sdf.parse(enteredDate);
      Date CrntDate = sdf.parse(maxDate);
      
      int age = objUtility.calculateAge(dob, CrntDate);
      System.out.println("Calculated Age: " + age);
      
//      String DisplayedAge = objLoginPage.Age_Field().getAttribute("value");
//      Assert.assertEquals(DisplayedAge,String.valueOf(age),"Invalied age");
      	
//        objLoginPage.Blood_Grp_Field().clear();
		objUtility.Select_Option(objLoginPage.Blood_Grp_Field(),"B+ve");
		objLoginPage.Contact_no1_Field().clear();
		objLoginPage.Contact_no1_Field().sendKeys("8443624937");
		
		objLoginPage.Contact_no2_Field().clear();
		objLoginPage.Contact_no2_Field().sendKeys("8346249351");
		
		objLoginPage.Email_Field().clear();
		objLoginPage.Email_Field().sendKeys("Roshini@gmail.com");
		
		objLoginPage.Local_guardian_name_Field().clear();
		objLoginPage.Local_guardian_name_Field().sendKeys("Roshini Father");
		
		objLoginPage.Local_guardian_ContactNo_Field().clear();
		objLoginPage.Local_guardian_ContactNo_Field().sendKeys("8114463495");
		
//		objLoginPage.Patient_status_Field().clear();
		objUtility.Select_Option(objLoginPage.Patient_status_Field(),"Active");
		
		objLoginPage.E_Save_Button().click();
		
		Assert.assertTrue(objLoginPage.Update_Patient_details_Sucess().isDisplayed(),"Update patient details are not sucessfull");
			
	}

	@Test(priority = 10)
	public void Add_Patient_Address() {
		
		objLoginPage.Patient_Dropdn_Btn().click();
		objLoginPage.Patient_List().click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(objLoginPage.Amal_Add_Address_Icon()));
		
		objLoginPage.Amal_Add_Address_Icon().click();
		objLoginPage.Permanent_Address().sendKeys("Kollam");
		objLoginPage.Communication_Address().sendKeys("Thiruvananthapuram");
		objLoginPage.City_Field().sendKeys("Thampanoor");
		objLoginPage.State_Field().sendKeys("Kerala");
		objLoginPage.Country_Field().sendKeys("India");
		objLoginPage.Zipcode_Field().sendKeys("695001");
		objLoginPage.Location_Field().sendKeys("SS Street");
		objLoginPage.Primary_Address_RadioBtn().click();
//		objLoginPage.A_Save_Btn().click();
		
	}
	@Test(priority = 11)
	public void Add_Prescription_With_Nxt_Rvu_Date() throws InterruptedException {
		objLoginPage.Patient_Dropdn_Btn().click();
		objLoginPage.Patient_List().click();
		objLoginPage.Amal_Add_Prescription_Icon().click();
		objLoginPage.Diagnosis_Field().sendKeys("Diagnostic Tests:\r\n"
				+ "Blood Tests: To check kidney function and cholesterol levels (to rule out any underlying conditions or secondary hypertension)\r\n"
				+ "Electrocardiogram (ECG): To assess heart function, check for arrhythmias, or signs of damage due to high blood pressure.\r\n"
				+ "Echocardiogram: To examine heart structure and ensure no damage to the heart from prolonged hypertension.\r\n"
				+ "Diagnosis:\r\n"
				+ "Primary Hypertension (Essential Hypertension): Based on the elevated blood pressure readings (above 140/90 mmHg), absence of secondary causes (like kidney disease), and family history.");
		Thread.sleep(2000);
		objUtility.Scrole_to_Element(objLoginPage.Medicines_Brand_Name1());
		Thread.sleep(2000);
		objLoginPage.Medicines_Brand_Name1().sendKeys("SANTHIGIRI");
//		objUtility.Select_Option(objLoginPage.Medicines_Brand_Name1(),"SANTHIGIRI");
//		objUtility.Select_Option(objLoginPage.Drug_Name1(),"Santhigiri Sukumaram Kashayam");
		objLoginPage.Drug_Name1().sendKeys("Santhigiri Sukumaram Kashayam");
		objUtility.Select_Option(objLoginPage.Measure_Type1(),"ML");
		objLoginPage.Unit_Field1().sendKeys("100");
		objLoginPage.Dosage_Day_Field1().sendKeys("10");
		objLoginPage.Notes_Field1().sendKeys("Morning - 5ML\r\n"
				+ "Night - 5ML\r\n"
				+ "(After food)");
//		objLoginPage.Eraser_Icon().click();
		objLoginPage.Add_Medicine_Btn().click();
		objLoginPage.Measure_Type2().sendKeys("SANTHIGIRI");
		objLoginPage.Drug_Name2().sendKeys("Santhigiri Rasnadi Choornam");
		objUtility.Select_Option(objLoginPage.Measure_Type2(),"Number");
		objLoginPage.Unit_Field2().sendKeys("20");
		objLoginPage.Dosage_Day_Field2().sendKeys("10");
		objLoginPage.Notes_Field2().sendKeys("Morning - 1No.\r\n"
				+ "Night - 1No.\r\n"
				+ "(After food)");
		objLoginPage.Dlt_Medicine_Icon().click();
		
		objLoginPage.Other_medicines_Ckbox().click();
		objLoginPage.OM_Brand_Name_Field1().sendKeys("Acitrom");
		objLoginPage.OM_Drug_Name_Field1().sendKeys("Acitrom - 4Mg");
		objUtility.Select_Option(objLoginPage.OM_Measure_Type1(),"Number");
//		objLoginPage.OM_Measure_Type1().sendKeys("Number");
		objLoginPage.OM_Unit_Field1().sendKeys("10");
		objLoginPage.OM_Dosage_Day_Field1().sendKeys("10");
		objLoginPage.OM_Notes_Field1().sendKeys("Night - 1NO.\r\n"
				+ "(Before food)");
		objLoginPage.OM_Add_OMedicine_Btn().click();
		
		objLoginPage.OM_Brand_Name_Field2().sendKeys("ZyrCold");
		objLoginPage.OM_Drug_Name_Field2().sendKeys("ZyrCold Syrup");
		objUtility.Select_Option(objLoginPage.OM_Measure_Type2(),"ML");
//		objLoginPage.OM_Measure_Type2().sendKeys("Number");
		objLoginPage.OM_Unit_Field2().sendKeys("100");
		objLoginPage.OM_Dosage_Day_Field2().sendKeys("10");
		objLoginPage.OM_Notes_Field2().sendKeys("Morning - 5ML\r\n"
				+ "Night - 5ML\r\n"
				+ "(After food)");
		objLoginPage.OM_Dlt_OMedicine_Btn().click();
		
		objLoginPage.Other_instructions_Field().sendKeys("pressure test and sugar test report is compulsory in next review");
		objLoginPage.Commission_Visible_Icon().click();
		objLoginPage.Next_Review_Date().click();
		objLoginPage.Next_Review_Date().click();
		objLoginPage.Date_31().click();
//		objLoginPage.Prescription_Save_Btn().click();
		}
	
	@Test(priority = 12)
	public void View_Priscribed_Medicines() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(objLoginPage.View_Priscribed_Medicine_Icon()));
		objLoginPage.View_Priscribed_Medicine_Icon().click();
		Assert.assertTrue(objLoginPage.Medicine_Detiles().isDisplayed(),"Medicine details are not displayed");
	}
	
	@Test(priority = 13)
	public void View_Priscription_pdf() throws InterruptedException {
		objLoginPage.View_Priscription_pdf_Icon().click();
		objUtility.Switchto_new_window();
		Thread.sleep(2000);
		Assert.assertTrue(objLoginPage.View_Priscription_Text().isDisplayed(),"Priscription pdf is not displayed");

		driver.switchTo().frame(objLoginPage.Pdf_iframe());
		Thread.sleep(2000);
		
//		objLoginPage.Menu_Icon().click();
//		objLoginPage.Pdf_Download_Icon().click();
		driver.close();
		objUtility.SwitchTo_main_window();
	}
	
//	@Test(priority = 13)
//	public void Convert_To_Order() throws InterruptedException {
//		objLoginPage.PR47_Convert_To_Order_Icon().click();
//        Assert.assertTrue(objLoginPage.Convert_to_Order_Alert().isDisplayed(),"Alert title is not correct");
//        objLoginPage.Convert_to_Order_Alert_YESbtn().click();
//	}
	
//	@Test(priority = 13)
//	public void Open_Admin_Page() {
//		driver.get("https://gspedia.com/projects/pharmdoctor/auth");
//	}
	
	
	
}