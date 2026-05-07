# Pharmayush Connect (PharmDoctor) — Healthcare Web Application
## Automation Testing Project

---

## About the Project

Pharmayush Connect is a healthcare web application that connects patients,
doctors, and pharmacy administrators. The application supports doctor login,
patient management, prescription creation, order tracking, wallet management,
and subscription handling.

This repository contains automated test scripts developed during on-job
training at Suffix E Solutions, Thiruvananthapuram, to validate core
functionalities across Admin, Doctor, and Wallet modules.

**Application URL:** https://pharmayushconnect.com/

---

## Tools & Technologies

| Tool / Technology        | Purpose                                        |
|--------------------------|------------------------------------------------|
| Selenium WebDriver       | Browser automation                             |
| Java                     | Programming language                           |
| TestNG                   | Test execution, prioritization, and assertions |
| Maven                    | Build management and dependencies              |
| Page Object Model (POM)  | Framework design pattern                       |
| ChromeDriver             | Chrome browser automation                      |
| ChromeOptions            | Guest mode and browser configuration           |
| WebDriverWait            | Explicit wait for dynamic elements             |
| Actions Class            | Mouse movement and interaction handling        |
| Select Class             | Dropdown element handling                      |
| SimpleDateFormat         | Date validation and age calculation            |
| JIRA                     | Defect tracking and test management            |

---

## Project Structure

```
pharmConnect/
│
├── src/
│   ├── main/java/
│   │   ├── Pages/
│   │   │   ├── Admin_Login.java     — Page Object for Admin module
│   │   │   ├── Login_Page.java      — Page Object for Doctor/Patient module
│   │   │   └── (other page classes)
│   │   └── Utils/
│   │       └── Utility.java         — Reusable utility methods
│   │                                  (Select_Option, Scrole_to_Element,
│   │                                   calculateAge, Switchto_new_window,
│   │                                   SwitchTo_main_window)
│   │
│   └── test/java/
│       └── Tests/
│           ├── PharmaAdmin_Test.java        — Admin module test scripts
│           ├── PharmaDoctor_Test.java       — Doctor module test scripts
│           └── Wallet_Checking_test.java    — Wallet module test scripts
│
├── Feature_Folder/         — Cucumber BDD feature files
├── pom.xml                 — Maven dependencies and plugins
├── testng.xml              — TestNG suite configuration
└── README.md               — Project documentation
```

---

## Test Modules & Coverage

### 1. PharmaAdmin_Test.java — Admin Module
Tests performed from the **Admin** perspective:

| Priority | Test Method                | Description                                                  |
|----------|----------------------------|--------------------------------------------------------------|
| 1        | Admin_Login()              | Validates admin login with credentials and URL verification  |
| 2        | Orders()                   | Navigates All Orders list and verifies order details page    |
| 3        | Verify_Order_Details()     | Updates payment status to PAID and order status to DELIVERED |
| 4        | Grand_Total_Calculation()  | Validates subtotal and grand total arithmetic calculation    |

---

### 2. PharmaDoctor_Test.java — Doctor Module
Tests performed from the **Doctor** perspective:

| Priority | Test Method                    | Description                                                         |
|----------|--------------------------------|---------------------------------------------------------------------|
| 1        | Verify_Login_Tab()             | Validates doctor login with URL and dashboard verification          |
| 2        | Orders_Tab()                   | Reads and prints all available order status dropdown options        |
| 3        | Quotes_Tab()                   | Validates navigation to Quotes page with URL assertion              |
| 4        | Patient_Tab()                  | Reads and prints all patient dropdown options                       |
| 5        | Wallet_Tab()                   | Validates navigation to Wallet page with URL assertion              |
| 6        | Subscriptions()                | Validates navigation to Subscriptions page with URL assertion       |
| 7        | Appointments()                 | Validates navigation to Appointments page with URL assertion        |
| 8        | Create_New_Patients()          | Creates new patient with full details, DOB validation, age calc     |
| 9        | Verify_Edit_Details()          | Edits existing patient details and verifies success message         |
| 10       | Add_Patient_Address()          | Adds permanent and communication address for a patient              |
| 11       | Add_Prescription_With_Nxt_Rvu_Date() | Creates full prescription with medicines, dosage, next review |
| 12       | View_Priscribed_Medicines()    | Verifies prescribed medicine details are displayed correctly        |
| 13       | View_Priscription_pdf()        | Opens prescription PDF in new window and verifies display           |

