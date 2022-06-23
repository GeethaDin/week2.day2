package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLea {
	public static void main(String[] args)
	{

	//LOad URL
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Edit.html");
			driver.manage().window().maximize();
			
	// Enter email Address
			
			WebElement emailElement=driver.findElement(By.id("email"));
			emailElement.sendKeys("mgeethu2789@gmail.com");
	// Append text 
			WebElement appendElement=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
			appendElement.sendKeys("text");
			//appendElement.sendKeys(Keys.chord(Keys.END),"text");
			appendElement.sendKeys(Keys.TAB);
			
	// Get default text
		WebElement textElement=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
			System.out.println("The default text is : " +textElement.getAttribute("value"));
			
//Clear text
			WebElement clearElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
			clearElement.clear();
			
// isEnabled()
			WebElement enabElement=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
			System.out.println("Enabled=" +enabElement.isEnabled());
}
}
