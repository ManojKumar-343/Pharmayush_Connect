package Pages;
import org.openqa.selenium.*;
public class Login_Page {
	WebDriver driver;
	
	public Login_Page(WebDriver Driver) {
		this.driver = Driver;
	}
//	Login
	By Login_Tab_loc = By.xpath("/html/body/header/div[2]/nav/div/div/div/ul/li[8]/a");
	By LoginID_Email_Field_loc = By.xpath("//*[@id=\"logform\"]/div[2]/input");
	By Password_Field_loc = By.xpath("//*[@id=\"show_hide_password\"]/input");
	By Show_Hiden_Password_loc = By.xpath("//*[@id=\"show_hide_password\"]/div/span");
	By Login_Btn_loc = By.xpath("//*[@id=\"logform\"]/button");
	
//	Orders
	By Orders_Dropdn_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[2]/a");
	By All_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[2]/div/a[1]");
	By Ordered_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[2]/div/a[2]");
	By Accepted_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[2]/div/a[3]");
	By Shipped_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[2]/div/a[4]");
	By Delivered_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[2]/div/a[5]");
	By Cancelled_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[2]/div/a[6]");
	
	By Quotes_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[3]/a");
	
	
//	Patients
	By Patient_Dropdn_Btn_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[4]/a");
	By Patient_List_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[4]/div/a[1]");
	
	By Wallet_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[5]/a");
	By Subscriptions_Tab_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[6]/a");
	By Appointments_Tab_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[7]/a");
	
//	Patients List
	By New_Patient_Btn_loc = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/a[2]");
	By Full_Name_Field_loc = By.xpath("//*[@id=\"full_name\"]");
	By Gender_Select_Field_loc = By.name("gender");
	By DOB_Field_loc = By.xpath("//*[@id=\"date_of_birth\"]");
	By Age_Field_loc = By.xpath("//*[@id=\"age\"]");
	By Blood_Grp_Select_Field_loc = By.name("blood_group");
	By Contact_no1_Field_loc = By.xpath("//*[@id=\"contact1\"]");
	By Contact_no2_Field_loc = By.xpath("//*[@id=\"contact2\"]");
	By Email_Field_loc = By.xpath("//*[@id=\"email\"]");
	By Invalied_Email_Msg_loc = By.xpath("/html/body/div[6]/div[1]/form/div[3]/div/section/div/div/div[3]/div[2]/label/span[2]");
	By Local_guardian_name_Field_loc = By.xpath("//*[@id=\"gardian_name\"]");
	By Local_guardian_ContactNo_Field_loc = By.xpath("//*[@id=\"gardian_no\"]");
	By Patient_status_Select_Field_loc = By.name("patient_status");
	By Save_Btn_loc = By.xpath("/html/body/div[6]/div[1]/form/div[2]/div[2]/button");
	By Create_Patient_Sucess_Msg_loc = By.xpath("/html/body/div[6]/div[1]/form/div[2]/div[2]/comment()");
	
//	Edit Patient Details
	By Roshini_Edit_Btn_loc = By.xpath("//*[@id=\"userTable\"]/tbody/tr[2]/td[9]/a[2]");
	By Update_Patient_details_Text_loc = By.xpath("/html/body/div[6]/div[1]/form/div[1]/div[1]/div/h4");
	By E_Save_Button_loc = By.xpath("/html/body/div[6]/div[1]/form/div[1]/div[2]/button");
	By Update_Patient_details_Sucess_loc = By.xpath("/html/body/div[6]/div[1]/form/div[2]/div/div");
	
//	Add Patient Address
	By Amal_Add_Address_Icon_loc = By.xpath("//*[@id=\"userTable\"]/tbody/tr[1]/td[9]/a[3]");
	By Permanent_Address_loc = By.xpath("//*[@id=\"address_1\"]");
	By Communication_Address_loc = By.xpath("//*[@id=\"address_2\"]");
	By City_Field_loc = By.xpath("//*[@id=\"city\"]");
	By State_Field_loc = By.xpath("//*[@id=\"state\"]");
	By Country_Field_loc = By.xpath("//*[@id=\"countryCode\"]");
	By Zipcode_Field_loc = By.xpath("//*[@id=\"zip_code\"]");
	By Location_Field_loc = By.xpath("//*[@id=\"location\"]");
	By Primary_Address_RadioBtn_loc = By.xpath("//*[@id=\"primary_address\"]");
	By A_Save_Btn_loc = By.xpath("//*[@id=\"savebtn\"]");
	
//	Add Prescription
	By Amal_Add_Prescription_Icon_loc = By.xpath("//*[@id=\"userTable\"]/tbody/tr[1]/td[9]/a[4]");
	By Diagnosis_Field_loc = By.xpath("//*[@id=\"diaganosis\"]");
	By Medicines_Brand_Name1_loc = By.id("brand1");
	By Drug_Name1_loc = By.name("drug_1");
	By Measure_Type1_loc = By.name("measurement1");
	By Unit_Field1_loc = By.xpath("//*[@id=\"unit_1\"]");
	By Dosage_Day_Field1_loc = By.xpath("//*[@id=\"dosage_1\"]");
	By Notes_Field1_loc = By.xpath("//*[@id=\"prescribednote1\"]");
	By Eraser_Icon_loc = By.xpath("//*[@id=\"newrowcontent1\"]/td[7]/button/span");
	
