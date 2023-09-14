package pages;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import constants.Constants;
import utilities.Loggerload;
import webdriver_manager.DriverManager;


public class Program_POM {
	
		  WebDriver driver;
		
		//homepage
		 @FindBy(xpath = ("//a[text()='Program']")) WebElement lnkprogram;
		 @FindBy(xpath = ("//a[text()='Student']")) WebElement lnkstudent;	
		 @FindBy(xpath = ("//a[text()='Batch']")) WebElement lnkbatch;
		 @FindBy(xpath = ("//a[text()='Class']")) WebElement lnkclass;
		 @FindBy(xpath = ("//a[text()='User']")) WebElement lnkuser;
		 @FindBy(xpath = ("//a[text()='Assignment']")) WebElement lnkassignment;
		 @FindBy(xpath = ("//a[text()='Attendance']")) WebElement lnkattendance;
		 @FindBy(xpath = ("//a[text()='Logout']")) WebElement lnklogout;
		 
		//Programpage
		
		 @FindBy(xpath = ("//a[text()='Manage Program']")) WebElement textmanageprogram;
		 @FindBy(id = "id_search") WebElement txt_search;
		// @FindBy(xpath = ("//button[@type='delete multiple button']")) WebElement delmultiplebtn;
		 @FindBy(xpath = ("//button[@type='edit button']")) WebElement edit_onrightbtn;
		 //@FindBy(xpath = ("//button[@type='delete button']")) WebElement delete_onrightbtn;
		 @FindBy(xpath = "//*[contains(text(),'Showing x to y of z entries')]") WebElement paginationText;
		 @FindBy(xpath = "//*[contains(text(),'In total there are number of programs')]") WebElement footerText;
		 
		    @FindBy(xpath = "//table[contains(@id,’Assignment’)/tr[0]/th")List<WebElement> tableHeader;
		    @FindBy(xpath = "//table//thead//tr")List<WebElement> allRows;
			@FindBy(xpath = "//table//thead//tr//td")WebElement allColoumns;
			@FindBy(xpath = "//table//thead//tr//td[1]")public List<WebElement> programtnamevalues;
			@FindBy(xpath = "//table//thead//tr//td[2]")public List<WebElement> programdescriptionvalues;
			@FindBy(xpath = "//table//thead//tr//td[3]")public List<WebElement> programstatusValues;
			@FindBy(className = "sort-icon")WebElement sortIcon;
			@FindBy(xpath = "//*[@id='table']/tbody/tr/td[1]") WebElement programname;
		    @FindBy(xpath = "//*[@id='table']/tbody/tr/td[2]") WebElement programdescription;
			@FindBy(xpath = "//*[@id='table']/tbody/tr/td[3]") WebElement programstatus;
			@FindBy(xpath = "//li[@class='pagination-link next-link']")WebElement paginationControl;
			
		 //addprogram
		// @FindBy(id = "id_Name") WebElement program_Name;
		 //@FindBy(id = "id_Description")WebElement program_Description;
		 //@FindBy(xpath = ("//button[@type='Active']")) WebElement activeradioebtn;
		 //@FindBy(xpath = ("//button[@type='Inactive']")) WebElement inactiveradiobtn;
		 @FindBy(xpath = ("//button[@type='Save button']")) WebElement savebtn;
		 @FindBy(xpath = ("//button[@type='Cancel button']")) WebElement cancelbtn;
		 @FindBy(xpath = ("//button[@type='Cancel button']")) WebElement closebtn;
		 @FindBy(xpath="div//div//a ") WebElement errormsg;
	     @FindBy(id = "successMessage") WebElement successmsg;
		 
		 
		 //deleteprogram 
		/* @FindBy(xpath = ("//button[@type='Yes button']")) WebElement yesbtn;
		 @FindBy(xpath = ("//button[@type='No button']")) WebElement nobtn;
		 @FindBy(xpath = ("//button[@type='delete multiple button']")) WebElement delmultiplebtn;
		 @FindBy(xpath = ("//button[@type='delete button']")) WebElement delete_onrightbtn; 
		 @FindBy(xpath = "//input[@type='Program Name']")WebElement program_name;
		 @FindBy(xpath = "//div[@class='alert alert-primary']")WebElement delete_alertMsg;
		 @FindBy(xpath = "//div[@class='success']")WebElement successMsg;
		 @FindBy(xpath = "//input[@type='text']")WebElement searchBox;
		 @FindBy(xpath = "//table//thead//tr//th//input")WebElement checkbox;
		 @FindBy(xpath = "//table//thead//tr//th//input")WebElement multiCheckbox;
		 @FindBy(xpath = "//*[@class='btn btn-sort']")WebElement sort_btn;
		 @FindBy(xpath = "//div[@class='delete']")WebElement deleteAlertPage;
		 @FindBy(xpath = "//div[@class='delete_element']")WebElement deletedElement;*/

		 

