package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseClass.TestBase;

public class Login_POM extends TestBase {


    @FindBy (xpath="//*[contains(text(),'Please login to LMS application')]") WebElement Header_text;
    @FindBy (xpath="//*[contains(text(),'User')]") WebElement User_Header_text;
    @FindBy (xpath="//*[contains(text(),'Password')]") WebElement Pass_Header_text;
// username and password text validation
    @FindBy (id="id_username") WebElement userName_txt;
    @FindBy (id="id_password") WebElement password_txt;
    @FindBy (xpath="//input[@type='submit'] ")WebElement login_btn;
    @FindBy (xpath = "//*[contains(text(),'Forgot UserName or Password')]") WebElement ForgotUserPwdBtn;
   @FindBy (xpath = "//*[contains(text(),'Reset Password')]") WebElement ResetPwdBtn;

//forget username & password
    @FindBy (id="input-email") WebElement validEmail;
    @FindBy (id="compose-email") WebElement ComposeEmail;
    @FindBy (id="send-link") WebElement SendLink;

// reset password
    @FindBy (xpath="//*[contains(text(),'Reset Password Page')]") WebElement Reset_text;
    @FindBy (xpath = "//*[contains(text(),'Type in new Password')]") WebElement Type_NewPwdTxt;
    @FindBy (xpath="//*[contains(text(),'Retype Password)]") WebElement RetypePassword;
    @FindBy (xpath = "//*[@class='alert alert-primary']") WebElement Message;
    @FindBy (id="id_new_password") WebElement NewPassword_btn;
    @FindBy (id="id_retype_password") WebElement RetypePassword_btn;
    @FindBy (id="submit") WebElement SubmitBtn;


    //usage of Constructor
    public Login_POM() {

        PageFactory.initElements(driver, this);
    }

    //Methods creation
    public void verify_loginpage() {
        String title = driver.getTitle();
        Assert.assertEquals("Login", title);
        System.out.println("Admin is on " + title + "page");
    }

        public boolean Header_text (String expectedmsg){

            return Header_text.isDisplayed();
        }

    public void verifyHeader_text() {

        String actual_text = driver.getTitle();
        String expected_text = "Please login to LMS application";
        Assert.assertEquals(actual_text, expected_text);

    }
    public void userNameTxt(String username) {

        userName_txt.sendKeys(username);
    }

    public void passwordTxt(String Password) {

        password_txt.sendKeys(Password);
    }
    public boolean userName_txt() {

        return userName_txt.isDisplayed();

    }
    public boolean password_txt() {

        return password_txt.isDisplayed();
    }

    public boolean User_Header_text (String expectedmsg){

        return User_Header_text.isDisplayed();
    }

    public boolean Pass_Header_text (String expectedmsg){

        return Pass_Header_text.isDisplayed();
    }

    public void loginBtn() {

        login_btn.click();
    }
    public void ForgotPwdBtnClick() {
        ForgotUserPwdBtn.click();

    }

    public void ResetPwdBtnClick() {
        ResetPwdBtn.click();

    }
    //forget username password page
    public void validate_user_pass_Page() {

        String title = driver.getTitle();
        Assert.assertEquals("Forgot Username or Password Page", title);
        System.out.println("Admin is on " + title + "page");
    }

    public String ComposeEmail() {

        ForgotUserPwdBtn.getText();
        return ComposeEmail.getText();
    }
    public void SendLinkClick() {
        validEmail.sendKeys("xyz@gmail.com");
        SendLink.click();

    }
//reset password for Admin clicks reset password link after  reaching in login page

 public void EnableIcon1() {
    boolean value = NewPassword_btn.isEnabled();
    if (value = true) {
        System.out.println("Admin should see Type in New Password field is enabled");

    } else {
        System.out.println("Type in New Password field is disabled");
    }
}

    public void EnableIcon2() {
        boolean value = RetypePassword_btn.isEnabled();
        if (value = true) {
            System.out.println("Admin should see Retype Password field is enabled");

        } else {
            System.out.println("Retype Password field is disabled");
        }
    }

    public void NewPasswordTxt(String username)
    {
        Type_NewPwdTxt.sendKeys(username);
    }

    public void RetypePasswordTxt(String Password) {

        RetypePassword.sendKeys(Password);
    }

    public void SubmitBtnClick() {

        SubmitBtn.click();
    }
    //doubt // verify 3 scenarios for valid, invalid,empty,mismatch
    public void ValidateResetPassword() {


        String TxtResetPwd = RetypePassword_btn.getText();

        Assert.assertEquals("Your password has been reset", TxtResetPwd);
        System.out.println("Admin is on will receive messsage" + TxtResetPwd);
    }













    //color code
  // identify text
    public void get_color_field() {
        WebElement t = driver.findElement(By.tagName("user"));
        //obtain color
        String s = t.getCssValue("color");

    }

//










}







// broken link pending