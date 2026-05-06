package Utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

	public class Utility {
		WebDriver driver;
		String parentWindow;
		
		public Utility(WebDriver driver) {
			this.driver=driver;
			parentWindow = driver.getWindowHandle();
		}

		public void Switchto_new_window() {
			String parentWindow = driver.getWindowHandle();
			 // Get all window handles
	        Set<String> windowHandles = driver.getWindowHandles();
	        
	        for (String windowHandle : windowHandles) {
	            if (!windowHandle.equals(parentWindow)) {
	            	
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	    }

		public void SwitchTo_main_window() {
			driver.switchTo().window(parentWindow);
	}
		
		public void Scrole_to_Element(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",element);
		}
	
		public void Select_Option(WebElement element,String Text) {
			Select oselect = new Select(element);
			oselect.selectByVisibleText(Text);
		}
		
		
		public int calculateAge(Date dob, Date currentDate) {
			
	        // Create Calendar instances for DOB and current date
	        Calendar dobCal = Calendar.getInstance();
	        dobCal.setTime(dob);

	        Calendar currentCal = Calendar.getInstance();
	        currentCal.setTime(currentDate);

	        // Calculate the difference in years
	        int age = currentCal.get(Calendar.YEAR) - dobCal.get(Calendar.YEAR);

	        // Adjust for months and days if current date hasn't yet passed the birthday in this year
	        if (currentCal.get(Calendar.MONTH) < dobCal.get(Calendar.MONTH) ||
	            (currentCal.get(Calendar.MONTH) == dobCal.get(Calendar.MONTH) && currentCal.get(Calendar.DAY_OF_MONTH) < dobCal.get(Calendar.DAY_OF_MONTH))) {
	            age--;
	        }

	        return age;
	    }
		
		
		
	}
