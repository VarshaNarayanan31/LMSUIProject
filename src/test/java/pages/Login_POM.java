package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
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
   // validation of user,pass

    @FindBy(xpath="//*[contains(text(),'Please Check password')")WebElement Message_pass;
    @FindBy(xpath="//*[contains(text(),'Please Check username')")WebElement Message_user;

    @FindBy(xpath="//*[contains(text(),'Please Check username/password')")WebElement Message_user_pass;


//forget username & password
@FindBy (xpath="//*[contains(text(),' email')]") WebElement email_text;
    @FindBy (id="input-email") WebElement validEmail;
    @FindBy (id="compose-email") WebElement ComposeEmail;
    @FindBy (id="send-link") WebElement SendLink;
    @FindBy (xpath="//*[contains(text(),' send')]")WebElement SendLinkbtn;

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
    public void verify_position() {

        int idX1 = userName_txt.getLocation().x;

        int idX2 = userName_txt.getLocation().y;

        Assert.assertEquals(idX1, idX2);
    }

    public void verify_login_position() {

        int idX1 = login_btn.getLocation().x;

        int idX2 = login_btn.getLocation().y;

        Assert.assertEquals(idX1, idX2);
    }
    //color code
    // identify text
    public void get_color_field() {

        //obtain color
        String user = userName_txt.getCssValue("user_field_color");

        String pass= password_txt.getCssValue("pass_field_color");
        // convert rgba to hex

        String Color_InRGB_user = Color.fromString(user).asHex();

        System.out.println("Color is :" + user);

        System.out.println("Hex code for color:" + Color_InRGB_user);

        String Color_InRGB_pass = Color.fromString(pass).asHex();

        System.out.println("Color is :" + pass);

        System.out.println("Hex code for color:" + Color_InRGB_pass);

        Assert.assertEquals(user, Color_InRGB_user);

        Assert.assertEquals(pass, Color_InRGB_pass);

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
    // checking for login credentials

    public void verify_Dash_Page() {

        String dashTitle = driver.getTitle();

        Assert.assertEquals("DashBoard Page",dashTitle);
    }
    public String Message_user(String expectedmsg) {

        return Message_user.getText();
    }
    public String Message_pass(String expectedmsg) {

        return Message_pass.getText();
    }
    public String Message_user_pass (String expectedmsg) {

        return Message_user_pass.getText();
    }



    //forget username password page
    public void validate_user_pass_Page() {

        String title = driver.getTitle();

        Assert.assertEquals("Forgot Username or Password Page", title);

        System.out.println("Admin is on " + title + "page");
    }

    public void verify_color_field() {

        //obtain color
        String email = email_text.getCssValue("email_field_color");

        // convert rgba to hex

        String Color_InRGB_user = Color.fromString(email).asHex();

        System.out.println("Color is :" + email);

        System.out.println("Hex code for color:" + Color_InRGB_user);

        Assert.assertEquals(email, Color_InRGB_user);

    }
    public boolean email_text (String expectedmsg) {

        return email_text.isDisplayed();
    }

    public boolean SendLinkbtn (String expectedmsg) {

        return SendLinkbtn.isDisplayed();
    }
    public void verify_send_link_position() {

        int idX1 = SendLinkbtn.getLocation().x;

        int idX2 = SendLinkbtn.getLocation().y;

        Assert.assertEquals(idX1, idX2);
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














//










}







// broken link pending