	By Add_Medicine_Btn_loc = By.xpath("//*[@id=\"divup\"]/button");
	By Medicines_Brand_Name2_loc = By.id("brand2");
	By Drug_Name2_loc = By.name("drug_2");
	By Measure_Type2_loc = By.name("measurement2");
	By Unit_Field2_loc = By.xpath("//*[@id=\"newrowcontent2\"]/td[5]/input");
	By Dosage_Day_Field2_loc = By.xpath("//*[@id=\"newrowcontent2\"]/td[6]/input");
	By Notes_Field2_loc = By.xpath("//*[@id=\"prescribednote2\"]"); 
	By Dlt_Medicine_Icon_loc = By.xpath("//*[@id=\"newrowcontent2\"]/td[7]/button/span");
	By Other_medicines_Ckbox_loc = By.xpath("//*[@id=\"new_medicine\"]");
	
	By OM_Brand_Name_Field1_loc = By.xpath("//*[@id=\"brand_name1\"]");
	By OM_Drug_Name_Field1_loc = By.xpath("//*[@id=\"drug_name1\"]");
	By OM_Measure_Type1_loc = By.name("other_medicine[1][measure_name]");
	By OM_Unit_Field1_loc = By.xpath("//*[@id=\"unit1\"]");
	By OM_Dosage_Day_Field1_loc = By.xpath("//*[@id=\"dosage1\"]");
	By OM_Notes_Field1_loc = By.xpath("//*[@id=\"prescribed_other_note\"]");
	By OM_Add_OMedicine_Btn_loc = By.xpath("//*[@id=\"divups\"]/button");
	
	By OM_Brand_Name_Field2_loc = By.xpath("//*[@id=\"tblpen1\"]/tbody/tr[2]/td[2]/div/input");
	By OM_Drug_Name_Field2_loc = By.xpath("//*[@id=\"tblpen1\"]/tbody/tr[2]/td[3]/div/input");
	By OM_Measure_Type2_loc = By.name("other_medicine[1][measure_name]");
	By OM_Unit_Field2_loc = By.xpath("//*[@id=\"tblpen1\"]/tbody/tr[2]/td[5]/input");
	By OM_Dosage_Day_Field2_loc = By.xpath("//*[@id=\"tblpen1\"]/tbody/tr[2]/td[6]/input");
	By OM_Notes_Field2_loc = By.xpath("//*[@id=\"prescribednote1\"]");
	By OM_Dlt_OMedicine_Btn_loc = By.xpath("//*[@id=\"tblpen1\"]/tbody/tr[2]/td[7]/button");
	
	By Other_instructions_Field_loc = By.xpath("//*[@id=\"newprescription\"]/section/div[2]/form/div/div[4]/div[1]/textarea");
	By Commission_Visible_Icon_loc = By.xpath("//*[@id=\"calc-desktop\"]/div[1]/button");
	By Next_Review_Date_Field_loc = By.xpath("//*[@id=\"next_review_date\"]");
	By Date_31_loc = By.xpath("/html/body/div[7]/div[2]/div/div[2]/div/span[37]");
	By Prescription_Save_Btn_loc = By.xpath("//*[@id=\"newprescription\"]/section/div[2]/form/div/div[8]/button");

//	Previous Prescriptions
	By View_Priscribed_Medicine_Icon_loc = By.xpath("//*[@id=\"prescriptionData1\"]/td[6]/div/button");
	By Medicine_Detiles_loc = By.xpath("//*[@id=\"medicine_details2\"]/div");
	
