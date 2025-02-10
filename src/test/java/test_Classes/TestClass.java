//package test_Classes;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import pomClasses.Homepage;
//import pomClasses.LoginPage;
//public class TestClass
//{
//public static void main(String[] args) throws InterruptedException
//{
//System.setProperty("WebDriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//	
//	WebDriver driver = new ChromeDriver();
//	
//	driver.manage().window().maximize();
//	
//	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	
//	//Verify login functionality
//	
//	LoginPage login = new LoginPage(driver);
//	login.sendUserName();
//	login.sendPassword();
//	login.clickonButton();
//	
//	Homepage home = new Homepage(driver);
//	home.verifyAdminTab();
////	home.verifyPTMTab();
////	home.verifyLeaveTab();
//	
//	
//}
//}
