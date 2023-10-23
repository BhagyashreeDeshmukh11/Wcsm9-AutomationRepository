package MethodsOfDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect");
		Thread.sleep(2000);
		WebElement dropDown=driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select sel=new Select(dropDown);
		Thread.sleep(2000);
		for(int i=0;i<=5;i++)
		{
			sel.selectByIndex(i);
		}
		
		
	}

}
