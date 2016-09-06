package page.classes;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HomePage {
	public static WebElement element = null;
	static Logger log = Logger.getLogger(HomePage.class);
	
	/**
	Returns the flight origin text box element
	@param driver
	@return
	*/
	public static WebElement originTextBox(WebDriver driver){
	element= driver.findElement(By.id("flight-origin"));
	log.info("origin text box element found");
	return element;
	}
	
	public static void fillOriginTextBox(WebDriver driver, String origin){
		element= originTextBox(driver);
		element.sendKeys(origin);
		log.info("Enter origin city as" + origin);
		
	}
	public static WebElement destinationTextBox(WebDriver driver){
		element=driver.findElement(By.id("flight-destination"));
		log.info("Destination text box element found");
		return element;
	}	
	
	public static void fillDestinationTextBox(WebDriver driver, String destination){
		element= destinationTextBox(driver);
		element.sendKeys(destination);
		log.info("Enter destination city as " + destination);
	}
	
	public static WebElement departureDateTextBox(WebDriver driver){
		element=driver.findElement(By.id("flight-departing"));
		return element;
	}
	
	public static void fillDepartureDateTextBox(WebDriver driver, String date){
		element= departureDateTextBox(driver);
		element.sendKeys(date);
		log.info("Enter departure date as" + date);
		
	}
	
	public static WebElement returnDateTextBox(WebDriver driver){
		element= driver.findElement(By.id("flight-returning"));
		return element;
		
	}	
		
	public static void fillReturnDateTextBox(WebDriver driver, String date){
		element= returnDateTextBox(driver);
		element.clear();
		element.sendKeys(date);
		log.info("Enter return date as" + date);
		
		
	}
	
	public static WebElement searchButton(WebDriver driver){
		element= driver.findElement(By.id("search-button"));
		return element;
	}
	
	public static void clickOnSearchButton(WebDriver driver){
		element= searchButton(driver);
		element.click();
		
	}
	
	public static void navigatetoflightstab(WebDriver driver){
		driver.findElement(By.id("header-history")).click();
		element= driver.findElement(By.id("tab-flight-tab"));
		element.click();
	}
		
	public static void clickOnAdvancedLink(WebDriver driver){
		element= driver.findElement(By.id("advanced-options"));
		element.click();
		log.info("Clicked on Advanced Options Link");
	}
		
	public static void clickNonStopcheckBox(WebDriver driver){	
		element= driver.findElement(By.id("advanced-flight-nonstop"));
		element.click();
		log.info("Clicked non-stop check box");
	}
	
	public static void selectFlightClass(WebDriver driver, String flightClass){
		Select options = new
		Select (driver.findElement(By.id("flight-advanced-preferred-class")));
		options.selectByVisibleText(flightClass);
		log.info("select flight class as" + flightClass);
		
	
		}
	
	
	}
	
			
			
			


