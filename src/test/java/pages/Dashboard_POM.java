package pages;


import baseClass.TestBase;

public class Dashboard_POM extends TestBase {

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Dashboard_POM {
    private WebDriver driver;

    
    @FindBy(xpath = "//span[text()='Manage Program']")
    private WebElement manageProgramHeader;

    @FindBy(xpath = "//span[text()='LMS - Learning Management System']")
    private WebElement lmsTitle;
    
    @FindBy(xpath="//span[text()='login']")
    WebElement login;
    
    @FindBy(xpath="//span[text()='Student']")
    WebElement Student;


    @FindBy(xpath="//span[text()='Program']")
    WebElement program;

    @FindBy(xpath="//span[text()='Batch']")
    WebElement batch;

   @FindBy(xpath= "//span[text()=‘Class']")
    WebElement Class;

    @FindBy(xpath="//span[text()='User']")
    WebElement user;

    @FindBy(xpath="//span[text()='Assignment']")
    WebElement assignment;

    @FindBy(xpath="//span[text()='Attendance']")
    WebElement attendance;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logoutButton;

    @FindBy(className = "header")
    private List<WebElement> headerLinkText;

    public Dashboard_POM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isManageProgramHeaderDisplayed() {
        return manageProgramHeader.isDisplayed();
    }

    public String getLMSTitleText() {
        return lmsTitle.getText();
    }
    
    public void clickLogin() {
        login.click();
    }

    public void clickLogout() {
        logoutButton.click();
    }

    public List<WebElement> getHeaderLinks() {
        return headerLinkText;
    }
    
    public List<WebElement> selectHeaderText(){
		List<WebElement> headerLinks = driver.findElements((By) headerLinkText);
		return headerLinks;
	}
    public void verifyLMSTitle() {
      	String actual_title = driver.getTitle();
    		String expected_title = "LMS - Learning Management System";
    		Assert.assertEquals(actual_title, expected_title);	
    }
    
    		 public void verifyProgramTitle() {
    		      	String actual_title = driver.getTitle();
    		    		String expected_title = "Manage Program";
    		    		Assert.assertEquals(actual_title, expected_title);
    		
    }

    public void waitForNavigation(int maxMillis) {
    	//WebDriverWait wait = new WebDriverWait(driver,10);
    }
    
    public void clickHeaderLinkByText(String linkText) {
        for (WebElement headerLink : headerLinkText) {
            if (headerLink.getText().equalsIgnoreCase(linkText)) {
                headerLink.click();
                break; // Click the first matching link and exit the loop
            }
        }
    }

}
