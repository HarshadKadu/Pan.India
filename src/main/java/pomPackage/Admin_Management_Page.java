package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Admin_Management_Page 
{
	static WebDriver driver;
	  WebDriverWait wait;
	  
	  @FindBy(xpath="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
	  private WebElement name;
	  
//	  @FindBy (xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
//		private WebElement Send;
//	  
//	  @FindBy(xpath="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
//	  private WebElement Ck;
	  
	  
	  
//	  public boolean sendUserNameAdmin()
//	  {
//	  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")));
//	  name.sendKeys("Harshad");
//	return true;
//	  }
	  
//	  public void selectUserRole()
//	  {
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")));
//		  
//		  Ck.click();
//		  
//		  Select dropdown = new Select(Ck);
//		  dropdown.selectByValue("class='oxd-grid-item oxd-grid-item--gutters'[2]");
//	  }
	  
	  
	  public boolean sendEmployeeName()
	  {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")));
			  name.sendKeys("Admin");
			return true;
	  }
	  
	  
	  public Admin_Management_Page(WebDriver driver)
		{
			 wait = new  WebDriverWait(driver, Duration.ofSeconds(10));
			 this.driver=driver;
			PageFactory.initElements(driver, this);
		}
}
