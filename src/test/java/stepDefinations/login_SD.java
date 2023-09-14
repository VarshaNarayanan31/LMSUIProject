package stepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import baseClass.TestBase;
import pages.Login_POM;

public class login_SD extends TestBase {

    public Login_POM login = new Login_POM();

//step definition for login feature

    @Given("Admin is in home page")
    public void adminIsInHomePage() {
        Initialization();
    }

    @When("Admin clicks Login button")
    public void adminClicksLoginButton() {

        login.loginBtn();
    }

    @Then("Admin should land on the login page")
    public void adminShouldLandOnTheLoginPage() {

        login.verify_loginpage();

    }

    @Then("Admin should see {string} in the header")
    public void adminShouldSeeInTheHeader(String arg0) {

        login.Header_text("Please login to LMS application");
    }

    @Then("Admin should see correct spellings in all fields")
    public void adminShouldSeeCorrectSpellingsInAllFields() {
        login.verifyHeader_text();

    }

    @Then("Admin should see two text field")
    public void adminShouldSeeTwoTextField() {

        login.userName_txt();
        login.password_txt();
    }

    @Then("Admin should {string} in the first text field")
    public void adminShouldInTheFirstTextField(String arg0) {

        login.User_Header_text("user");
    }

    @Then("Admin should see * symbol next to user text")
    public void adminShouldSeeSymbolNextToUserText() {

        //pending
    }

    @Then("Admin should {string} in the second text field")
    public void adminShouldInTheSecondTextField(String arg0) {

       login.Pass_Header_text("password");
    }
    //pending
    @Then("Admin should see * symbol next to password text")
    public void adminShouldSeeSymbolNextToPasswordText() {

    }

    @Then("Admin should see input field on the centre of the page")
    public void adminShouldSeeInputFieldOnTheCentreOfThePage() {

        login.verify_position();

    }

    @Then("Admin should see login button on the centre of the page")
    public void adminShouldSeeLoginButtonOnTheCentreOfThePage() {

        login.verify_login_position();
    }

    @Then("Admin should see forgot username or password link")
    public void adminShouldSeeForgotUsernameOrPasswordLink() {
        login.ForgotPwdBtnClick();
    }

    @Then("Admin should see reset password link")
    public void adminShouldSeeResetPasswordLink() {

          login.ResetPwdBtnClick();
    }

    @Then("Admin should see user in gray color")
    public void adminShouldSeeUserInGrayColor() {

        login.get_color_field();
    }

    @Then("Admin should see password in gray color")
    public void adminShouldSeePasswordInGrayColor() {

        login.get_color_field();
    }
//*********step definition for login credentials******

    @Given("Admin is in login page")

    public void admin_is_in_login_page() {

        login.verify_loginpage();

        login.verifyHeader_text();
    }
    @When("Admin enter valid credentials {string} {string} and clicks login button")

    public void adminEnterValidCredentialsAndClicksLoginButton(String username, String Password) {

        login.userNameTxt(username);

        login.passwordTxt(Password);

        login.loginBtn();

    }

    @Then("Admin should land on dashboard page")

    public void admin_should_land_on_dashboard_page() {

        login.verify_Dash_Page();

        //url
    }
    @When("Admin enter invalid credentials  and clicks login button")

    public void admin_enter_invalid_credentials_and_clicks_login_button() {

        login.userNameTxt("unknown_user123");

        login.passwordTxt("unknownpass@123");

        login.loginBtn();
    }

    @Then("Error message please check username\\/password")

    public void error_message_please_check_username_password() {

        login.Message_user_pass("Please Check username/password");

    }

    @When("Admin enter valid username  and clicks login button")

    public void admin_enter_valid_username_and_clicks_login_button() {

        login.userNameTxt("user123");

        login.loginBtn();
    }

    @Then("Error message please check password")

    public void error_message_please_check_password() {

        login.Message_pass("Please Check password");
    }

    @When("Admin enter valid  password  and clicks login button")

    public void admin_enter_valid_password_and_clicks_login_button() {

        login.passwordTxt("pass@123");

        login.loginBtn();
    }

    @Then("Error message please check username")

    public void error_message_please_check_username() {

        login.Message_user("Please Check username");
    }

    @When("Admin enter blank in username   and clicks login button")
    public void admin_enter_blank_in_username_and_clicks_login_button() {

        login.userNameTxt("user123");

        login.passwordTxt("pass@123");

        login.loginBtn();

    }

    @When("Admin enter blank in password  and clicks login button")
    public void admin_enter_blank_in_password_and_clicks_login_button() {

        login.userNameTxt("user123");

        login.passwordTxt("");

        login.loginBtn();
    }

