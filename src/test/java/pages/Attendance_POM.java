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
    public String ClassID,StudentID,Present,ProgramName,ClassName,StudentName,Attendance,Attendance_date;
    String changeclassname,changestudentname,changeattendance;

    String searchedField;
    String searchedValue;
    List<Map<String, String>> searchResultTable;

    public Attendance_POM() {

        PageFactory.initElements(driver, this);

    }

    //****************************Manage Attendance page*****************************************
    @FindBy(xpath="//*[@class='btn btn-Attendence']")WebElement btnClickAttendence;
    @FindBy(xpath="//*[contains(text(),'Manage Attendence')")WebElement att_text;
    @FindBy(xpath="//*[contains(text(),'Showing 1 to 2 of 2 entries.')")WebElement Message1;
    //all the entries of header
    @FindBy(xpath = "//table[contains(@id,’Attendance’)/tr[0]/th") List<WebElement> tableHeader;
    @FindBy(xpath="//*[@class='btn Attendence-delete'')")WebElement btnclickdel;
    @FindBy(xpath="//*[@class='btn Attendence-edit'')")WebElement btnclickedit;
    @FindBy(xpath = "//input[@type='text']") WebElement searchBox;
    @FindBy(xpath = "//button[text()='A new Attendance']") WebElement NewAttenButton;

    //single and multiple checkbox
    @FindBy(xpath = "//table//thead//tr//th//input")
    WebElement singlecheckbox;
    @FindBy(xpath = "//table//thead//tr//ta//th//input")
    WebElement multiplecheckbox;
    @FindBy(xpath = "//*[contains(text(),'In total there are number of assignments')]")
    WebElement footerText;

    //delete single and multiple button
    @FindBy(xpath = "//*[@class='btn btn-delete-on-right']")
    WebElement single_deleteOnRight_btn;
    @FindBy(xpath = "//*[@class='btn btn-all-delete-on-right']")
    WebElement multiple_deleteOnRight_btn;
    @FindBy(xpath = "//*[@class='btn btn-edit-on-right']")
    WebElement editOnRight_btn;

    @FindBy(xpath = "//table//thead//tr")
    List<WebElement> allRows;
    @FindBy(xpath = "//table//thead//tr//td")
    WebElement allColoumns;
    @FindBy(xpath = "//table//thead//tr//td[1]")
    public List<WebElement> ClassIDvalues;
    @FindBy(xpath = "//table//thead//tr//td[2]")
    public List<WebElement> StudentIDvalues;
    @FindBy (xpath="//id()='class ID']")  WebElement att_classID;
    @FindBy (xpath="//id()='studen ID']")  WebElement att_studentID;

    @FindBy (xpath="//a[text()='Present']")  WebElement att_PresentValue;

    //@FindBy(xpath="//*[@class='btn Attendence-present')")WebElement btnclickonPresent;
    //@FindBy(xpath="//*[@class='btn Attendence-absent')")WebElement btnclickonAbsent;
    @FindBy(xpath = "//*[contains(text(),'Showing x to y of z entries')]")
    WebElement paginatorText;
    @FindBy(xpath = "//li[@class='pagination-link next-link']")
    WebElement paginationControl;
    @FindBy(className = "sort-icon")
    WebElement sortIcon;
    @FindBy (xpath="//*[@class='sort classID']")  WebElement sortClass_btn;
    @FindBy (xpath="//*[@class='sort StudentID']")  WebElement sortStud_btn;
    @FindBy (xpath="//*[@class='sort present']")  WebElement sortAtten_btn;

    @FindBy(xpath ="//*[@class='count']" ) WebElement Counttheclass;

    //**************************Delete page POM*******************************************
    @FindBy(xpath = "//div[@class='alert alert-primary']")WebElement delete_alertMsg;
    @FindBy(xpath = "//*[@class='btn btn-yes']")WebElement yes_btn;
    @FindBy(xpath = "//*[@class='btn btn-no']")WebElement no_btn;
    @FindBy(xpath = "//div[@class='success']")WebElement successMsg;
    @FindBy(name = "closepopingup") WebElement close;

//****************navigation page  POM*******************************************
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


//***************************reference/attendance details page********************************

    @FindBy(xpath = "//div[@class='add_attendance']")WebElement add_attendancePage;
