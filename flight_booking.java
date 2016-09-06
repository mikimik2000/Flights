package Flight_Reservation;

import org.testng.annotations.Test;

import page.classes.HomePage;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class flight_booking {
	private WebDriver driver;
	private String baseUrl;
	
  @BeforeClass
  public void beforeClass() {
	    driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(baseUrl);
  
  }	
  
	
	
  @Test
  public void fillBasicInfo() {
	  HomePage.navigatetoflightstab(driver);
	  HomePage.fillOriginTextBox( driver, "Chicago");
	  HomePage.fillDestinationTextBox(driver, "Dallas");
	  HomePage.fillDepartureDateTextBox(driver, "12/25/2016");
	  HomePage.fillReturnDateTextBox(driver, "12/30/2016");
	  
  }
  
  @Test
  public void fillinAdvanceInfo (){
	  HomePage.clickOnAdvancedLink(driver);
	  HomePage.clickNonStopcheckBox(driver);
      HomePage.selectFlightClass(driver, "Economy/Coach");
      HomePage.clickOnSearchButton(driver);
	  
  }
  

  @AfterClass
  public void afterTest() {
//	  driver.quit();
  }

}
