package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadTestCase {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/main");
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("demosalesmanager");
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("crmsfa");
        WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
        loginButton.click();
        WebElement crmsfaLink = driver.findElementByLinkText("CRM/SFA");
        crmsfaLink.click();
        WebElement leadKey = driver.findElementByLinkText("Leads");
        leadKey.click();
        driver.findElementByLinkText("Create Lead").click();
        
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saran");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rj");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sevuga");
        driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("saran");
        driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
        driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("02/14/1998");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");
        driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10L");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
        driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123456");
        driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("271498");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Introduction to Selenium");
        driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Dream Big");
        driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$Done$");
        
        
        WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
        countryCode.clear();
        countryCode.sendKeys("+65");
        driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0422");
        driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0584");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9626085484");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
        driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Rj");
        driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
        
        
        driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("SaranRJ");
        driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("RJ");
        driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Chennai");
        driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Okkiyamthoraipakkam");
        driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
        driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600097");
        driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("622507");
        driver.findElementByName("submitButton").click();
        
        
        
        
        
        		
        
        
        		
        
        		
        
        
        
        

	}

}
