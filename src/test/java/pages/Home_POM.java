package pages;
import org.junit.Assert;
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
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/img")
    WebElement logo;
    @FindBy(xpath = "//p[@id='login' and @align='right']") WebElement login_allign;

    @FindBy(xpath = "//span[text()='Login']") WebElement login_btn;

    public Home_POM() {

        PageFactory.initElements(driver, this);

    }

    public void verifyurl() {

        String actualurl = driver.getCurrentUrl();
        if (actualurl.contains("url")) {
            System.out.println("Admin lands on the home page");
        } else {
            System.out.println("Admin receives 404 page not found error");
        }

    }

    public boolean verifylogo() {
        return logo.isDisplayed();
    }

    public boolean verifylogin_allgin() {
        return login_allign.isDisplayed();
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
// pending -text spelling and allignment
