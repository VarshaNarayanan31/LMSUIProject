package pages;

import baseClass.TestBase;
import java.net.MalformedURLException;
import java.util.List;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.Select;


public class Manage_Attendance_POM extends TestBase {
    public String ClassID;
    public String StudentID;
    public String Present;

    @FindBy(xpath="//*[@class='btn btn-Attendence']")WebElement btnClickAttendence;
    @FindBy(xpath="//*[contains(text(),'Manage Attendence')")WebElement Message;
    @FindBy(xpath="//*[contains(text(),'Showing 1 to 2 of 2 entries.')")WebElement Message1;

    @FindBy(xpath="//*[@class='btn Attendence-delete'')")WebElement btnclickdel;
    @FindBy(xpath="//*[@class='btn Attendence-edit'')")WebElement btnclickedit;

    @FindBy(xpath = "//input[@type='text']") WebElement searchBox;
    @FindBy(xpath = "//button[text()='A new Attendance']") WebElement NewAttenButton;
    //all the entries
    @FindBy(xpath = "//table[contains(@id,’Attendance’)/tr[0]/th") List<WebElement> tableHeader;

//delete single and multiple button
    @FindBy(xpath = "//*[@class='btn btn-delete-on-right']")
    WebElement single_deleteOnRight_btn;
    @FindBy(xpath = "//*[@class='btn btn-all-delete-on-right']")
    List<WebElement> multiple_deleteOnRight_btn;
    @FindBy(xpath = "//*[@class='btn btn-edit-on-right']")
    WebElement editOnRight_btn;

//single and multiple checkbox
    @FindBy(xpath = "//table//thead//tr//th//input")
    WebElement singlecheckbox;
    //pending
    @FindBy(xpath = "//table//thead//tr//ta//th//input")
    List<WebElement> multiplecheckbox;

    @FindBy(xpath = "//*[contains(text(),'In total there are number of assignments')]")
    WebElement footerText;
    @FindBy(xpath = "//table//thead//tr")
    List<WebElement> allRows;
    @FindBy(xpath = "//table//thead//tr//td")
    WebElement allColoumns;

    @FindBy(xpath = "//table//thead//tr//td[1]")
    public List<WebElement> ClassIDvalues;
    @FindBy(xpath = "//table//thead//tr//td[2]")
    public List<WebElement> StudentIDvalues;
//
    @FindBy(xpath="//*[@class='btn Attendence-present')")WebElement btnclickonPresent;
    @FindBy(xpath="//*[@class='btn Attendence-absent')")WebElement btnclickonAbsent;
    @FindBy(xpath = "//*[contains(text(),'Showing x to y of z entries')]")
    WebElement paginatorText;
    @FindBy(xpath = "//li[@class='pagination-link next-link']")
    WebElement paginationControl;

    @FindBy(className = "sort-icon")
    WebElement sortIcon;

    //constructor
    public Manage_Attendance_POM() {
        PageFactory.initElements(driver, this);

    }

