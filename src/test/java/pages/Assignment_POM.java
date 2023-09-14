package pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.messages.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import utilities.ExcelReader;

public class Assignment_POM {

	WebDriver driver;
	public String assignmentName;
	public String assignmentDescription;
	public String assignmentDuedate;
	public String gradeValue;
	public String Program_name,Batch_number,Assignment_Name,Assignment_Description,grade_by,Assignment_duedate,
	Assignment_file1,Assignment_file2,Assignment_file3,Assignment_file4,Assignment_file5;
    String excelPath = "/Users/uvaraj/git/LMS_Cucumber_Crunchers/src/test/resources/assignment_testdata.xlsx" ;
	public String selectedDate = "5";
	public String date;
	
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
	//@FindBy(xpath = "//li[@class='pagination-link next-link']")WebElement paginationRowText;
	@FindBy(xpath = "//table//thead//tr//th//input")WebElement checkbox;
	@FindBy(xpath = "//*[contains(text(),'Showing x to y of z entries')]")WebElement paginatorText;
	@FindBy(xpath = "//*[contains(text(),'In total there are number of assignments')]")WebElement footerText;
	@FindBy(xpath = "//table//thead//tr")List<WebElement> allRows;
	@FindBy(xpath = "//table//thead//tr//td")WebElement allColoumns;
	@FindBy(xpath = "//table//thead//tr//td[1]")public List<WebElement> assignmentNamevalues;
	@FindBy(xpath = "//table//thead//tr//td[2]")public List<WebElement> assignmentDescriptionvalues;
	@FindBy(xpath = "//table//thead//tr//td[3]")public List<WebElement> assignmentDuedateValues;
	@FindBy(xpath = "//table//thead//tr//td[4]")public List<WebElement> gradeByValues;
	//@FindBy(xpath = "//li[@class='pagination-link next-link']")WebElement paginationControl;
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
    @FindBy(xpath = "//div[@class='alert alert-primary']")WebElement delete_alertMsg;
    @FindBy(xpath = "//*[@class='btn btn-yes']")WebElement yes_btn;
	@FindBy(xpath = "//*[@class='btn btn-no']")WebElement no_btn;
	@FindBy(xpath = "//div[@class='delete']")WebElement deleteAlertPage;
	@FindBy(xpath = "//div[@class='success']")WebElement successMsg;
	@FindBy(xpath = "//div[@class='delete_element']")public List<WebElement> deletedElements;
	@FindBy(xpath = "//div[@class='alert alert-danger']")WebElement AssignFieldalertMsg;
	@FindBy(xpath = "//table//thead//tr//th//input")WebElement multiCheckbox;
	@FindBy(id = "deleteButton")WebElement headerLevelDeleteIcon;
	@FindBy(className="day")List<WebElement> dates;
// pagination
	@FindBy(xpath = "//li[@class='pagination-link next-link']")WebElement paginationRowText;
	@FindBy(xpath = "//*[@class='btn btn-page_number']")WebElement pageNumber;
	@FindBy(xpath = "//li[@class='pagination-arrow next-link']")WebElement paginationEndArrow;
	@FindBy(xpath = "//div[@class='add_class']")WebElement addClassPage;
	@FindBy(className = "header")WebElement headerLinkText;
	@FindBy(xpath = "//li[@class='pagination-link next-link']")WebElement paginationControl;
	@FindBy(xpath = "//li[@class='searchResultTable']")WebElement searchResultTableElement;
	@FindBy(xpath = "//li[@class='searchResultTable']")WebElement searchResultTableHeaderElement;
	@FindBy(xpath = "//*[@class='btn btn-right_arrow']")WebElement right_arrow_btn;
	@FindBy(xpath = "//*[@class='btn btn-left_arrow']")WebElement left_arrow_btn;
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']") WebElement dropDown;
	@FindBy(xpath = "//Select[@id ='prpgram name'] ") WebElement programName;
	@FindBy(xpath = "//Select[@id ='Batch id'] ") WebElement BatchId;
	@FindBy(xpath = "//input[@id ='Assignment Name'] ") WebElement assignmentNameTextBox;
	@FindBy(xpath = "//input[@id ='Assignment Description'] ") WebElement assignmentDescriptionTextBox;
	@FindBy(xpath = "//input[@id ='Grade By'] ") WebElement GradeByTextBox;
	@FindBy(xpath = "//input[@id = 'Assignment due date']") WebElement dueDateTextBox;
	@FindBy(xpath = "//input[@id ='Assignment file 1'] ") WebElement assignmentfile1TextBox;
	@FindBy(xpath = "//input[@id ='Assignment file 2'] ") WebElement assignmentfile2TextBox;
	@FindBy(xpath = "//input[@id ='Assignment file 3'] ") WebElement assignmentfile3TextBox;
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
	
	public Integer resultTableDataSize() {
		String returnedRowsMsg = paginationRowText.getText();
		return Integer.valueOf(returnedRowsMsg.split(" ")[5]);
	}
	
	public Boolean chkEditBtnIsDisplayed() {
		if (resultTableDataSize() > 0) {
			return editOnRight_btn.isEnabled();
		}
		else {
			if (editOnRight_btn.isEnabled()) {
				return false;
			}
			else {
				return true;
			}
		}
		
	}
	
