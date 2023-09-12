package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import baseClass.TestBase;
import pages.Login_POM;

public class login_SD extends TestBase {
    public Login_POM login = new Login_POM();
//step definition for login
    @Given("Admin is in home page")
    public void adminIsInHomePage() {
    }

    @When("Admin clicks Login button")
    public void adminClicksLoginButton() {
        driver.get("url");
    }

    @Then("Admin should land on the login page")
    public void adminShouldLandOnTheLoginPage() {
        login.verifyurl();
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
    }

    @Then("Admin should {string} in the first text field")
    public void adminShouldInTheFirstTextField(String arg0) {
    }

    @Then("Admin should see * symbol next to user text")
    public void adminShouldSeeSymbolNextToUserText() {
    }

    @Then("Admin should {string} in the second text field")
    public void adminShouldInTheSecondTextField(String arg0) {
    }

    @Then("Admin should see * symbol next to password text")
    public void adminShouldSeeSymbolNextToPasswordText() {
    }

    @Then("Admin should see input field on the centre of the page")
    public void adminShouldSeeInputFieldOnTheCentreOfThePage() {
    }

    @Then("Admin should see login button on the centre of the page")
    public void adminShouldSeeLoginButtonOnTheCentreOfThePage() {
    }

    @Then("Admin should see forgot username or password link")
    public void adminShouldSeeForgotUsernameOrPasswordLink() {
    }

    @Then("Admin should see reset password link")
    public void adminShouldSeeResetPasswordLink() {
    }

    @Then("Admin should see user in gray color")
    public void adminShouldSeeUserInGrayColor() {
    }

    @Then("Admin should see password in gray color")
    public void adminShouldSeePasswordInGrayColor() {
    }

    //*********step definition for forget password**********








//*********step definition for reset password 1************




////*********step definition for reset password 2************
    @Given("Admin reset password page")
    public void adminResetPasswordPage() {
    }

    @When("Admin clicks on type in new password field")
    public void adminClicksOnTypeInNewPasswordField() {
    }

    @Then("Admin should see text box is enabled state")
    public void adminShouldSeeTextBoxIsEnabledState() {
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
