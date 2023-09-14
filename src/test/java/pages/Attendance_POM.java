package pages;

import baseClass.TestBase;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.datatable.DataTable;
import utilities.ExcelReader;

public class Attendance_POM extends TestBase {
    String excelPath = "./src/test/resources/assignment_testdata.xlsx" ;
    public String ClassID,StudentID,Present,Program_name,Class_name,Student_name,Attendance,Attendance_date;
    String searchedField;
    String searchedValue;
    List<Map<String, String>> searchResultTable;

    public Attendance_POM() {

        PageFactory.initElements(driver, this);

    }

    //Manage Attendance page:
    @FindBy(xpath="//*[@class='btn btn-Attendence']")WebElement btnClickAttendence;
    @FindBy(xpath="//*[contains(text(),'Manage Attendence')")WebElement Message;
    @FindBy(xpath="//*[contains(text(),'Showing 1 to 2 of 2 entries.')")WebElement Message1;
    //all the entries
    @FindBy(xpath = "//table[contains(@id,’Attendance’)/tr[0]/th") List<WebElement> tableHeader;

    @FindBy(xpath="//*[@class='btn Attendence-delete'')")WebElement btnclickdel;
    @FindBy(xpath = "//div[@class='alert alert-primary']")WebElement delete_alertMsg;
    @FindBy(xpath="//*[@class='btn Attendence-edit'')")WebElement btnclickedit;

    @FindBy(xpath = "//input[@type='text']") WebElement searchBox;
    @FindBy(xpath = "//button[text()='A new Attendance']") WebElement NewAttenButton;
    //delete page
    @FindBy(name = "closepopingup") WebElement close;

    @FindBy(xpath = "//*[@class='btn btn-yes']")WebElement yes_btn;
    @FindBy(xpath = "//*[@class='btn btn-no']")WebElement no_btn;
    @FindBy(xpath = "//div[@class='success']")WebElement successMsg;

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
    WebElement multiplecheckbox;

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

    @FindBy(xpath = "//*[@class='btn btn-right_arrow']")WebElement right_arrow_btn;
    @FindBy(xpath = "//*[@class='btn btn-left_arrow']")WebElement left_arrow_btn;
    @FindBy(xpath="//a[@href='/student']")WebElement student_Link;
    @FindBy(xpath="//a[@href='/program']")WebElement program_Link;
    @FindBy(xpath="//a[@href='/batch']")WebElement batch_Link;
    @FindBy(xpath="//a[@href='/class']")WebElement class_Link;
    @FindBy(xpath="//a[@href='/user']")WebElement user_Link;
    @FindBy(xpath="//a[@href='/assignment']")WebElement assignment_Link;
    @FindBy(xpath="//a[@href='/logout']")WebElement logout_Link;
    @FindBy(xpath="//a[@href='/close_btn']")WebElement closeButton;
    @FindBy(xpath="//a[@href='/edit_btn']")WebElement editBtn;
    @FindBy(xpath = "//div[@class='delete_element']")WebElement deletedElement;
    @FindBy(xpath = "//*[@class='btn btn-page_number']")WebElement pageNumber;

    @FindBy(xpath = "//div[@class='add_class']")WebElement addClassPage;
//reference
@FindBy(xpath="//input[@class='programName']")  WebElement att_programName;
    @FindBy(xpath="//input[@class='className']") WebElement att_className;
    @FindBy(xpath="//input[@class='studentName']")  WebElement att_studentName;
    @FindBy(xpath="//div[@class='dropdown show']/a[3]") WebElement att_select;
    @FindBy(className="day")List<WebElement> att_selectDate;
    @FindBy(xpath="//*[@id='cancel']") WebElement att_cancel;
    @FindBy(xpath="//*[@id='save']") WebElement att_save;

    @FindBy(xpath="//*[@class='btn Attendence-present')")WebElement btnclickonPresent;
    @FindBy(xpath="//*[@class='btn Attendence-absent')")WebElement btnclickonAbsent;
    //pagination
    @FindBy(xpath = "//li[@class='pagination-arrow next-link']")WebElement paginationEndArrow;
    @FindBy(xpath = "//*[contains(text(),'Showing x to y of z entries')]")
    WebElement paginatorText;
    @FindBy(xpath = "//li[@class='pagination-link next-link']")
    WebElement paginationControl;

    @FindBy(className = "sort-icon")
    WebElement sortIcon;


    //Methods creation

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


//

    public void DeleteButton() {
        //deleteBtn().click();
    }

    public Integer chkDeletedRow() {
        List<WebElement> deletedElements =driver.findElements((By) deletedElement);
        return deletedElements.size();
    }


    // method to get the alert message
    public boolean alertMessage() {
        return delete_alertMsg.isDisplayed();
    }

   // public boolean deleteAlertWindow() {
      //  return deleteAlertPage.isDisplayed();
    //}

    public Boolean yesBtn() {
        return yes_btn.isDisplayed();
    }

    public Boolean noBtn() {
        return no_btn.isDisplayed();
    }

    public void yesButtonClick() {
        yes_btn.click();
    }
    public void noButtonClick() {
        no_btn.click();
    }
    public boolean successMessage() {
        return successMsg.isDisplayed();

    }




















}



//public void verfiymultiplecheckBox() {
//    Object checkbox;
//    Select multiplecheckbox = new Select(WebElement checkbox);
//    boolean value;
//    value = multiplecheckbox.isMultiple();}
//
