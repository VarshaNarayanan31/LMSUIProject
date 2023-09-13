package pages;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.datatable.DataTable;
import utilities.ExcelReader;


public class Class_POM {
	WebDriver driver;
	 String excelPath = "./src/test/resources/assignment_testdata.xlsx" ;
	 public String Batch_Id,No_of_Classes,Class_Date,Class_Topic,Staff_Id,Class_Description,
		Comments,Notes,Recording;
	 public String selectedDate = "5";
		public String date;
		
	
	public Class_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	String searchedField;
	String searchedValue;
	List<Map<String, String>> searchResultTable;
		
	@FindBy(xpath = "//button[text()='A new Class']")WebElement NewClassButton;
	@FindBy(xpath = "//table[contains(@id,’Class’)/tr[0]/th")List<WebElement> tableHeader;
	@FindBy(id = "deleteButton")WebElement deleteButton;
	@FindBy(xpath = "//div[@class='alert alert-primary']")WebElement delete_alertMsg;
	@FindBy(xpath = "//*[@class='btn btn-delete-on-right']")WebElement deleteOnRight_btn;
	@FindBy(xpath = "//input[@type='batch']")WebElement batchId;
	@FindBy(xpath = "//input[@type='class_topic']")WebElement class_topic;
	@FindBy(xpath = "//*[@class='btn btn-yes']")WebElement yes_btn;
	@FindBy(xpath = "//*[@class='btn btn-no']")WebElement no_btn;
	@FindBy(xpath = "//div[@class='success']")WebElement successMsg;
	@FindBy(xpath = "//input[@type='text']")WebElement searchBox;
	@FindBy(xpath = "//table//thead//tr//th//input")WebElement checkbox;
	@FindBy(xpath = "//table//thead//tr//th//input")WebElement multiCheckbox;
	@FindBy(xpath = "//*[@class='btn btn-edit']")WebElement edit_icon;
	@FindBy(xpath="//a[@href='/class']")WebElement class_Link;
	@FindBy(xpath = "//*[@class='btn btn-right_arrow']")WebElement right_arrow_btn;
	@FindBy(xpath = "//*[@class='btn btn-left_arrow']")WebElement left_arrow_btn;
	@FindBy(xpath="//a[@href='/student']")WebElement student_Link;
	@FindBy(xpath="//a[@href='/program']")WebElement program_Link;
	@FindBy(xpath="//a[@href='/batch']")WebElement batch_Link;
	@FindBy(xpath="//a[@href='/user']")WebElement user_Link;
	@FindBy(xpath="//a[@href='/assignment']")WebElement assignment_Link;
	@FindBy(xpath="//a[@href='/attendance']")WebElement attendance_Link;
	@FindBy(xpath="//a[@href='/logout']")WebElement logout_Link;
	@FindBy(xpath = "//li[@class='pagination-link next-link']")WebElement paginationRowText;
	@FindBy(xpath = "//div[@class='delete']")WebElement deleteAlertPage;
	@FindBy(xpath = "//div[@class='delete_element']")WebElement deletedElement;
	@FindBy(xpath = "//*[@class='btn btn-page_number']")WebElement pageNumber;
	@FindBy(xpath = "//li[@class='pagination-arrow next-link']")WebElement paginationEndArrow;
	@FindBy(xpath = "//div[@class='add_class']")WebElement addClassPage;
	@FindBy(className = "sort-icon")WebElement sortIcon;
	@FindBy(className = "header")WebElement headerLinkText;
	@FindBy(xpath = "//li[@class='pagination-link next-link']")WebElement paginationControl;
	@FindBy(xpath = "//li[@class='searchResultTable']")WebElement searchResultTableElement;
	@FindBy(xpath = "//li[@class='searchResultTable']")WebElement searchResultTableHeaderElement;
	@FindBy(xpath="//a[@href='/batch_dropdown']")WebElement batchDropdown;
	@FindBy(xpath = "//*[@class='btn btn-save']")WebElement save_btn;
	@FindBy(xpath = "//*[@class='btn btn-cancel']")WebElement cancel_btn;
	@FindBy(xpath = "//div[@class='alert alert-danger']")WebElement classFieldalertMsg;
	@FindBy(className="day")List<WebElement> dates;
	@FindBy(xpath = "//table//thead//tr//td[1]")public List<WebElement> batchIdvalues;
	@FindBy(xpath="input[type='text']")List<WebElement> textBoxes;
	@FindBy(xpath="//a[@href='/staff_dropdown']")WebElement staffIdDropdown;
	@FindBy(xpath="//a[@href='/calender']")WebElement calenderIcon;
	@FindBy(xpath="//a[@href='/close_btn']")WebElement closeButton;
	@FindBy(xpath="//a[@href='/edit_btn']")WebElement editBtn;
	@FindBy(xpath = "//div[@class='edit_class']")WebElement editClassPage;
	