		 public void clickonprogram() {

			 lnkprogram.click();
				LOGGER.info("Admin clicked on program link");   
			}
		 
		 public void urlwith_manageprogram() {
		 String actualurl = driver.getCurrentUrl();
			if (actualurl.contains("Program")) {
				System.out.println("Admin is in Manage program page");
			} else {
				System.out.println("Admin is not in Manage Program page");
			}
		 }
		 
		 public void headingwith_manageprogram() {
		 String actualTitle = driver.getTitle();
		 if(driver.getTitle().contains("Manage Program")) {
			    
			    System.out.println("Page heading contains Manage Program ");
		 }else
		 {
			    System.out.println("Page heading  doesn't contains Manage Program");}
		 }
		 
		 public void manageprogramisdisplayed() {
			 textmanageprogram.isDisplayed();
				LOGGER.info("Admin able to see the Manage Program");
		 }
		 
		 public void NewprogramButton() {

				boolean NewprogramValue = textmanageprogram.isDisplayed();
				if (NewprogramValue = true) {
					System.out.println("+A New Program Button is displayed");
				} else {
					System.out.println("+A New Program Button is not displayed");
				}
			}
		 
		 public void searchBox() {

				boolean searchValue = searchBox.isDisplayed();
				if (searchValue = true) {
					System.out.println("searchbox is displayed");
				} else {
					System.out.println("searchbox is not displayed");
				}
		 }
				
				public void editBtn() {

					boolean editBtnValue = edit_onrightbtn.isDisplayed();
					if (editBtnValue = true) {
						System.out.println("editButton on right is displayed");
					} else {
						System.out.println("editButton on right is not displayed");
					}
				}
				
				public void deleteBtn() {
					boolean deleteBtnValue = delete_onrightbtn.isDisplayed();
					if (deleteBtnValue = true) {
						System.out.println("deleteButton on right is displayed");
					} else {
						System.out.println("deleteButton on right is not displayed");
					}
				}
				
				public void checkBox() {

					boolean checkboxValue = checkbox.isDisplayed();
					if (checkboxValue = true) {
						System.out.println("checkbox is displayed");
					} else {
						System.out.println("checkbox is not displayed");
					}
				}
				public void deletemultiplebutton() {
					
					boolean deleteBtnValue = delmultiplebtn.isDisplayed();
				
					if (deleteBtnValue = true) {
						System.out.println("delete multiple Button on left is displayed");
					} else {
						System.out.println("delete multiple button on left is not displayed");
					}
					if(delmultiplebtn.isEnabled())
					  {
					   System.out.print("delete multiple Button on left is enabled.");
					  }
					  else
					  {
					   System.out.print("delete multiple Button on left is disabled");
					  }
					
				}
				
