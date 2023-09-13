package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import baseClass.TestBase;

public class Home_POM extends TestBase {
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/img") WebElement logo;
    @FindBy(xpath = "//p[@id='login' and @align='right']") WebElement login_allign;
    @FindBy(xpath = "//span[text()='Login']") WebElement login_btn;


    public Home_POM() {

        PageFactory.initElements(driver, this);

    }

    //verify url
    public void verifyurl() {

        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("url")) {
            System.out.println("Admin lands on the home page");

        } else {
            System.out.println("Admin receives 404 page not found error");
        }

    }
//should see the logo as lms
    public boolean verifylogo() {
        return logo.isDisplayed();
    }

   //
    public void text_spelling() {
        String text1 = "LEARNING";
        String text2 = "MANAGEMENT";
        String text3 = "SYSTEM";

        WebElement spell = driver.findElement(By.id("LMS"));
        System.out.println("spelling of Text :::::::::::::::::++>" + spell.getText());
        if (spell.getText().contains(text1)) {
            System.out.println("LEARNING");
        }
            else if(spell.getText().contains(text2)){
            System.out.println("MANAGEMENT");
            }
            else
            spell.getText().contains(text3);
        System.out.println("SYSTEM");



    }
    public void verify_actual_fields(){

            String actual_text = driver.getTitle();
            String expected_text = "L M S";
            Assert.assertEquals(actual_text, expected_text);

        }

    public boolean verify_loginBtn() {
        return login_btn.isDisplayed();

    }

    public void loginBtn() {

        login_btn.click();
    }


//sample for broken link
    public class GetHttpResponse {
        public void main(String[] args) throws
                MalformedURLException, IOException {
            //URL launch
            driver.get("url");
            // establish, open connection with URL
            HttpURLConnection cn = (HttpURLConnection) new URL("new url ").openConnection();
            // set HEADER request
            cn.setRequestMethod("HEAD");
            // connection initiate
            cn.connect();
            //get response code
            int res = cn.getResponseCode();
            System.out.println("Admin should receive Http response code with broken link: " + res);
        }
    }
}
// pending - allignment