	public Boolean chkDeleteBtnIsDisplayed() {
		if (resultTableDataSize() > 0) {
			return deleteOnRight_btn.isEnabled();
		}
		else {
			if (deleteOnRight_btn.isEnabled()) {
				return false;
			}
			else {
				return true;
			}
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
		String value = footerText.getText();
		value = value.replaceAll("[^0-9]+", " ").trim();
		String expectedText = "In total there are" + value + "of assignments";
		assertEquals(expectedText, actualText);
	}

//Assignment details pop up
	public void AssignButtonClick() {
		NewAssignButton.click();
	}

	public void assignpopWindowTitle() {
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

//Delete assignment validation
	public boolean deleteAlertMessage() {
		return delete_alertMsg.isDisplayed();
	}

	public Boolean yesBtn() {
		return yes_btn.isDisplayed();
	}

	public Boolean noBtn() {
		return no_btn.isDisplayed();
	}

	public boolean deleteAlertWindow() {
		return deleteAlertPage.isDisplayed();
	}

	public void yesButtonClick() {
		yes_btn.click();
	}

	public void noButtonClick() {
		no_btn.click();
	}

	public boolean successMessage() {
		return successMsg.isDisplayed();

	}

	public Integer chkDeletedRow() {
		return deletedElements.size();

	}

	public void singleChkBox() {
		checkbox.click();
	}

	public void multipleChkBox() {
		multiCheckbox.click();
	}

	public void headerDeleteEnabled() {
		headerLevelDeleteIcon.isEnabled();
	}

	public void tickChkBox() {
		checkbox.isSelected();
	}

	public void tickMultiChkBox() {
		multiCheckbox.isSelected();
	}

// Add assignments

	public void Enter_Valid_SheetInputs(String Sheetname, int Rownumber) throws IOException, InvalidFormatException,
			InterruptedException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {

		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> TestData = reader.getData(excelPath, Sheetname);
		Program_name = TestData.get(Rownumber).get("Program name");
		Batch_number = TestData.get(Rownumber).get("Batch number");
		Assignment_Name = TestData.get(Rownumber).get("Assignment Name");
		Assignment_Description = TestData.get(Rownumber).get("Assignment Description");
		grade_by = TestData.get(Rownumber).get("grade by");
		Assignment_duedate = TestData.get(Rownumber).get(" Assignment due date");
		Assignment_file1 = TestData.get(Rownumber).get("Assignmentfile1");
		Assignment_file2 = TestData.get(Rownumber).get("Assignmentfile2");
		Assignment_file3 = TestData.get(Rownumber).get("Assignmentfile3");


	}
	
	
	public  void dropdownClick() {
		dropDown.click();
		
	}
	
	public void passValue() {
		
		dropDown.click();
		Select select = new Select(programName);
		select.selectByVisibleText(Program_name);
		dropDown.click();
		Select select1 = new Select(BatchId);
	    select1.selectByVisibleText(Batch_number);
		//BatchId.sendKeys(Batch_number);
		assignmentNameTextBox.sendKeys(Assignment_Name);
		assignmentDescriptionTextBox.sendKeys(Assignment_Description);
		GradeByTextBox.sendKeys(grade_by);
		dueDateTextBox.sendKeys(Assignment_duedate);
		assignmentfile1TextBox.sendKeys(Assignment_file1);
		assignmentfile2TextBox.sendKeys(Assignment_file2);
		assignmentfile3TextBox.sendKeys(Assignment_file3);
	}

	public boolean alertMesg() {
		return AssignFieldalertMsg.isDisplayed();
	}

	public void saveBtnClick() {
		saveBtn.click();
	}

	public void datePicker() {

		for (WebElement cell : dates) {

			String date = cell.getText();
			if (date.equals(selectedDate)) {
				cell.click();
			}

		}

	}
	
	// pagination assignment
	
	public Integer currentPageNumber() {
		return Integer.valueOf(pageNumber.getText());
	}
	
	public Boolean isRightArrowDisplayed() {
		
		if (resultTableDataSize() / 5.0 > 1.0) {
			return right_arrow_btn.isEnabled();
		}
		else {
			if (right_arrow_btn.isEnabled()) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	public Boolean isLeftArrowDisplayed() {
		
		if (pageNumber.getText() == "1") {
			if(left_arrow_btn.isEnabled()) {
				return false;
			}
			else {
				return true;
			}
		}
		else {
			if(left_arrow_btn.isEnabled()) {
				return true;
			}
			else {
				return false;
			}
		}
		}
	
public Boolean isPaginationArrowDisplayed() {
		
		if (resultTableDataSize() / 5.0 > 1.0) {
			return paginationEndArrow.isEnabled();
		}
		else {
			if (paginationEndArrow.isEnabled()) {
				return false;
			}
			else {
				return true;
			}
		}
	}

public boolean addClassWindow() {
		return addClassPage.isDisplayed();
	}


//edit assignment
public void cancelBtnClick() {
	cancelBtn.click();
	
}
	
}

