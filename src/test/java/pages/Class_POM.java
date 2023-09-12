package pages;
import static org.testng.Assert.assertEquals;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Class_POM {
	WebDriver driver;
	
	public Class_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
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
	@FindBy(xpath = "//*[@class='btn btn-sort']")WebElement sort_btn;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