	By View_Priscription_pdf_Icon_loc = By.xpath("//*[@id=\"prescriptionData19\"]/td[6]/div/a[1]");
	By View_Priscription_Text_loc = By.xpath("//*[@id=\"heading\"]/h2");
	
	By Pdf_iframe_loc = By.xpath("/html/body/iframe");
	By Menu_Icon_loc = By.cssSelector("#sidenavToggle");
	
	By Zoom_In_Btn_loc = By.xpath("//*[@id=\"icon\"]/cr-icon");
	By Pdf_Download_Icon_loc = By.id("download");
	
//	Convert To Order
	By PR47_Convert_To_Order_Icon_loc = By.xpath("//*[@id=\"prescriptionData19\"]/td[6]/div/a[2]");
	By Convert_to_Order_Alert_loc = By.xpath("//*[@id=\"convertToOrder\"]/div/div");
	By Convert_to_Order_Alert_YESbtn_loc = By.xpath("//*[@id=\"convertToOrder\"]/div/div/div[3]/button[2]");
	
//	Wallet
	By Wallet_Tab_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[5]/a");
	By Total_Wallet_Amount_loc = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div/div/div[1]/div[2]/h3"); 
	By Prescriptions_loc = By.xpath("//*[@id=\"navbarCollapseAlt\"]/ul/li[4]/div/a[2]");
	
//	Prescriptions
	By Convert_To_Order_loc = By.xpath("//*[@id=\"confirmButton\"]");
	By Convert_To_Order_Yes_Btn_loc = By.xpath("/html/body/div[7]/div[6]/div/div/div[3]/button[2]");
	
	
	
	
	
//	Login
	public WebElement Login_Tab() {
		return driver.findElement(Login_Tab_loc);
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
	
//	Orders
	public WebElement Orders_Dropdn() {
		return driver.findElement(Orders_Dropdn_loc);
	}
	public WebElement All() {
		return driver.findElement(All_loc);
	}
	public WebElement Ordered() {
		return driver.findElement(Ordered_loc);
	}
	public WebElement Accepted() {
		return driver.findElement(Accepted_loc);
	}
	public WebElement Shipped() {
		return driver.findElement(Shipped_loc);
	}
	public WebElement Delivered() {
		return driver.findElement(Delivered_loc);
	}
	public WebElement Cancelled() {
		return driver.findElement(Cancelled_loc);
	}
	
	
	public WebElement Quotes() {
		return driver.findElement(Quotes_loc);
	}
	
//	Patient
	public WebElement Patient_Dropdn_Btn() {
		return driver.findElement(Patient_Dropdn_Btn_loc);
	}
	public WebElement Patient_List() {
		return driver.findElement(Patient_List_loc);
	}

	public WebElement Wallet() {
		return driver.findElement(Wallet_loc);
	}
	public WebElement Subscriptions() {
		return driver.findElement(Subscriptions_Tab_loc);
	}
	public WebElement Appointments() {
		return driver.findElement(Appointments_Tab_loc);
	}
	
//	Patients List
	public WebElement New_Patient_Btn() {
		return driver.findElement(New_Patient_Btn_loc);
	}
	public WebElement Full_Name_Field() {
		return driver.findElement(Full_Name_Field_loc);
	}
	public WebElement Gender_Select_Field() {
		return driver.findElement(Gender_Select_Field_loc);
	}
	public WebElement DOB_Field() {
		return driver.findElement(DOB_Field_loc);
	}
	public WebElement Age_Field() {
		return driver.findElement(Age_Field_loc);
	}
	public WebElement Blood_Grp_Field() {
		return driver.findElement(Blood_Grp_Select_Field_loc);
	}
	public WebElement Contact_no1_Field() {
		return driver.findElement(Contact_no1_Field_loc);
	}
	public WebElement Contact_no2_Field() {
		return driver.findElement(Contact_no2_Field_loc);
	}
	public WebElement Email_Field() {
		return driver.findElement(Email_Field_loc);
	}
	public WebElement Invalied_Email_Msg() {
		return driver.findElement(Invalied_Email_Msg_loc);
	}
	public WebElement Local_guardian_name_Field() {
		return driver.findElement(Local_guardian_name_Field_loc);
	}
	public WebElement Local_guardian_ContactNo_Field() {
		return driver.findElement(Local_guardian_ContactNo_Field_loc);
	}
	public WebElement Patient_status_Field() {
		return driver.findElement(Patient_status_Select_Field_loc);
	}
	public WebElement Save_Btn() {
		return driver.findElement(Save_Btn_loc);
	}
	public WebElement Create_Patient_Sucess_Msg() {
		return driver.findElement(Create_Patient_Sucess_Msg_loc);
	}
	
//	Edit Patient Details
	public WebElement Roshini_Edit_Btn() {
		return driver.findElement(Roshini_Edit_Btn_loc);
	}
	public WebElement Update_Patient_details_Text() {
		return driver.findElement(Update_Patient_details_Text_loc);
	}
	public WebElement Update_Patient_details_Sucess() {
		return driver.findElement(Update_Patient_details_Sucess_loc);
	}
	public WebElement E_Save_Button() {
		return driver .findElement(E_Save_Button_loc);
	}
	
//	Add_Patient_Address
	
	public WebElement Amal_Add_Address_Icon() {
		return driver .findElement(Amal_Add_Address_Icon_loc);
	}
	public WebElement Permanent_Address() {
		return driver .findElement(Permanent_Address_loc);
	}
	public WebElement Communication_Address() {
		return driver .findElement(Communication_Address_loc);
	}
	public WebElement City_Field() {
		return driver .findElement(City_Field_loc);
	}
	public WebElement State_Field() {
		return driver .findElement(State_Field_loc);
	}
	public WebElement Country_Field() {
		return driver .findElement(Country_Field_loc);
	}
	public WebElement Zipcode_Field() {
		return driver .findElement(Zipcode_Field_loc);
	}
	public WebElement Location_Field() {
		return driver .findElement(Location_Field_loc);
	}
	public WebElement Primary_Address_RadioBtn() {
		return driver .findElement(Primary_Address_RadioBtn_loc);
	}
	public WebElement A_Save_Btn() {
		return driver .findElement(A_Save_Btn_loc);
	}
	
//	Add Prescription
	public WebElement Amal_Add_Prescription_Icon() {
		return driver .findElement(Amal_Add_Prescription_Icon_loc);
	}
	public WebElement Diagnosis_Field() {
		return driver .findElement(Diagnosis_Field_loc);
	}
	public WebElement Medicines_Brand_Name1() {
		return driver .findElement(Medicines_Brand_Name1_loc);
	}
	public WebElement Drug_Name1() {
		return driver .findElement(Drug_Name1_loc);
	}
	public WebElement Measure_Type1() {
		return driver .findElement(Measure_Type1_loc);
	}
	public WebElement Unit_Field1() {
		return driver .findElement(Unit_Field1_loc);
	}
	public WebElement Dosage_Day_Field1() {
		return driver .findElement(Dosage_Day_Field1_loc);
	}
	public WebElement Notes_Field1() {
		return driver .findElement(Notes_Field1_loc);
	}
	public WebElement Eraser_Icon() {
		return driver .findElement(Eraser_Icon_loc);
	}
	
	
	public WebElement Add_Medicine_Btn() {
		return driver .findElement(Add_Medicine_Btn_loc);
	}
	public WebElement Medicines_Brand_Name2() {
		return driver .findElement(Medicines_Brand_Name2_loc);
	}
	public WebElement Drug_Name2() {
		return driver .findElement(Drug_Name2_loc);
	}
	public WebElement Measure_Type2() {
		return driver .findElement(Measure_Type2_loc);
	}
	public WebElement Unit_Field2() {
		return driver .findElement(Unit_Field2_loc);
	}
	public WebElement Dosage_Day_Field2() {
		return driver .findElement(Dosage_Day_Field2_loc);
	}
	public WebElement Notes_Field2() {
		return driver .findElement(Notes_Field2_loc);
	}
	public WebElement Dlt_Medicine_Icon() {
		return driver .findElement(Dlt_Medicine_Icon_loc);
	}
	public WebElement Other_medicines_Ckbox() {
		return driver .findElement(Other_medicines_Ckbox_loc);
	}
	
	
	public WebElement OM_Brand_Name_Field1() {
		return driver .findElement(OM_Brand_Name_Field1_loc);
	}
	public WebElement OM_Drug_Name_Field1() {
		return driver .findElement(OM_Drug_Name_Field1_loc);
	}
	public WebElement OM_Measure_Type1() {
		return driver .findElement(OM_Measure_Type1_loc);
	}
	public WebElement OM_Unit_Field1() {
		return driver .findElement(OM_Unit_Field1_loc);
	}
	public WebElement OM_Dosage_Day_Field1() {
		return driver .findElement(OM_Dosage_Day_Field1_loc);
	}
	public WebElement OM_Notes_Field1() {
		return driver .findElement(OM_Notes_Field1_loc);
	}
	public WebElement OM_Add_OMedicine_Btn() {
		return driver .findElement(OM_Add_OMedicine_Btn_loc);
	}
	
	
	public WebElement OM_Brand_Name_Field2() {
		return driver .findElement(OM_Brand_Name_Field2_loc);
	}
	public WebElement OM_Drug_Name_Field2() {
		return driver .findElement(OM_Drug_Name_Field2_loc);
	}
	public WebElement OM_Measure_Type2() {
		return driver .findElement(OM_Measure_Type2_loc);
	}
	public WebElement OM_Unit_Field2() {
		return driver .findElement(OM_Unit_Field2_loc);
	}
	public WebElement OM_Dosage_Day_Field2() {
		return driver .findElement(OM_Dosage_Day_Field2_loc);
	}
	public WebElement OM_Notes_Field2() {
		return driver .findElement(OM_Notes_Field2_loc);
	}
	public WebElement OM_Dlt_OMedicine_Btn() {
		return driver .findElement(OM_Dlt_OMedicine_Btn_loc);
	}
	
	public WebElement Other_instructions_Field() {
		return driver .findElement(Other_instructions_Field_loc);
	}
	public WebElement Commission_Visible_Icon() {
		return driver .findElement(Commission_Visible_Icon_loc);
	}
	public WebElement Next_Review_Date() {
		return driver .findElement(Next_Review_Date_Field_loc);
	}
	public WebElement Date_31() {
		return driver .findElement(Date_31_loc);
	}
	
	public WebElement Prescription_Save_Btn() {
		return driver .findElement(Prescription_Save_Btn_loc);
	}
	
//	Previous Prescriptions
	public WebElement View_Priscribed_Medicine_Icon() {
		return driver .findElement(View_Priscribed_Medicine_Icon_loc);
	}
	public WebElement Medicine_Detiles() {
		return driver .findElement(Medicine_Detiles_loc);
	}
	public WebElement View_Priscription_pdf_Icon() {
		return driver .findElement(View_Priscription_pdf_Icon_loc);
	}
	public WebElement View_Priscription_Text() {
		return driver .findElement(View_Priscription_Text_loc);
	}
	
	public WebElement Pdf_iframe() {
		return driver .findElement(Pdf_iframe_loc);
	}
	public WebElement Menu_Icon() {
		return driver .findElement(Menu_Icon_loc);
	}
	
	public WebElement Zoom_In_Btn() {
		return driver .findElement(Zoom_In_Btn_loc);
	}
	
	public WebElement Pdf_Download_Icon() {
		return driver .findElement(Pdf_Download_Icon_loc);
	}
	
//	Convert To Order
	public WebElement PR47_Convert_To_Order_Icon() {
		return driver .findElement(PR47_Convert_To_Order_Icon_loc);
	}
	public WebElement Convert_to_Order_Alert() {
		return driver .findElement(Convert_to_Order_Alert_loc);
	}
	public WebElement Convert_to_Order_Alert_YESbtn() {
		return driver .findElement(Convert_to_Order_Alert_YESbtn_loc);
	}
	public WebElement Wallet_Tab() {
		return driver .findElement(Wallet_Tab_loc);
	}
	public WebElement Total_Wallet_Amoun() {
		return driver .findElement(Total_Wallet_Amount_loc);
	}
	public WebElement Prescriptions() {
		return driver .findElement(Prescriptions_loc);
	}
	public WebElement Convert_To_Order() {
		return driver .findElement(Convert_To_Order_loc);
	}
	public WebElement Convert_To_Order_Yes_Btn() {
		return driver .findElement(Convert_To_Order_Yes_Btn_loc);
	}
	



	
}