---

### 3. Wallet_Checking_test.java — Wallet Module
Tests performed for **Wallet** functionality:

| Priority | Test Method                | Description                                                   |
|----------|----------------------------|---------------------------------------------------------------|
| 1        | Verify_DocterLogin_Tab()   | Validates doctor login and page navigation                    |
| 2        | Verify_Wallet_Amount()     | Extracts wallet balance, parses float value, converts order   |

---

## Key Testing Techniques Used

- **Page Object Model (POM)** — Separate page classes for Admin, Doctor, and Utility
- **TestNG Prioritization** — `@Test(priority = N)` for controlled test execution order
- **Explicit Waits** — `WebDriverWait` with `ExpectedConditions` for dynamic elements
- **Implicit Waits** — Global 20-second implicit wait for element loading
- **TestNG Assertions** — `Assert.assertEquals`, `Assert.assertTrue` for validations
- **Dropdown Handling** — Custom `Select_Option()` utility and native `Select` class
- **Actions Class** — Mouse movement handling to dismiss browser prompts
- **Date Validation** — `SimpleDateFormat` to validate DOB does not exceed current date
- **Age Calculation** — Custom `calculateAge()` utility method for DOB-to-age validation
- **Float Arithmetic Validation** — Grand total and subtotal calculation verification
- **String Parsing** — Regex-based numeric extraction from wallet amount text
- **Multi-window Handling** — `Switchto_new_window()` and `SwitchTo_main_window()` for PDF
- **Guest Mode Browser** — `ChromeOptions` with `--guest` flag for isolated test sessions
- **Scroll to Element** — Custom `Scrole_to_Element()` utility for off-screen elements
- **Cross-module Testing** — Admin, Doctor, and Wallet workflows tested independently

---

## Test Data Used

| Field              | Value                                      |
|--------------------|--------------------------------------------|
| Admin Login ID     | 1001                                       |
| Doctor Email       | manoj@gmail.com                            |
| New Patient Name   | Amal                                       |
| Patient DOB        | 12-03-1992                                 |
| Blood Group        | O+ve                                       |
| Medicine 1         | Santhigiri Sukumaram Kashayam — 100ML      |
| Medicine 2         | Acitrom 4Mg — 10 Numbers                   |
| Diagnosis          | Primary Hypertension (Essential)           |
| Patient Address    | Kollam / Thiruvananthapuram, Kerala        |

---

## How to Run

### Prerequisites
- Java JDK 11 or above installed
- Eclipse IDE installed
- Maven installed
- ChromeDriver matching your installed Chrome browser version

### Steps

**1. Clone this repository**
```
git clone https://github.com/ManojKumar-343/Pharmayush_Connect.git
```

**2. Open in Eclipse**
```
File → Import → Existing Maven Project → Select cloned folder → Finish
```

**3. Update Maven dependencies**
```
Right-click pom.xml → Maven → Update Project → OK
```

**4. Run the full test suite**
```
Right-click testng.xml → Run As → TestNG Suite
```

**5. Run a single test class**
```
Right-click PharmaDoctor_Test.java → Run As → TestNG Test
```

**6. View test results**
```
Open test-output/index.html in a browser after execution
```

---

## Defect Tracking

All defects identified during testing were logged and tracked in
**JIRA** with the following details:
- Defect title and clear description
- Step-by-step reproduction steps
- Severity and priority classification
- Expected vs actual result
- Resolution status and retest confirmation

---

## Author

**Manoj Kumar A.V.**
Software Test Engineer | Manual & Automation Testing
Nagercoil, Tamil Nadu
+91 9486325211
manojarumai31@gmail.com
linkedin.com/in/manoj-kumar001