    //Methods
    public void verifyurl() {

        String actualurl = driver.getCurrentUrl();
        if (actualurl.contains("Attendance")) {
            System.out.println("user is in Attendance page");
        } else {
            System.out.println("user is in some other page");
        }

    }
    public void clickattendencebtn() {
        btnClickAttendence.click();

    }
    public String Message(String expectedmsg) {
        return Message.getText();

    }
    public void verifyTitle() {

        String actual_title = driver.getTitle();
        String expected_title = "Manage Attendance";
        Assert.assertEquals(actual_title, expected_title);

    }
    public String Message1(String expectedmsg) {
        return Message1.getText();

    }
    public void clickdeletebtn() {
        btnclickdel.click();

    }
    public void clickeditbtn() {
        btnclickedit.click();

    }
    public void searchBox() {

        boolean searchValue = searchBox.isDisplayed();
        if (searchValue = true) {
            System.out.println("searchbox is displayed");
        } else {
            System.out.println("searchbox is not displayed");
        }

    }
    public void NewAttenButton() {

        boolean NewAttenvalue = NewAttenButton.isDisplayed();
        if (NewAttenvalue = true) {
            System.out.println("NewAttenButton is displayed");
        } else {
            System.out.println("NewAttenButton is not displayed");
        }
    }
    public void headerValidation() {

        // List<WebElement>headerCells =
        // driver.findElements(By.xpath("//table[contains(@id,’Attendance’)/tr[0]/th"));

        List<String> expectedHeaders = Arrays.asList("check box symbol", "Class ID ", "Student ID ",
                "Present", "Edit Delete");
        List<String> actualHeaders = new ArrayList<>();
        for (WebElement headerText : tableHeader) {
            actualHeaders.add(headerText.getText());
        }

        if (actualHeaders.equals(expectedHeaders)) {
            System.out.println("Headers are valid.");
        } else {
            System.out.println("Headers do not match the expected headers.");
        }
    }
    public void editBtn() {

        boolean editBtnValue = editOnRight_btn.isDisplayed();
        if (editBtnValue = true) {
            System.out.println("editButton on right is displayed");
        } else {
            System.out.println("editButton on right is not displayed");
        }
    }

    public void deleteBtn() {

        boolean deleteBtnValue = single_deleteOnRight_btn.isDisplayed();
        if (deleteBtnValue = true) {
            System.out.println("editButton on right is displayed");
        } else {
            System.out.println("editButton on right is not displayed");
        }
    }
//multiple button delete & multiple check box

    

    public void checkBox() {

        boolean checkboxValue = singlecheckbox.isSelected();
        if (checkboxValue = true) {
            System.out.println("checkbox is selected");
        } else {
            System.out.println("checkbox is not selected");
        }
    }



    public void search_ClassID(String ClassID) {
        searchBox.sendKeys(ClassID);
    }

    public void search_StudentID(String StudentID) {
        searchBox.sendKeys(StudentID);
    }

    public void search_Present(String Present) {
        searchBox.sendKeys(Present);
    }

//pending
    public void searchForText(String searchText, List<WebElement> elements) {

        boolean hasSearch = false;
        for (WebElement searchValue : elements) {
            if (searchValue.getText().equalsIgnoreCase(searchText)) {
                hasSearch = true;
                break;
            }
        }
        assertEquals(hasSearch, true);

    }

    public void paginationControl() {

        boolean PaginationValue = paginationControl.isDisplayed();
        if (PaginationValue = true) {
            System.out.println("pagination control is displayed");
        } else {
            System.out.println("pagination control is not displayed");
        }
    }

    public void paginationText() {

        String actualText = paginatorText.getText();
        String test = paginatorText.getText();
        test = test.replaceAll("[^0-9]+", " ").trim();// this will replace all words with space and trim the space

        String[] element = test.split(" ");

        String expectedText = "Showing " + element[0] + " to " + element[1] + " of " + element[2] + " entries";

        assertEquals(expectedText, actualText);

    }


    public void sortIcon() {

        for (WebElement HeaderValues : tableHeader) {

            if (!HeaderValues.getText().equals("Edit") && !HeaderValues.getText().equals("Delete")) {
                boolean sortvalues = sortIcon.isDisplayed();
                if (sortvalues = true) {
                    System.out.println("sortIcon is displayed");
                } else
                    System.out.println("sortIcon is not displayed");
            }
        }
    }
    public void footerText() {

        String actualText = footerText.getText();
        String value =footerText.getText();
        value= value.replaceAll("[^0-9]+", " ").trim();
        String expectedText = "In total there are" + value + "of Attendances";
        assertEquals(expectedText, actualText);
    }


}



//public void verfiymultiplecheckBox() {
//    Object checkbox;
//    Select multiplecheckbox = new Select(WebElement checkbox);
//    boolean value;
//    value = multiplecheckbox.isMultiple();}
//
