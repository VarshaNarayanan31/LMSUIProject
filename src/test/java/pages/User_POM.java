package pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_POM {
	
	WebDriver driver;
	public User_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/user']")WebElement user_Link;
	@FindBy(xpath="//a[@href='/delete']")WebElement delete_btn;
	@FindBy(xpath="//a[@href='/new_user']")WebElement newUser_btn;
	@FindBy(xpath = "//input[@type='text']")WebElement searchBox;
	@FindBy(xpath = "//table[contains(@id,’Class’)/tr[0]/th")List<WebElement> tableHeader;
	@FindBy(xpath = "//input[@type='text']")WebElement chkBox;
	@FindBy(xpath = "//*[@class='btn btn-edit']")WebElement edit_icon;
	@FindBy(xpath = "//*[@class='btn btn-delete-on-right']")WebElement deleteOnRight_btn;
	@FindBy(xpath = "//li[@class='pagination-link next-link']")WebElement paginationRowText;
	@FindBy(xpath = "//div[@class='add_user']")WebElement addUserPage;
	
	
	
	public void newUserClk() {
		newUser_btn.click();
	}
	
	public boolean addUserWindow() {
		return addUserPage.isDisplayed();
	}	
	
	public void clickUser() {
		user_Link.click();
	}
	
	public void verifyUserTitle() {
	  	String actual_title = driver.getTitle();
			String expected_title = "Manage User";
			Assert.assertEquals(actual_title, expected_title);
	  }
	
	public void verifyurl() {

		String actualurl = driver.getCurrentUrl();
		if (actualurl.contains("User")) {
			System.out.println("user is in User page");
		} else {
			System.out.println("user is in some other page");
		}

	}
	public void DisabledDeleteIcon() {
		boolean value = delete_btn.isEnabled();
		if (value = true) {
			System.out.println("DeleteButton is enabled");
		} else {
			System.out.println("DeleteButton is disabled");
		}
	}
	
	public void NewUserButton() {

		boolean NewAssignValue = newUser_btn.isDisplayed();
		if (NewAssignValue = true) {
			System.out.println("NewUserButton is displayed");
		} else {
			System.out.println("NewUserButton is not displayed");
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
	
	public void headerValidation() {


		List<String> expectedHeaders = Arrays.asList("Check box symbol", "Id", "Name",
	     "Location", "Phone Number", "Edit / Delete");
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
	
	public void checkBox() {

		boolean searchValue = chkBox.isDisplayed();
		if (searchValue = true) {
			System.out.println("checkBox is displayed");
		} else {
			System.out.println("checkBox is not displayed");
		}

	}
	
	//Method to extract the total number of results retrieved from text shown in the pagination area
		public Integer resultTableDataSize() {
			String returnedRowsMsg = paginationRowText.getText();
			return Integer.valueOf(returnedRowsMsg.split(" ")[5]);
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
	
	
}
