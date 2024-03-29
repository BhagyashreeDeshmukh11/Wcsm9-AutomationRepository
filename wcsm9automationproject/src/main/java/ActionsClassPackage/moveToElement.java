package ActionsClassPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {
	
	// it is use to perform mouseHoverAction 
	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     driver.get("https://www.bluestone.com/");
	     
	     //handle pop up
	     Thread.sleep(2000);
	     driver.findElement(By.id("denyBtn")).click();
	     

	    // perform mouseHover on WATCH JEWELLERY
	     WebElement watchJewellery = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	
	     Actions act = new Actions(driver);
	     Thread.sleep(2000);
	     act.moveToElement(watchJewellery).perform();
	     
	     
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[text()='Band']")).click();
	     WebElement watchJewelleryTarget=driver.findElement(By.xpath("//span[text()='WATCH BAND JEWELLERY']"));
	     System.out.println(watchJewelleryTarget.isDisplayed());
	     driver.quit();
	
	}

}