@FindBy(xpath="//input[@class='programName']")  WebElement att_programName;
    @FindBy(xpath="//input[@class='className']") WebElement att_className;
    @FindBy(xpath="//input[@class='studentName']")  WebElement att_studentName;
    @FindBy(xpath="//div[@class='dropdown show']/a[3]") WebElement att_select;
    @FindBy(className="day")List<WebElement> att_selectDate;
    @FindBy(xpath="//*[@id='cancel']") WebElement att_cancel;
    @FindBy(xpath="//*[@id='save']") WebElement att_save;


    //******************pagination page POM*********************
    @FindBy(xpath = "//li[@class='pagination-arrow next-link']")WebElement paginationEndArrow;


    //**********************Methods creation for Manage Attendance Page***************************

    public void verifyurl() {

        String actualurl = driver.getCurrentUrl();

        if (actualurl.contains("Attendance")) {
            System.out.println("user is in Attendance page");
        } else {
            System.out.println("user is in some other page");
        }

    }
    public void verifyTitle() {

        String actual_title = driver.getTitle();
        String expected_title = "Manage Attendance";
        Assert.assertEquals(actual_title, expected_title);

    }
    public void clickattendencebtn() {
        btnClickAttendence.click();

    }
    public void verify_head_atten(){

        String actual_text = driver.getTitle();
        String expected_text = "LMS- Learning Management System";
        Assert.assertEquals(actual_text, expected_text);

    }

    public void clickdeletebtn() {
        btnclickdel.click();

    }
    public void clickeditbtn() {
        btnclickedit.click();

    }
  public String att_text(String expectedmsg) {
    return att_text.getText();

}
//
    public String Message1(String expectedmsg) {
        return Message1.getText();

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
    public void deleteMultiplAttendnc_Btn() {}

//multiple button delete & multiple check box

    public void checkBox() {

        boolean checkboxValue = singlecheckbox.isSelected();

        if (checkboxValue = true) {
            System.out.println("checkbox is selected");
        } else {
            System.out.println("checkbox is not selected");
        }
    }
    public void multiplecheckbox() {

        multiplecheckbox.click();
    }

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
    public void spellingCheckatt() {

        Assert.assertEquals(att_text.getText(),"Manage Attendance");
        Assert.assertEquals(att_classID.getText(),"Class ID");
        Assert.assertEquals(att_studentID.getText(),"Student ID");
        Assert.assertEquals(att_PresentValue.getText(),"Present");

    }
    public int TotalClassCount() {

        List<WebElement> TotalClassList = Counttheclass.findElements(By.tagName("td"));

        int TotalnoofClasses = TotalClassList.size();

        return TotalnoofClasses;
    }
    public void paginationControl() {

        boolean PaginationValue = paginationControl.isDisplayed();

        if (PaginationValue = true) {
            System.out.println("pagination control is displayed");
        } else {
            System.out.println("pagination control is not displayed");
        }
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

//*************************validation of ID for attendance**************************
    public void search_ClassID(String ClassID) {
        searchBox.sendKeys(ClassID);
    }

    public void search_StudentID(String StudentID) {
        searchBox.sendKeys(StudentID);
    }

    public void search_Present(String Present) {
        searchBox.sendKeys(Present);
    }




//*********************pagination **************************************
    //Method to extract the total number of results retrieved from text shown in the pagination area
    public Integer resultTableDataSize() {
        String returnedRowsMsg = paginatorText.getText();
        return Integer.valueOf(returnedRowsMsg.split(" ")[5]);
    }

    public Integer currentPageNumber() {
        return Integer.valueOf(pageNumber.getText());
    }

    public void paginationText() {

        String actualText = paginatorText.getText();
        String test = paginatorText.getText();
        test = test.replaceAll("[^0-9]+", " ").trim();// this will replace all words with space and trim the space

        String[] element = test.split(" ");

        String expectedText = "Showing " + element[0] + " to " + element[1] + " of " + element[2] + " entries";

        assertEquals(expectedText, actualText);

    }
//**************************sorting
    public void sortAscending() {
        Actions action = new Actions(driver);
        for (WebElement HeaderValues : tableHeader) {

            if (HeaderValues.getText().equals("class Id")) {
                action.moveToElement(sortIcon).click();

            }
        }
    }

    public void sortDescending() {
        Actions action = new Actions(driver);
        for (WebElement HeaderValues : tableHeader) {

            if (HeaderValues.getText().equals("student Id")) {
                action.doubleClick(sortIcon).perform();

            }
        }
    }





//*****************************Delete Method Creation****************************************

    public boolean alertMessage() {
        return delete_alertMsg.isDisplayed();
    }

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

//


    public void DeleteButton() {
        //deleteBtn().click();
    }

    public Integer chkDeletedRow() {
        List<WebElement> deletedElements =driver.findElements((By) deletedElement);
        return deletedElements.size();
    }

    //******************************Navigation from attendance page*****************************
    public void clickProgram() {
        program_Link.click();
    }
    public void clickAssignment() {
        assignment_Link.click();

    }
    public void clickClass() {
        class_Link.click();

    }
    public void clickBatch() {
        batch_Link.click();
    }
    public void clickUser() {
        user_Link.click();
    }
    public void clickLogout() {
        logout_Link.click();
    }
    public void clickStudent() {
        student_Link.click();
    }

    public void verifyProgramTitle() {
        String actual_title = driver.getTitle();
        String expected_title = "Manage Program";
        Assert.assertEquals(actual_title, expected_title);
    }
    public void verifyStudentTitle() {
        String actual_title = driver.getTitle();
        String expected_title = "Manage Student";
        Assert.assertEquals(actual_title, expected_title);
    }

    public void verifyBatchTitle() {
        String actual_title = driver.getTitle();
        String expected_title = "Manage Batch";
        Assert.assertEquals(actual_title, expected_title);
    }

    public void verifyclassTitle() {
        String actual_title = driver.getTitle();
        String expected_title = "Manage Class";
        Assert.assertEquals(actual_title, expected_title);
    }
    public void verifyUserTitle() {
        String actual_title = driver.getTitle();
        String expected_title = "Manage User";
        Assert.assertEquals(actual_title, expected_title);
    }

    public void verifyAssignmentTitle() {
        String actual_title = driver.getTitle();
        String expected_title = "Manage Assignment";
        Assert.assertEquals(actual_title, expected_title);
    }

    public void verifyLoginTitle() {
        String actual_title = driver.getTitle();
        String expected_title = "Please login to LMS application";
        Assert.assertEquals(actual_title, expected_title);
    }

//***************checking for drop down in reference*********************************

    //**********Add attendance*******************************

    public void Enter_Valid_SheetInputs(String Sheetname, int Rownumber) throws IOException, InvalidFormatException,
            InterruptedException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {

        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> TestData = reader.getData(excelPath, Sheetname);
        ProgramName = TestData.get(Rownumber).get("ProgramName");
        ClassName = TestData.get(Rownumber).get("ClassName");
        StudentName = TestData.get(Rownumber).get("Student Name");
        Attendance = TestData.get(Rownumber).get("Attendance");
        Attendance_date = TestData.get(Rownumber).get("Attendance date");
        changeclassname = TestData.get(Rownumber).get(" changeclassnameDescription");
        changestudentname = TestData.get(Rownumber).get("changestudentname");
        changeattendance = TestData.get(Rownumber).get("changeattendance");
        searchedField = "Batch Id";
        searchedValue = TestData.get(Rownumber).get("Batch Id") ;
    }


    public void saveClick() {
        att_save.click();
    }
    public void cancelClick() {
        att_cancel.click();
    }

   // public boolean alertMesg() {
        //return att_FieldalertMsg.isDisplayed();
   // }
    public void datePicker() {

        for (WebElement cell : att_selectDate) {

            String date = cell.getText();
            if (date.equals(att_selectDate)) {
                cell.click();
            }

        }

    }

    public boolean program_DropdownDisplayed() {
        return att_programName.isDisplayed();
    }
    public boolean class_DropdownDisplayed() {
        return att_className.isDisplayed();
    }
    public boolean student_Displayed() {
        return att_studentName.isDisplayed();
    }
    public boolean attendance_Displayed() {
        return att_select.isDisplayed();
    }

    public boolean saveBtnDisplayed() {
        return att_save.isDisplayed();
    }

    public boolean cancelBtnDisplayed() {
        return att_cancel.isDisplayed();
    }
    public boolean closeBtnDisplayed() {
        return closeButton.isDisplayed();
    }

//**************************edit attendance***************











}



