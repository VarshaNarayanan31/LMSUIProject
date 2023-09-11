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

	@FindBy(xpath = "//a[text()='Assignment']")
	WebElement assignmentButton;
	@FindBy(id = "deleteButton")
	WebElement DeleteButton;
	@FindBy(xpath = "//input[@type='text']")
	WebElement searchBox;
	@FindBy(xpath = "//button[text()='A new Assignment']")
	WebElement NewAssignButton;
	@FindBy(xpath = "//table[contains(@id,’Assignment’)/tr[0]/th")
	List<WebElement> tableHeader;
	@FindBy(xpath = "//*[@class='btn btn-delete-on-right']")
	WebElement deleteOnRight_btn;
	@FindBy(xpath = "//*[@class='btn btn-edit-on-right']")
	WebElement editOnRight_btn;
	@FindBy(xpath = "//table//thead//tr//th//input")
	WebElement checkbox;
	@FindBy(xpath = "//*[contains(text(),'Showing x to y of z entries')]")
	WebElement paginatorText;
	@FindBy(xpath = "//*[contains(text(),'In total there are number of assignments')]")
	WebElement footerText;
	@FindBy(xpath = "//table//thead//tr")
	List<WebElement> allRows;
	@FindBy(xpath = "//table//thead//tr//td")
	WebElement allColoumns;
	@FindBy(xpath = "//table//thead//tr//td[1]")
	public List<WebElement> assignmentNamevalues;
	@FindBy(xpath = "//table//thead//tr//td[2]")
	public List<WebElement> assignmentDescriptionvalues;
	@FindBy(xpath = "//table//thead//tr//td[3]")
	public List<WebElement> assignmentDuedateValues;
	@FindBy(xpath = "//table//thead//tr//td[4]")
	public List<WebElement> gradeByValues;
	@FindBy(xpath = "//li[@class='pagination-link next-link']")
	WebElement paginationControl;
	
	@FindBy(className = "sort-icon")
	WebElement sortIcon;

	public void AssignmentButton() {
		assignmentButton.click();
	}

	public void verifyurl() {

		String actualurl = driver.getCurrentUrl();
		if (actualurl.contains("Assignment")) {
			System.out.println("user is in Assignment page");
		} else {
			System.out.println("user is in some other page");
		}

	}

	public void verifyTitle() {

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

		// List<WebElement>headerCells =
		// driver.findElements(By.xpath("//table[contains(@id,’Assignment’)/tr[0]/th"));
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
	
	}


