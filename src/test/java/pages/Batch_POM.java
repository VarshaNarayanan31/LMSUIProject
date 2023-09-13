package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Batch_POM {
	
	
    @FindBy(xpath = "//a[text()=Assignment Details")WebElement batchDetails;
	 @FindBy(xpath = "//*[contains(text(),'Delete')]")WebElement deleteBtn;
		@FindBy(xpath = "//button[text()='A new batch']")WebElement NewBatchButton;
	
	public void verifyurl() {

		String actualurl = driver.getCurrentUrl();
		if (actualurl.contains("Manage Batch")) {
			System.out.println("user is in Manage Batch");
		} else {
			System.out.println("user is in some other page");
		}

	}

	public void verifyAssignTitle() {

		String actual_title = driver.getTitle();
		String expected_title = "Manage Batch";
		Assert.assertEquals(actual_title, expected_title);


}
	
	public boolean deleteIconEnabled() {
		return deleteBtn.isEnabled();
		
	}
	
	public void batchDetailsPopup() {
		String actualTitle = batchDetails.getText();
		String expectedTitle = "Batch Details";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public void NewBatchButtonClk() {
		NewBatchButton.click();
	}
	
	public void NewBatchButton() {

		boolean NewAssignValue = NewBatchButton.isDisplayed();
		if (NewAssignValue = true) {
			System.out.println("NewAssignButton is displayed");
		} else {
			System.out.println("NewAssignButton is not displayed");
		}
	}
	
}
