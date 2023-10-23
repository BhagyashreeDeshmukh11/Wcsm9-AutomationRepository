package MethodsOfDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleClass {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		//single select dropDown
		WebElement dropDown1=driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
		
		Select sel=new Select(dropDown1);
		
		boolean status=sel.isMultiple();
		System.out.println(status);
		
		//multi select dropDown
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		
		
		
	}

}
