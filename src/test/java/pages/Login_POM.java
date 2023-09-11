package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseClass.TestBase;

public class Login_POM extends TestBase {
    // login page valid&broken link
    @FindBy (xpath="//*[contains(text(),'value')]") WebElement Header_text;
// username and password text validation
@FindBy(xpath="")WebElement heading;//text
    @FindBy (id="id_username") WebElement userName_txt;
    @FindBy (id="id_password") WebElement password_txt;
    @FindBy (xpath="//input[@type='submit'] ")WebElement login_btn;

    @FindBy (xpath = "//*[contains(text(),'Forgot UserName or Password')]") WebElement ForgotUserPwdBtn;
   @FindBy (xpath = "//*[contains(text(),'Reset Password')]") WebElement ResetPwdBtn;


    @FindBy (id="input-email") WebElement validEmail;
    @FindBy (id="compose-email") WebElement ComposeEmail;
    @FindBy (id="send-link") WebElement SendLink;

    @FindBy (xpath="//*[contains(text(),'Reset Password Page')]") WebElement Reset_text;
    @FindBy (xpath = "//*[contains(text(),'Type in new Password')]") WebElement Type_NewPwdTxt;
    @FindBy (xpath="//*[contains(text(),'Retype Password)]") WebElement RetypePassword;
    @FindBy (id="id_new_password") WebElement NewPassword_txt;
    @FindBy (id="id_retype_password") WebElement RetypePassword_txt;
    @FindBy (id="submit") WebElement SubmitBtn;


    //Constructor
    public Login_POM() {

        PageFactory.initElements(driver, this);
    }

    //Methods
    public boolean Header_text(String expectedmsg) {

        return Header_text.isDisplayed();
    }
    public void userNameTxt(String username) {

        userName_txt.sendKeys(username);
    }

    public void passwordTxt(String Password) {

        password_txt.sendKeys(Password);
    }

    public void loginBtn() {

        login_btn.click();
    }










}