    @When("Admin clicks Login button with empty values in both columns")
    public void admin_clicks_Login_button_with_empty_values_in_both_columns() {

        login.userNameTxt("");

        login.passwordTxt("");

        login.loginBtn();
    }


    //*********step definition for forget password 1**********


    @When("Admin clicks forgot username or password link")
    public void adminClicksForgotUsernameOrPasswordLink() {

        login.ForgotPwdBtnClick();
    }

    @Then("Admin should land on forgot username or password page")
    public void adminShouldLandOnForgotUsernameOrPasswordPage() {

        login.validate_user_pass_Page();
    }
    @Then("Admin should see {string} text in gray color")
    public void adminShouldSeeTextInGrayColor(String arg0) {

        login.email_text ("Email");

        login.verify_color_field();
    }
    @Then("Admin should see {string} button")

    public void adminShouldSeeButton(String arg0) {

        login.SendLinkbtn("Send Link");

    }
    @Then("Admin should see {string} in text field")

    public void adminShouldSeeInTextField(String arg0) {

        login.email_text ("Email");
    }

    @Then("Admin should see send link button in center of the page")
    public void adminShouldSeeSendLinkButtonInCenterOfThePage() {

        login.verify_send_link_position();
    }


    //*********step definition for forget password 2**********
    @Given("Admin is in forgot username and password page")
    public void adminIsInForgotUsernameAndPasswordPage() {

        login.validate_user_pass_Page();
    }
    @When("Admin enters valid email id and clicks send link button")
    public void adminEntersValidEmailIdAndClicksSendLinkButton() {
        
        login.ComposeEmail();

        login.SendLinkClick();
    }
//doubt
    @Then("Admin should receive link in mail for reset username \\/ password")

    public void adminShouldReceiveLinkInMailForResetUsernamePassword() {



     }

    @When("Admin enters invalid email id and clicks send link button")
    public void adminEntersInvalidEmailIdAndClicksSendLinkButton() {

    }

    @Then("Admin should not receive link in mail for reset username / password")
    public void adminShouldNotReceiveLinkInMailForResetUsernamePassword() {
    }


//*********step definition for reset password 1************

    @Given("Admin is in login page")
    public void adminIsInLoginPage() {
    }

    @When("Admin clicks reset password link")
    public void adminClicksResetPasswordLink() {

    }

    @Then("Admin should land on reset password page")
    public void adminShouldLandOnResetPasswordPage() {
    }

    @Then("Admin should see submit {string}  button")
    public void adminShouldSeeSubmitButton(String arg0) {

    }

    @Then("Admin should see submit button in center of the page")
    public void adminShouldSeeSubmitButtonInCenterOfThePage() {
    }

    @Then("Admin should see two text box")
    public void adminShouldSeeTwoTextBox() {
    }

    @Then("Admin should see {string} in the first label text")
    public void adminShouldSeeInTheFirstLabelText(String arg0) {
    }

    @Then("Admin should see {string} in the second label text")
    public void adminShouldSeeInTheSecondLabelText(String arg0) {
    }

    @Then("Admin should see text box in disabled state")
    public void adminShouldSeeTextBoxInDisabledState() {

    }



////*********step definition for reset password 2************
    @Given("Admin reset password page")
    public void adminResetPasswordPage() {
    }

    @When("Admin clicks on type in new password field")
    public void adminClicksOnTypeInNewPasswordField() {
    }

    @Then("Admin should see text box is enabled state")
    public void adminShouldSeeTextBoxIsEnabledState() {

        login.EnableIcon1();
    }

    @When("Admin clicks on retype password field")
    public void adminClicksOnRetypePasswordField() {
    }

    @When("Admin enters same password on both field and clicks submit button")
    public void adminEntersSamePasswordOnBothFieldAndClicksSubmitButton() {
    }

    @Then("Admin should recieve  : {string}. Please click here to login")
    public void adminShouldRecievePleaseClickHereToLogin(String arg0) {
    }

    @When("AAdmin enters same password on both field with invalid details and clicks submit button")
    public void aadminEntersSamePasswordOnBothFieldWithInvalidDetailsAndClicksSubmitButton() {
    }

    @Then("Error message {string}")
    public void errorMessage(String arg0) {
    }

    @When("Admin enters  empty details on both fieldand clicks submit button")
    public void adminEntersEmptyDetailsOnBothFieldandClicksSubmitButton() {
    }

    @When("Admin enters  mismatch values and clicks submit button")
    public void adminEntersMismatchValuesAndClicksSubmitButton() {
    }


}
