package SeleniumExample;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args)
	{
		//LOad URL
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//Select option using index 
		WebElement dropdownElement1 = driver.findElement(By.xpath("//*[@id=\'dropdown1\']"));
		Select sel1=new Select(dropdownElement1);
		sel1.selectByIndex(1);
		
		//Select using text
		WebElement dropdownElement2= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/select"));
		Select sel2=new Select(dropdownElement2);
		sel2.selectByVisibleText("Selenium");
		
		// Select by Value
		WebElement dropdownElement3 = driver.findElement(By.xpath("//*[@id=\'dropdown3\']"));
		Select sel3=new Select(dropdownElement3);
		sel3.selectByValue("1");
		
//Find the number of drop down options
		WebElement dropdownElement4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		Select sel4=new Select(dropdownElement4);
		sel4.getOptions();
		
		//Get the options using SendKeys
		WebElement dropdownElement5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		dropdownElement5.sendKeys("Selenium");
		
		//select the options
		WebElement dropdownElement6 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select sel5=new Select(dropdownElement6);
		sel5.selectByIndex(1);
		
		
	
	
		
	}

}