				public void footerText() {
					
					String actualText = footerText.getText();
					String value =footerText.getText();
					value= value.replaceAll("[^0-9]+", " ").trim();
					String expectedText = "In total there are" + value + "of programs";
					assertEquals(expectedText, actualText);
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

					String actualText = paginationText.getText();
					String test = paginationText.getText();
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
				
				
				public void headerValidation() {

					List<String> expectedHeaders = Arrays.asList("check box symbol", "Program name", "Program description",
							"Program Status", "Edit"," Delete");
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
				
				
	//Navigation Validation from Manage Program to other Pages

	public void navigatetostudent() {
		lnkstudent.click();
		LOGGER.info("Admin navigated to Student Page");   
	}

	public void navigatetobatch() {
		lnkbatch.click();
		LOGGER.info("Admin navigated to Batch Page");   
	}

	public void navigatetoclass() {
		lnkclass.click();
		LOGGER.info("Admin navigated to Class Page");   
	}

	public void navigatetouser() {
		lnkuser.click();
		LOGGER.info("Admin navigated to User Page");   
	} 
	public void navigatetoassignment() {
		lnkassignment.click();
		LOGGER.info("Admin navigated to Assignment Page");   
	}
	public void navigatetoattendance() {
		lnkattendance.click();
		LOGGER.info("Admin navigated to Attendance Page");   
	}
	public void navigatetologout() {
		lnklogout.click();
		LOGGER.info("Admin navigated to Logout Page");   
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
	public void verifyClassTitle() {
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
	public void verifyAttendanceTitle() {
	    	String actual_title = driver.getTitle();
			String expected_title = "Manage Attendance";
			Assert.assertEquals(actual_title, expected_title);	
	}
	public void verifyLogoutTitle() {
		String actual_title = driver.getTitle();
		String expected_title = "Manage Logout";
		Assert.assertEquals(actual_title, expected_title);	
	}

	//program page

	@FindBy(xpath="input[type='text']")List<WebElement> textBoxes;
	@FindBy(xpath = "//a[text()=Assignment Details")WebElement programDetails;

  public void newprogramButtonClick() {
		textmanageprogram.click();
	}

	public void popWindowTitle() {
		String actualTitle = programDetails.getText();
		String expectedTitle = "Program Details";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	public void noOfTextBoxes() {
		int actualTextboxes = textBoxes.size();
		int expectedTextboxes = 2;
		assertEquals(expectedTextboxes, actualTextboxes);
		}
	
	public void noOfradiobuttons() {
		int actualTextboxes = radiobuttons.size();
		int expectedTextboxes = 2;
		assertEquals(expectedTextboxes, actualTextboxes);
		}

	

	//searchbox
	@FindBy(xpath = "//input[@type='text']")WebElement searchBox;
	@FindBy(id = "id_search") WebElement txt_search;
	@FindBy(id = "searchBtn")WebElement searchBtn;

	public void enterprogramnameinsearchbox() {
		String programnamevalue;
	searchBox.sendkeys(programnamevalue);
	}
	public void enterprogramdescriptioninsearchbox() {
		String programdescriptionvalue;
	searchBox.sendkeys(programdescriptionvalue);
	}
	public void enterprogramstatusinsearchbox() {
		String programstatusvalue;
	searchBox.sendkeys(programstatusvalue);
	}

	public void enterinvalidtext() {
		
	String invalidtext;
		searchBox.sendkeys(invalidtext);
	}
	
	public void verifySearchResultProgramName() throws Exception {
		Select se = new Select(programnamevalues);
	    ArrayList<String> originalList = new ArrayList<String>();
		  ArrayList<String> result = new ArrayList<String>();

		  for (WebElement e : se.getOptions()) {
		   originalList.add(e.getText());
		   result.add(e.getText());
		   String searchstring;
		  searchBox().click();
		   searchBox().sendkeys();
		   
		   for (int i = 0; i < result.size(); i++) {
				String temp = result.get(i);
				if ((temp.toLowerCase().contains(searchString.toLowerCase()))) {
		
				System.out.println("searched program name found");}
	}
		  }}

	public void verifySearchResultProgramDesc() throws Exception {
		Select se = new Select(programdescriptionvalues);
	    ArrayList<String> originalList = new ArrayList<String>();
		  ArrayList<String> result = new ArrayList<String>();

		  for (WebElement e : se.getOptions()) {
		   originalList.add(e.getText());
		   result.add(e.getText());
		   String searchstring;
		    searchBox().click();
		   searchBox().sendkeys(searchstring);
		 
		   for (int i = 0; i < result.size(); i++) {
				String temp = result.get(i);
				if ((temp.toLowerCase().contains(searchString.toLowerCase()))) {
		
				System.out.println("searched program Description found");}
	}
		
		  }	
	}

	public void verifySearchResultProgramStatus() throws Exception {
		Select se = new Select(programstatusvalues);
	    ArrayList<String> originalList = new ArrayList<String>();
		  ArrayList<String> result = new ArrayList<String>();

		  for (WebElement e : se.getOptions()) {
		   originalList.add(e.getText());
		   result.add(e.getText());
		   String searchstring;
		    searchBox().click();
		   searchBox().sendkeys(searchstring);
		 
		   for (int i = 0; i < result.size(); i++) {
				String temp = result.get(i);
				if ((temp.toLowerCase().contains(searchString.toLowerCase()))) {
		
				System.out.println("searched program status found");}
	}
		
		  }		
	}
	public void verifynosearchresultsforinvalid()
	{
	system.out.println("No searched items found");
	}

	//total no of rows 

			public void noOfRows(int rows_count) {
				rows_count = programtablerow.size();
			System.out.println("No of rows in Program Table" + rows_count);
			}

			 //addprogram
			 
			//add program
			public void setProgramName() {
				Loggerload.info("Enter Program Name");
				Program_Name.click();
				program_Name.clear();
				program_Name.sendKeys(Name);
			}

			public void setProgramDescription() {
				Loggerload.info("Enter description for program ");
				program_Description.click();
				program_Description.clear();
				program_Description.sendKeys(Description);
			}

			public void setstatusbutton() {
				activeradioebtn.click();
			}
				
				public void clicksaveButton() {
					
					savebtn.click();
				}

				public void clickCancelButton() {
					
					cancelbtn.click();
				}

				public void verifyWindowClose() {
					
					assertEquals(driver.getCurrentUrl(), "Manage Program page URL");
				}

				public void verifyProgramPage() {
					
					assertEquals(driver.getCurrentUrl(), "Manage Program page URL");
				}

				public void verifyMsg(String message) {
					WebElement errorMessage = new WebDriverWait(driver, Duration.ofSeconds(30))
							.until(ExpectedConditions.visibilityOfElementLocated(errormsg));
					Loggerload.error(errorMessage.getText());
					assertEquals(errorMessage.getText(), message);

				}

				public String getsuccessmsg() {
					WebElement successMessage = new WebDriverWait(driver, Duration.ofSeconds(30))
							.until(ExpectedConditions.visibilityOfElementLocated(successmsg));
					Loggerload.error(successMessage.getText());
					return successMessage.getText();
				}	
			
			}
			
			
		//Edit Program 
			
			 @FindBy(xpath = ("//button[@type='edit button']")) WebElement edit_onrightbtn;
			 @FindBy(id="yes button") WebElement yesbtn;
			 @FindBy(linkText="no button") WebElement nobtn;
			 @FindBy(id = "updatedMsg")WebElement updatedMsg;
			 
			public void clickEditButton() {
				edit_onrightbtn.click();

			}

			public void verifyUpdatedMsg(String msg) {
	          assertEquals(updatedMsg.getText(), msg);
			}

		public void updateprogramname()
		{
			Program_Name.clear();
		    Program_Name.sendkeys();
		}
		public void updateprogramdescription()
		{
			Program_Description.clear();
		    Program_Description.sendkeys();
		}
		public void updatestatusbutton() {
			activeradioebtn.click();
			
		}
			public void clicksaveButton() {
				
				savebtn.click();
			}

			public void clickCancelButton() {
				
				cancelbtn.click();
			}
		
			public void verifyWindowClose() {
				
				assertEquals(driver.getCurrentUrl(), "Edit Program page URL");
			}
			
			Public void enterinvalid() {
				Program_Description.sendkeys(invalid);
				Program_Name.sendkeys(invalid);
			}
			
			public void verifyMsg(String message) {
				WebElement errorMessage = new WebDriverWait(driver, Duration.ofSeconds(30))
						.until(ExpectedConditions.visibilityOfElementLocated(errormsg));
				Loggerload.error(errorMessage.getText());
				assertEquals(errorMessage.getText(), message);}
		
			
	//delete
	@FindBy(xpath = "//*[@class='btn btn-right_arrow']")WebElement right_arrow_btn;
	@FindBy(xpath = "//*[@class='btn btn-left_arrow']")WebElement left_arrow_btn;
	@FindBy(xpath = ("//button[@type='Yes button']")) WebElement yes_btn;
	@FindBy(xpath = ("//button[@type='No button']")) WebElement no_btn;
	@FindBy(xpath = ("//button[@type='delete multiple button']")) WebElement delmultiplebtn;
	@FindBy(xpath = ("//button[@type='delete button']")) WebElement delete_onrightbtn; 
	@FindBy(xpath = "//input[@type='Program Name']")WebElement program_name;
	@FindBy(xpath = "//div[@class='alert alert-primary']")WebElement delete_alertMsg;
	@FindBy(xpath = "//div[@class='success']")WebElement successMsg;
	@FindBy(xpath = "//input[@type='text']")WebElement searchBox;
	@FindBy(xpath = "//table//thead//tr//th//input")WebElement checkbox;
	@FindBy(xpath = "//table//thead//tr//th//input")WebElement multiCheckbox;
	@FindBy(xpath = "//*[@class='btn btn-sort']")WebElement sort_btn;
	@FindBy(xpath = "//div[@class='delete']")WebElement deleteAlertPage;
	@FindBy(xpath = "//div[@class='delete_element']")WebElement deletedElement;


	public void DeleteButton() {
		delmultiplebtn.click();
		}

	public Integer chkDeletedRow() {
		List<WebElement> deletedElements =driver.findElements((By) deletedElement);
		return deletedElements.size();
	}


	public void DeleteButtonRight() {
		
		delete_onrightbtn.click();
			
	}

	// method to get the alert message
	public boolean confimalertMessage() {
		return delete_alertMsg.isDisplayed();
	}	

	public boolean deleteAlertWindow() {
		return deleteAlertPage.isDisplayed();
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
	// Verify the title of the page
	public String verifyverifyDeleteWindowPageTitle() {
	assertEquals(driver.getTitle(), "Delete");
	}

	public void singleChkBox() {
		checkbox.click();
	}

	public void multipleChkBox() {
		multiCheckbox.click();
	}
	public void deleteEnabled() {
		delmultiplebtn.isEnabled();
	}

	public void tickChkBox() {
		checkbox.isSelected();
	}

	public void tickMultiChkBox() {
		multiCheckbox.isSelected();
	}

	public void isPrgmNameDeleted() throws Exception {
		
		Select se = new Select(programnamevalues);
	    ArrayList<String> originalList = new ArrayList<String>();
		  ArrayList<String> result = new ArrayList<String>();

		  for (WebElement e : se.getOptions()) {
		   originalList.add(e.getText());
		   result.add(e.getText());
		   String searchstring;
		   searchBox().click();
		   searchBox().entertext(searchstring);
		   for (int i = 0; i < result.size(); i++) {
				String temp = result.get(i);
				if ((temp.toLowerCase().contains(searchString.toLowerCase()))) {
		
					System.out.println("Deleted program found");
					return true;
				} else {System.out.println("Deleted program not found");
					return false;
					
				}
			}}}

	public void verifyPrgmNameExist() throws Exception {
		Select se = new Select(programnamevalues);
	    ArrayList<String> originalList = new ArrayList<String>();
		  ArrayList<String> result = new ArrayList<String>();

		  for (WebElement e : se.getOptions()) {
		   originalList.add(e.getText());
		   result.add(e.getText());
		   String searchstring;
		   String searchstring2;
		   searchBox().click();
		   searchBox().sendkeys(searchstring);
		   searchBox().sendkeys(searchstring2);
		   for (int i = 0; i < result.size(); i++) {
				String temp = result.get(i);
				if ((temp.toLowerCase().contains(searchString.toLowerCase()))) {
		
				System.out.println("Deleted program found");}
				if ((temp.toLowerCase().contains(searchString2.toLowerCase()))) {
					
					System.out.println("Deleted program found");}
					
		   }
		  }
	}

	//pagination

	// sorting

		@FindBy(xpath = "//*[@id='table']/tbody/tr/td[1]") WebElement programname;
	    @FindBy(xpath = "//*[@id='table']/tbody/tr/td[2]") WebElement programdescription;
		@FindBy(xpath = "//*[@id='table']/tbody/tr/td[3]") WebElement programstatus;
		@FindBy(className = "sort-icon")WebElement sortIcon;
		@FindBy(xpath = "//*[@id='table']/thead/tr/th[1]")WebElement sortBtn_ProName;
		 @FindBy(xpath = "//*[@id='table']/thead/tr/th[2]")WebElement sortBtn_ProDesc;
		 @FindBy(xpath = "//*[@id='table']/thead/tr/th[4]")WebElement sortBtn_ProStatus;
		 @FindBy(xpath = "//section[//*[@id='table']]")WebElement tableContainer;
		 
		// assertTrue(Ordering.isOrdered(result)); Checks for natural(ascending) order
		 //assertTrue(Ordering.reverse().isOrdered(result)); //Checks for descending order
		 
		
		      public void clickOnSortBtn_Name() {
					sortBtn_ProName.click();
				}

				public void clickOnSortBtn_Desc() {
					//Loggerload.info("Admin/User/Staff Clicks on Program Description Sorting Arrow");
					sortBtn_ProDesc.click();
				}

				public void clickOnSortBtn_Status() {
					//Loggerload.info("Admin/User/Staff Clicks Program Status Sorting Arrow");
					sortBtn_ProStatus.click();
				}

				// Ascending order
				public void verifyASCOrder_Name() {
					
					Select se = new Select(programnamevalues);
	                  ArrayList<String> originalList = new ArrayList<String>();
					  ArrayList<String> result = new ArrayList<String>();

					  for (WebElement e : se.getOptions()) {
					   originalList.add(e.getText());
					   result.add(e.getText());
					  }
	                  assertTrue(Ordering.isOrdered(result));
					  sysytem.out.println("Admin see the result in Ascending order")
				}

				public void verifyASCOrder_Desc() {
					Select se = new Select(programdescriptionvalues);
	                ArrayList<String> originalList = new ArrayList<String>();
					  ArrayList<String> result = new ArrayList<String>();

					  for (WebElement e : se.getOptions()) {
					   originalList.add(e.getText());
					   result.add(e.getText());
					  }
	                assertTrue(Ordering.isOrdered(result));
					sysytem.out.println("Admin see the result in Ascending order")
					
				}

				public void verifyASCOrder_Status(verifyASCOrder_Status()) {
					Select se = new Select(programstatusvalues);
	                ArrayList<String> originalList = new ArrayList<String>();
					  ArrayList<String> result = new ArrayList<String>();

					  for (WebElement e : se.getOptions()) {
					   originalList.add(e.getText());
					   result.add(e.getText());
					  }
	                assertTrue(Ordering.isOrdered(result));
					sysytem.out.println("Admin see the result in Ascending order")
					
				}

				// descending order
				public void verifyDESCOrder_Name() {
					Select se = new Select(programnamevalues);
	                ArrayList<String> originalList = new ArrayList<String>();
					  ArrayList<String> result = new ArrayList<String>();

					  for (WebElement e : se.getOptions()) {
					   originalList.add(e.getText());
					   result.add(e.getText());
					  }
					  assertTrue(Ordering.reverse().isOrdered(result));
					  sysytem.out.println("Admin see the result in Ascending order")
				}	
				

				public void verifyDESCOrder_Desc() {
					Select se = new Select(programdescriptionvalues);
	                ArrayList<String> originalList = new ArrayList<String>();
					  ArrayList<String> result = new ArrayList<String>();

					  for (WebElement e : se.getOptions()) {
					   originalList.add(e.getText());
					   result.add(e.getText());
					  }
					  assertTrue(Ordering.reverse().isOrdered(result));
					sysytem.out.println("Admin see the result in Ascending order")
				}

				public void verifyDESCOrder_Status() {
					Select se = new Select(programstatusvalues);
	                ArrayList<String> originalList = new ArrayList<String>();
					  ArrayList<String> result = new ArrayList<String>();

					  for (WebElement e : se.getOptions()) {
					   originalList.add(e.getText());
					   result.add(e.getText());
					  }
					  assertTrue(Ordering.reverse().isOrdered(result));
					sysytem.out.println("Admin see the result in Ascending order")	
				}
				
				
				@FindBy(xpath = "//li[@class='pagination-link next-link']")WebElement paginationControl;
			    @FindBy(className = "paginate_button current")WebElement currentPageNumber;
				 @FindBy(id = "nextPgBtn")WebElement nextPgBtn;
				 @FindBy(id = "prevPgBtn")WebElement prevPgBtn;
				 @FindBy(id = "firstPgBtn")WebElement firstPgBtn;
				 @FindBy(id = "lastPgBtn")WebElement lastPgBtn;
				 @FindBy(id = "PgText")WebElement pgText;
				 
	//pagenation
				
				public void verifyPaginatorText(String paginator) {
					//Loggerload.info("Admin/User/Staff see the paginator Text");
					paginationControl.getText();
					assertEquals(paginationControl.getText(), paginator);
				}
				
	      
				public void verifyPaginatorTextafter(string message) {
					
					verifyElementText(message, lastPgBtn);
				}

				public void clickNextPage() throws Exception {
					
				nextPgBtn.click();
				}

				public void clickPrevPage() throws Exception {
					
					prevPgBtn.click();
				}

				public void clickFirstPage() throws Exception {
				
					firstPgBtn.click();
				}

				public void clickLastPage() throws Exception {
				
					lastPgBtn.click();
				}

				public void verifyCurrentPageNumber(String pageNum) {
		
					assertEquals(currentPageNumber.getText(), pageNum);
				}

				public void verifyPage() {
					
					assertEquals(driver.getCurrentUrl(), "URL");
				}
				
				public void disableLastPageArrow() {

					String lastarrowbtn = lastPgBtn.getAttribute("Program");

					if(lastarrowbtn.contains("disable")) {
						System.out.println("User is on last page");
					}
					else {
						System.out.println("User is not on last page");
					}
				}
				


}
