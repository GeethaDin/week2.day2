package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// Login
		WebElement usernameElement = driver.findElement(By.id("username"));
		usernameElement.sendKeys("DemoSalesManager");
		WebElement passwordElement = driver.findElement(By.name("PASSWORD"));
		passwordElement.sendKeys("crmsfa");
		WebElement loginElement=driver.findElement(By.className("decorativeSubmit"));
		loginElement.click();
		WebElement crmsfaElement= driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();
		//Leads
		WebElement leadElement=driver.findElement(By.linkText("Leads"));
		leadElement.click();
		//CreateLead
		WebElement createLeadElement=driver.findElement(By.linkText("Create Lead"));
		createLeadElement.click();
		WebElement companyNameElement=driver.findElement(By.id("createLeadForm_companyName"));
		companyNameElement.sendKeys("CTS");
		WebElement firstNameElement=driver.findElement(By.id("createLeadForm_firstName"));
		firstNameElement.sendKeys("GEETHA");
		WebElement lastNameElement=driver.findElement(By.id("createLeadForm_lastName"));
		lastNameElement.sendKeys("DINESH");
		WebElement departmentNameElement=driver.findElement(By.name("departmentName"));
		departmentNameElement.sendKeys("Testing");
		WebElement descritptionElement = driver.findElement(By.id("createLeadForm_description"));
		descritptionElement.sendKeys("Software Tester for five years");
		WebElement emailElement=driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailElement.sendKeys("mgeethu2789@gmail.com");
		WebElement stateElement=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd=new Select(stateElement);
		dd.selectByVisibleText("New York");	
		WebElement createLeadSubmitElement = driver.findElement(By.name("submitButton"));
		createLeadSubmitElement.click();
		System.out.println("Page title is:"+driver.getTitle());
		
		//Edit Lead
		
		WebElement editElement=driver.findElement(By.linkText("Edit"));
		editElement.click();

		descritptionElement.clear();
		WebElement importantNoteElement=driver.findElement(By.id("updateLeadForm_importantNote"));
		importantNoteElement.sendKeys("Will learn and adaptto the work environment");
		WebElement updateElement = driver.findElement(By.name("submitButton"));
		updateElement.click();
		System.out.println("Page title is:"+driver.getTitle());

		
		
		
		
		
		
		
		
	}

}