	public List<WebElement> selectHeaderText(){
		List<WebElement> headerLinks = driver.findElements((By) headerLinkText);
		return headerLinks;
	}
	
	//Method to get the data table from feature; loop through each data and enter the value in the search box
	public void enterValidDetailsInSearch(DataTable dataTable) {
		List<Map<String, String>> searchTable = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> indivSearchValues : searchTable) {
			searchedField = indivSearchValues.get("searchField");
			searchedValue = indivSearchValues.get("searchValue");
			searchBox.sendKeys(searchedValue);
			searchBox.sendKeys(Keys.ENTER);
		}
	}
	
	public void searchValue() {
		searchBox.sendKeys(searchedValue);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	//Method to load the search results into a List of Map
	public void loadSearchResultsIntoListOfMap() {		
		List<WebElement> searchTableElements = driver.findElements((By) searchResultTableElement);
		int searchTableSize = searchTableElements.size(); // find the number of rows displayed including header
		List<WebElement> searchTableHeaderElements = driver.findElements((By) searchResultTableHeaderElement);
		int searchTableHeaderSize = searchTableHeaderElements.size(); // find number of header fields
		Map<String, String> searchTableHeaderAndValue = new HashMap<String, String>();
		for(int headerIndex = 0; headerIndex < searchTableHeaderSize; headerIndex++) {
			String headerKey = searchTableHeaderElements.get(headerIndex).getText();
			for(int resultDataIndex = 1; resultDataIndex < searchTableSize; resultDataIndex++) {
				String dataValue = searchTableElements.get(resultDataIndex).getText();
				searchTableHeaderAndValue.put(headerKey, dataValue);
				searchResultTable.add(searchTableHeaderAndValue);
			}
		}		
	}
	
	//Method to confirm if the searched value is displayed in the results
	public Boolean checkIfSearchItemDisplayed() {
				
		boolean isSearchItemDisplayed = false;
		
		if(searchResultTable.size() <= 1) {
			return false;
		}		
			ListIterator<Map<String, String>> eachDataRow = searchResultTable.listIterator();
			while(eachDataRow.hasNext()) {
				Map<String, String> eachValue = eachDataRow.next();
				for(Map.Entry<String, String> eachEntry : eachValue.entrySet()) {
					if (eachEntry.getKey().equalsIgnoreCase(searchedField)) {
						if(searchedValue.equalsIgnoreCase(eachEntry.getValue())) {
							isSearchItemDisplayed = true;
						}
					}
				}
			}		
		return isSearchItemDisplayed;
	}
	
	
	public void verifyurl() {

		String actualurl = driver.getCurrentUrl();
		if (actualurl.contains("Class")) {
			System.out.println("user is in Class page");
		} else {
			System.out.println("user is in some other page");
		}

	}
	
	public void verifyClassTitle() {

		String actual_title = driver.getTitle();
		String expected_title = "Manage Class";
		Assert.assertEquals(actual_title, expected_title);

	}
	
	
	public void DisabledDeleteIcon() {
		boolean value = deleteButton.isEnabled();
		if (value = true) {
			System.out.println("DeleteButton is enabled");
		} else {
			System.out.println("DeleteButton is disabled");
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
	
	public void NewClassButton() {

		boolean NewAssignValue = NewClassButton.isDisplayed();
		if (NewAssignValue = true) {
			System.out.println("NewClassButton is displayed");
		} else {
			System.out.println("NewClassButton is not displayed");
		}
	}
	public void headerValidation() {


		List<String> expectedHeaders = Arrays.asList("Check box symbol", "Batch Id", "Class No",
	     "Class Date", "Class Topic", "Staff Id", "Description", "Comments", "Notes", "Recording", "Edit Delete");
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
	
	public void checkBox() {

		boolean checkboxValue = checkbox.isDisplayed();
		if (checkboxValue = true) {
			System.out.println("checkbox is displayed");
		} else {
			System.out.println("checkbox is not displayed");
		}
	}
	public void paginationText() {

		String actualText = paginationRowText.getText();
		String test = paginationRowText.getText();
		test = test.replaceAll("[^0-9]+", " ").trim();// this will replace all words with space and trim the space

		String[] element = test.split(" ");

		String expectedText = "Showing " + element[0] + " to " + element[1] + " of " + element[2] + " entries";

		assertEquals(expectedText, actualText);

	}
	
    public void paginationControl() {
		
		boolean PaginationValue = paginationControl.isDisplayed();
		if(PaginationValue=true) {
			System.out.println("pagination control is displayed");
		}
			else
			{
				System.out.println("pagination control is not displayed");
			}
		}
    
    public void footerText(int x,int y,int z) {
    	String actualText =	paginationRowText.getText();
    	String expectedText = "Showing " + x + " to " + y + " of " + z + " entries";
        assertEquals(expectedText,actualText);
    		
    	}
	public Boolean chkEditBtnIsDisplayed() {
		if (resultTableDataSize() > 0) {
			return edit_icon.isEnabled();
		}
		else {
			if (edit_icon.isEnabled()) {
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
	
	
	public void DeleteButton() {
		deleteButton.click();
		}
	
	public Integer chkDeletedRow() {
		List<WebElement> deletedElements =driver.findElements((By) deletedElement);
		return deletedElements.size();
	}
	
	
	public void DeleteButtonRight() {
		//String firstRowBatchId = batchId.getText();
		//String firstRowClassTopic = class_topic.getText();
		//rowDeleted = firstRowBatchId+"-"+firstRowClassTopic;
		deleteOnRight_btn.click();
		//return rowDeleted; //7576-Python		
	}
	
	// method to get the alert message
	public boolean alertMessage() {
		return delete_alertMsg.isDisplayed(); 
	}	
	
	public boolean deleteAlertWindow() {
		return deleteAlertPage.isDisplayed();
	}	
	
	public boolean addClassWindow() {
		return addClassPage.isDisplayed();
	}	
	public Boolean yesBtn() {
		return yes_btn.isDisplayed();
	}
	
	public Boolean noBtn() {
		return no_btn.isDisplayed();
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
	// Verify the title of the page
			 public String verifyPageTitle() {
			  String pageTitle = driver.getTitle();
			  return pageTitle;
			 }
	
	public void singleChkBox() {
		checkbox.click();
	}
	
	public void multipleChkBox() {
		multiCheckbox.click();
		
	}
	public void deleteEnabled() {
		deleteButton.isEnabled();
	}
	
	public void tickChkBox() {
		checkbox.isSelected();
	}
	
	public void tickMultiChkBox() {
		multiCheckbox.isSelected();
	}
	
	//Method to extract the total number of results retrieved from text shown in the pagination area
	public Integer resultTableDataSize() {
		String returnedRowsMsg = paginationRowText.getText();
		return Integer.valueOf(returnedRowsMsg.split(" ")[5]);
	}
	
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

//Navigation from class page
	public void clickProgram() {
		program_Link.click();
	}
	public void clickUser() {
		user_Link.click();
	}
	public void clickAttendance() {
		attendance_Link.click();
	}
	public void clickAssignment() {
		assignment_Link.click();
		
	}

   public void clickClass() {
	   class_Link.click();
	
}
	public void clickBatch() {
		batch_Link.click();
	}
	public void clickLogout() {
		logout_Link.click();
	}
	public void clickStudent() {
		student_Link.click();
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
  
  public void verifyAssignmentTitle() {
  	String actual_title = driver.getTitle();
		String expected_title = "Manage Assignment";
		Assert.assertEquals(actual_title, expected_title);
  }
  
  public void verifyLoginTitle() {
  	String actual_title = driver.getTitle();
		String expected_title = "Please login to LMS application";
		Assert.assertEquals(actual_title, expected_title);
  }
	
  public void batchDropdown() {
	  batchDropdown.click();
  }
  
  //Add class
  
  public void Enter_Valid_SheetInputs(String Sheetname, int Rownumber) throws IOException, InvalidFormatException,
	InterruptedException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {

ExcelReader reader = new ExcelReader();
List<Map<String, String>> TestData = reader.getData(excelPath, Sheetname);
Batch_Id = TestData.get(Rownumber).get("Batch Id");
No_of_Classes = TestData.get(Rownumber).get("No of Classes");
Class_Date = TestData.get(Rownumber).get("Class Date");
Class_Topic = TestData.get(Rownumber).get("Class Topic");
Staff_Id = TestData.get(Rownumber).get("Staff Id");
Class_Description = TestData.get(Rownumber).get(" Class Description");
Comments = TestData.get(Rownumber).get("Comments");
Notes = TestData.get(Rownumber).get("Notes");
Recording = TestData.get(Rownumber).get("Recording");
searchedField = "Batch Id";
searchedValue = TestData.get(Rownumber).get("Batch Id") ;
  }


public void saveClick() {
	save_btn.click();
}
public void cancelClick() {
	cancel_btn.click();
}
	
public boolean alertMesg() {
	return classFieldalertMsg.isDisplayed();
}
	
public void datePicker() {

	for (WebElement cell : dates) {

		String date = cell.getText();
		if (date.equals(selectedDate)) {
			cell.click();
		}

	}

}
//sort 


public void sortAscending() {
	Actions action = new Actions(driver);
	for (WebElement HeaderValues : tableHeader) {

		if (HeaderValues.getText().equals("Batch Id")) {
			action.moveToElement(sortIcon).click();

		}
	}
}

public void sortDescending() {
	Actions action = new Actions(driver);
	for (WebElement HeaderValues : tableHeader) {

		if (HeaderValues.getText().equals("Batch Id")) {
			action.doubleClick(sortIcon).perform();

		}
	}
}

	
	//Class detail popup


public void newClassClick() {
	NewClassButton.click();
}
	
public void noOfTextBoxes() {
	int actualTextboxes = textBoxes.size();
	int expectedTextboxes = 6;
	assertEquals(expectedTextboxes, actualTextboxes);
}

public boolean batchDropdownDisplayed() {
	return batchDropdown.isDisplayed();
}	
public boolean staffIdDropdownDisplayed() {
	return staffIdDropdown.isDisplayed();
}
public boolean calenderIconDisplayed() {
	return calenderIcon.isDisplayed();
}
public boolean saveBtnDisplayed() {
	return save_btn.isDisplayed();
}

public boolean cancelBtnDisplayed() {
	return cancel_btn.isDisplayed();
}
public boolean closeBtnDisplayed() {
	return closeButton.isDisplayed();
}

//edit

public void editBtnClick() {
	editBtn.click();
}

public boolean editClassDisplayed() {
	return editClassPage.isDisplayed();
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
