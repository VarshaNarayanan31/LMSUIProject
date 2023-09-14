package pages;



	import java.util.List;

    import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

    import utilities.LoggerLoad;

	
	public class StudentDetails_POM {

	private WebDriver driver;
	
	public StudentDetails_POM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this); 
	}


	@FindBy(xpath = "//a[text()='Assignment']")WebElement assignmentLnk;
	@FindBy(xpath = "//a[text()='Student']")WebElement studentLnk;
	@FindBy(xpath = "//a[text()='Program']")WebElement programLnk;
	@FindBy(xpath = "//a[text()='Batch']")WebElement batchLnk;
	@FindBy(xpath = "//a[text()='Class']")WebElement classLnk;
	@FindBy(xpath = "//a[text()='Attendance']")WebElement attendanceLnk;
	@FindBy(xpath = "//a[text()='User']")WebElement userLnk;
	@FindBy(xpath = "//a[text()='Logout']")WebElement logoutLnk; 
	@FindBy(className = "lms-title")WebElement lmsTitle; 
	@FindBy(tagName = "title")WebElement getPageTitle;
	@FindBy(xpath= "//a[text()='studentDetail']")WebElement studentDetailTitle;
	@FindBy(xpath = "//a[text()='Select Student Name']")WebElement selectStudentDropdown;
	@FindBy(xpath = "//input[@type='Select Batch ID']")WebElement batchIDSearchBox;
	@FindBy(xpath = "//input[@type='student']")WebElement studentSearchBox;
	@FindBy(xpath = "//a[text()= Batch id dropdown']")WebElement selectbatchIdDropdown;
	@FindBy(id = "select")List<WebElement> selectValue; 


	
	public String getCurrentPageTitle() {
		return driver.getTitle().trim();
	}
	public void clickAssignment() {
		assignmentLnk.click();
		
	}
	
	public void clickProgram() {
		programLnk.click();
	}

	public void clickUser() {
		userLnk.click();
	}

	public void clickAttendance() {
		attendanceLnk.click();
	}

	public void clickClass() {
		classLnk.click();

	}

	public void clickBatch() {
		batchLnk.click();
	}

	public void clickLogout() {
		logoutLnk.click();
	}

	public void clickStudent() {
		studentLnk.click();
	}


	public void Assignmentlnk() {
		assignmentLnk.click();
	}


	public String getlmsTitle() {
		return lmsTitle.getText();
	}

	public String getPageTitle() {
		return getPageTitle.getText();
	}

	public boolean checkDropDownSpelling(String dropdownText) {
		boolean checkspelling = selectStudentDropdown.getText().equals(dropdownText);
		return checkspelling;

	}

	public void checkDropdownVisible(String dropdownText) {
		if (dropdownText.equalsIgnoreCase("Student Name"))
			LoggerLoad.info("dropdown student name is visible");
		else if (dropdownText.equalsIgnoreCase("Batch Id")) {
			LoggerLoad.info("dropdown batch id is visible");
		}

	}

	public String firstDropDownTitle(String value) {
		return selectValue.get(0).getText();
	}

	public String secondDropDownTitle(String value) {
		return selectValue.get(1).getText();
	}

	public void scrollStudentDropdown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", selectStudentDropdown);
	}

	public void scrollBatchDropdown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", selectbatchIdDropdown);
	}

	public Object selectNameFromStudentDropdown() {

		Select studentNameDropdown = new Select(selectStudentDropdown);
		studentNameDropdown.selectByVisibleText("Sylvia");

        return null;
    }

	public Object selectBatchIdFromBatchDropdown() {
		Select batchIdDropdown = new Select(selectbatchIdDropdown);
		batchIdDropdown.selectByVisibleText("3566");
		return null;
		
	}

	public void clickStudentDropDown() {
		selectStudentDropdown.click();
	}

	public void clickBatchIdDropDown() {
		selectbatchIdDropdown.click();
	}
	
	public boolean checkSearchBoxVisiblility(String dropdownText) {
		if (dropdownText.equalsIgnoreCase("Student Name")) {
			selectStudentDropdown.click();
		}
		 else if(dropdownText.equalsIgnoreCase("Batch Id")) {
			selectbatchIdDropdown.click();
		}
		return false;
	}
}
