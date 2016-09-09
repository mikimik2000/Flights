package extendedreports;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Login_Test {
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	
  
  @BeforeClass
  public void beforeClass() {
	  baseUrl = "http://the-internet.herokuapp.com/login";
	  report = new ExtentReports("C:\\Users\\natalie pinky\\Desktop\\logintest.html");
	  test = report.startTest("Verify Login Test");
	  driver = new FirefoxDriver();
	  test.log(LogStatus.INFO, "Browser Started...");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(baseUrl);
	  test.log(LogStatus.INFO, "Web application opened");
	  
	  
  }
  
  
  @Test
  public void test1_validLoginTest(){
	  
	  WebElement UsernameLink = driver.findElement(By.id("username"));
	  UsernameLink.sendKeys("tomsmith");
	  test.log(LogStatus.INFO, "Enter Username");
	  
	  WebElement passwordField = driver.findElement(By.id("password"));
	  passwordField.sendKeys("SuperSecretPassword!");
	  test.log(LogStatus.INFO, "Enter password");
	  
	  WebElement loginButton = driver.findElement(By.id("login"));
	  loginButton.submit();
	  test.log(LogStatus.INFO, "Click LoginButton");
	  
	  Assert.assertTrue(driver.findElement(By.cssSelector(".flash.success")).isDisplayed());
	  test.log(LogStatus.PASS, "Verified login details");
	  
	  
	  
			  
			  
  }

 
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
	  report.endTest(test);
	  report.flush();
  }

}
