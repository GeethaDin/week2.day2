package SeleniumExample;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageExample {
	public static void main(String[] args)
	{

	//LOad URL
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Image.html");
			driver.manage().window().maximize();
			
	//Click on the image to go to home page
			WebElement imageElement=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
			imageElement.click();
			driver.get("http://www.leafground.com/pages/Image.html");
			
	//Am I broken Image?
			WebElement imageElement2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
			Boolean im=imageElement2.isDisplayed();
			System.out.println("Image visibility = " +im);
	
	//Keyboard event
			Actions act=new Actions(driver);
			WebElement imageElement3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img"));
			imageElement3.click();
			act.moveToElement(imageElement3).click();
			//act.sendKeys(Keys.ENTER);
			//imageElement3.sendKeys(Keys.ENTER);
			
		

}
}

