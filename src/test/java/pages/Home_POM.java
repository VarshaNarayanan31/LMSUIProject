package pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class Home_POM extends TestBase{


    @FindBy(xpath="")WebElement logo;
    @FindBy (xpath="//input[@type='submit'] ")WebElement login_btn;
    public  Home_POM() {
        PageFactory.initElements( driver,this);

    }
    public void homePageurl() {

    }
    public boolean verifylogo()
    {
        return logo.isDisplayed();
    }
    public boolean verify_loginBtn()
    {
        return login_btn.isDisplayed();

    }
    public void loginBtn() {

        login_btn.click();
    }


}
