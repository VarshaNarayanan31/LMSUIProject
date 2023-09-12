package pages;

import static org.testng.Assert.assertEquals;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignment_POM {

	WebDriver driver;
	public String assignmentName;
	public String assignmentDescription;
	public String assignmentDuedate;
	public String gradeValue;

	public Assignment_POM(WebDriver driver) {
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
	@FindBy(id = "deleteButton")WebElement DeleteButton;
	@FindBy(xpath = "//input[@type='text']")WebElement searchBox;
	@FindBy(xpath = "//button[text()='A new Assignment']")WebElement NewAssignButton;
	@FindBy(xpath = "//table[contains(@id,’Assignment’)/tr[0]/th")List<WebElement> tableHeader;
	@FindBy(xpath = "//*[@class='btn btn-delete-on-right']")WebElement deleteOnRight_btn;
	@FindBy(xpath = "//*[@class='btn btn-edit-on-right']")WebElement editOnRight_btn;
	@FindBy(xpath = "//table//thead//tr//th//input")WebElement checkbox;
	@FindBy(xpath = "//*[contains(text(),'Showing x to y of z entries')]")WebElement paginatorText;
	@FindBy(xpath = "//*[contains(text(),'In total there are number of assignments')]")WebElement footerText;
	@FindBy(xpath = "//table//thead//tr")List<WebElement> allRows;
	@FindBy(xpath = "//table//thead//tr//td")WebElement allColoumns;
	@FindBy(xpath = "//table//thead//tr//td[1]")public List<WebElement> assignmentNamevalues;
	@FindBy(xpath = "//table//thead//tr//td[2]")public List<WebElement> assignmentDescriptionvalues;
	@FindBy(xpath = "//table//thead//tr//td[3]")public List<WebElement> assignmentDuedateValues;
	@FindBy(xpath = "//table//thead//tr//td[4]")public List<WebElement> gradeByValues;
	@FindBy(xpath = "//li[@class='pagination-link next-link']")WebElement paginationControl;
    @FindBy(xpath = "//a[text()=Assignment Details")WebElement assignmentDetails;
	@FindBy(className = "sort-icon")WebElement sortIcon;
	@FindBy(xpath="input[type='text']")List<WebElement> textBoxes;
	@FindBy(id = "Batch Number dropdown")WebElement batchNoDropdown;
	@FindBy(id = "program Name dropdown")WebElement programNameDropdown;
	@FindBy(xpath= "//*[@id='ctl00_cntMainContent_imgStartDate")WebElement calendarIcon;
    @FindBy(xpath = "//*[contains(text(),'Save')]") WebElement saveBtn;
    @FindBy(xpath = "//*[contains(text(),'Cancel')]")WebElement cancelBtn;
    @FindBy(xpath = "//*[contains(text(),'Delete')]")WebElement deleteBtn;
    @FindBy(xpath= "//*[@id='ctl00_cntclose_img")WebElement closeIcon;
   
    
	public void Assignmentlnk() {
		assignmentLnk.click();
	}

	public void verifyurl() {

		String actualurl = driver.getCurrentUrl();
		if (actualurl.contains("Assignment")) {
			System.out.println("user is in Assignment page");
		} else {
			System.out.println("user is in some other page");
		}

	}

	public void verifyAssignTitle() {

		String actual_title = driver.getTitle();
		String expected_title = "Manage Assignment";
		Assert.assertEquals(actual_title, expected_title);

	}

	public void DisabledIcon() {
		boolean value = DeleteButton.isEnabled();
		if (value = true) {
			System.out.println("Button is enabled");
		} else {
			System.out.println("Button is disabled");
		}
	}

	public void searchBox() {

		boolean searchValue = searchBox.isDisplayed();
		if (searchValue = true) {
			System.out.println("searchbox is displayed");
		} else {
			System.out.println("searchbox is not displayed");
		}

	}

	public void NewAssignButton() {

		boolean NewAssignValue = NewAssignButton.isDisplayed();
		if (NewAssignValue = true) {
			System.out.println("NewAssignButton is displayed");
		} else {
			System.out.println("NewAssignButton is not displayed");
		}
	}

	public void NewAssignButtonClk() {
		NewAssignButton.click();
	}

	public void headerValidation() {


		List<String> expectedHeaders = Arrays.asList("check box symbol", "Assignment name", "Assignment description",
				"Assignment Date", "Assignment Grade", "Edit Delete");
		List<String> actualHeaders = new ArrayList<>();
		for (WebElement headerText : tableHeader) {
			actualHeaders.add(headerText.getText());
		}

		if (actualHeaders.equals(expectedHeaders)) {
			System.out.println("Headers are valid.");
		} else {
			System.out.println("Headers do not match the expected headers.");
		}
	}

	public void editBtn() {

		boolean editBtnValue = editOnRight_btn.isDisplayed();
		if (editBtnValue = true) {
			System.out.println("editButton on right is displayed");
		} else {
			System.out.println("editButton on right is not displayed");
		}
	}

	public void deleteBtnRightclk() {
		deleteOnRight_btn.click();
	}

	public void deleteBtn() {
		boolean deleteBtnValue = deleteOnRight_btn.isDisplayed();
		if (deleteBtnValue = true) {
			System.out.println("deleteButton on right is displayed");
		} else {
			System.out.println("deleteButton on right is not displayed");
		}
	}

	public void checkBox() {

		boolean checkboxValue = checkbox.isDisplayed();
		if (checkboxValue = true) {
			System.out.println("checkbox is displayed");
		} else {
			System.out.println("checkbox is not displayed");
		}
	}

	public void searchAssignmentName(String assignmentName) {
		searchBox.sendKeys(assignmentName);
	}

	public void search_NonAssignName(String nonExistingAssignmentName) {
		searchBox.sendKeys(nonExistingAssignmentName);
	}

	public void search_AssignDescription(String assignmentDescription) {
		searchBox.sendKeys(assignmentDescription);
	}

	public void search_NonAssignDescription(String nonExistingAssignmentDescription) {
		searchBox.sendKeys(nonExistingAssignmentDescription);
	}

	public void search_AssignDuedate(String assignmentDuedate) {
		searchBox.sendKeys(assignmentDuedate);
	}

	public void search_NonAssignDuedate(String nonExistingAssignmentDuedate) {
		searchBox.sendKeys(nonExistingAssignmentDuedate);
	}

	public void search_GradeValue(String gradeValue) {
		searchBox.sendKeys(gradeValue);
	}

	public void search_NonGradeValue(String nonExistinGradeValue) {
		searchBox.sendKeys(nonExistinGradeValue);
	}

	public void emptyField() {
		boolean emptyValue = allRows.isEmpty();
		if (emptyValue = true)
			System.out.println("row is empty");
		else
			System.out.println("row is not empty");
	}

	public void searchForText(String searchText, List<WebElement> elements) {

		boolean hasSearch = false;
		for (WebElement searchValue : elements) {
			if (searchValue.getText().equalsIgnoreCase(searchText)) {
				hasSearch = true;
				break;
			}
		}
		assertEquals(hasSearch, true);

	}

	public void paginationControl() {

		boolean PaginationValue = paginationControl.isDisplayed();
		if (PaginationValue = true) {
			System.out.println("pagination control is displayed");
		} else {
			System.out.println("pagination control is not displayed");
		}
	}

	public void paginationText() {

		String actualText = paginatorText.getText();
		String test = paginatorText.getText();
		test = test.replaceAll("[^0-9]+", " ").trim();// this will replace all words with space and trim the space

		String[] element = test.split(" ");

		String expectedText = "Showing " + element[0] + " to " + element[1] + " of " + element[2] + " entries";

		assertEquals(expectedText, actualText);

	}
  

	public void sortIcon() {

		for (WebElement HeaderValues : tableHeader) {

			if (!HeaderValues.getText().equals("Edit") && !HeaderValues.getText().equals("Delete")) {
				boolean sortvalues = sortIcon.isDisplayed();
				if (sortvalues = true) {
					System.out.println("sortIcon is displayed");
				} else
					System.out.println("sortIcon is not displayed");
			}
		}
	}
		
	public void footerText() {
		
		String actualText = footerText.getText();
		String value =footerText.getText();
		value= value.replaceAll("[^0-9]+", " ").trim();
		String expectedText = "In total there are" + value + "of assignments";
		assertEquals(expectedText, actualText);
	} 
	
//Assignment details pop up
	public void AssignButtonClick() {
		NewAssignButton.click();
	}
	
	public void popWindowTitle() {
		String actualTitle = assignmentDetails.getText();
		String expectedTitle = "Assignment Details";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	public void noOfTextBoxes() {
		int actualTextboxes = textBoxes.size();
		int expectedTextboxes = 8;
		assertEquals(expectedTextboxes, actualTextboxes);
	}
	public void batchNodropdown() {
		 Assert.assertTrue(batchNoDropdown.isDisplayed());
	}
	public void programNameDropdown() {
		 Assert.assertTrue(programNameDropdown.isDisplayed());	
	}
	public void validateCalendarIcon() {
		Assert.assertTrue(calendarIcon.isDisplayed());
	}
	public void validateSaveBtn() {
		Assert.assertTrue(saveBtn.isDisplayed());
	}
	public void validateCancelBtn() {
			Assert.assertTrue(cancelBtn.isDisplayed());	
	}
	public void validatDeleteBtn() {
		Assert.assertTrue(deleteBtn.isDisplayed());
	}
	public void closeIcon() {
		Assert.assertTrue(closeIcon.isDisplayed());
	}

//Navigation from assignment page
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
	
    public void verifyProgramTitle() {
    	String actual_title = driver.getTitle();
		String expected_title = "Manage Program";
		Assert.assertEquals(actual_title, expected_title);	
}
    public void verifyStudentTitle() {
    	String actual_title = driver.getTitle();
		String expected_title = "Manage Student";
		Assert.assertEquals(actual_title, expected_title);
    }
    
    public void verifyBatchTitle() {
    	String actual_title = driver.getTitle();
		String expected_title = "Manage Batch";
		Assert.assertEquals(actual_title, expected_title);
    }
    
    public void verifyAttendanceTitle() {
    	String actual_title = driver.getTitle();
		String expected_title = "Manage Attendance";
		Assert.assertEquals(actual_title, expected_title);
    }
    public void verifyUserTitle() {
    	String actual_title = driver.getTitle();
		String expected_title = "Manage User";
		Assert.assertEquals(actual_title, expected_title);
    }
    
    public void verifyClassTitle() {
    	String actual_title = driver.getTitle();
		String expected_title = "Manage Class";
		Assert.assertEquals(actual_title, expected_title);
    }
    
    public void verifyLoginTitle() {
    	String actual_title = driver.getTitle();
		String expected_title = "Please login to LMS application";
		Assert.assertEquals(actual_title, expected_title);
    }
    
//sort function 
    
    public void sortAscending() {
    	Actions action = new Actions(driver);
		for (WebElement HeaderValues : tableHeader) {

			if (HeaderValues.getText().equals("Assignment Name")) {
				action.moveToElement(sortIcon).click();
					
			}
		}
	}

    public void sortDescending() {
	Actions action = new Actions(driver);
	for (WebElement HeaderValues : tableHeader) {

		if (HeaderValues.getText().equals("Assignment Name")) {
			action.doubleClick(sortIcon).perform();
		
		}
	}
}
}


