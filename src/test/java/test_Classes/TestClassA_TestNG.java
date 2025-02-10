package test_Classes;


import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pomPackage.Admin_Management_Page;
import pomPackage.Homepage;
import pomPackage.LoginPage;
import utility.Pojo_Class;


public class TestClassA_TestNG<Admin> extends Pojo_Class
{
	WebDriver driver;

	
	
@BeforeClass
public void beforeclass()
{
WebDriver driver = openBrowser();
 this.driver=driver;
}


@Test(priority=0)

public void verifyLoginPage() 

{
	
LoginPage login = new LoginPage(driver);
	login.sendUserName();
	login.sendPassword();
	login.clickonButton();
	
	String ActualURL = driver.getCurrentUrl();
	
	System.out.println(ActualURL);
	
	String ExceptedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	Assert.assertEquals(ExceptedURL, ActualURL);
	
	

}

//@Test(priority=1)
//
//public void verifyHomePage() throws InterruptedException
//{
//	Homepage home = new Homepage(driver);
//	
//	boolean result = home .verifyAdminTab();
//	
//	Assert.assertTrue(result);
//	
	//home.verifyAdminTab();
	
//	home.verifyPTMTab();
//	 
//	home.verifyLeaveTab();
//	
//	home.verifyTimeTab();
//	
//	home.verifyRecruitmentTab();
//	
//	home.verifyMy_InfoTab();
//	
//	home.verifyPerformansTab();
//	
//	home.verifyDashboardTab();
//	
//	home.verifyDirectoryTab();
//	
//	home.verifyMaintanenceTab();
//	
//	home.verifyClaimTab();
//	
//	home.verifyBuzzTab();

//}

//@Test(priority=2)
//
//public void sendName()
//{
//	Admin_Management_Page send = new Admin_Management_Page(driver);
//	
//	boolean result =send.sendUserNameAdmin();
//	
//	Assert.assertTrue(result);
//}

//@Test()
//	
//public void selectUserRole() throws InterruptedException
//{
//	WebElement dropdown = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
//	Select dropdownroll = new Select(dropdown);
//	
//	dropdown.click();
//	Thread.sleep(3000);
//	dropdownroll.selectByValue("class='oxd-grid-item oxd-grid-item--gutters'[2]");
//	
//	
//}

   
    



	
	









//@Test
//
//public void screenshot() throws IOException
//{
//	ScreenShot.captureScreenShot(driver);
//	
//	System.out.println("Sucessfully captured screenshot");
//	
//}







@AfterClass
   public void afterclass()
   {
	
   }



}
