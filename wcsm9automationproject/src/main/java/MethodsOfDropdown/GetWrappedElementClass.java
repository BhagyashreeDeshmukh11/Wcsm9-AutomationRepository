package MethodsOfDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/LENOVO/Desktop/wcsm9Webelement/Dropdown1.html");
		
		WebElement dropDown1=driver.findElement(By.id("iddd"));
		
		//handle dropDown
		Select sel=new Select(dropDown1);
		
		//
		WebElement allOps=sel.getWrappedElement();
		System.out.println(allOps.getText());
		
		List<WebElement> options=sel.getOptions();
		
		for(WebElement opt:options)
		{
			Thread.sleep(2000);
			if(opt.getText().equals("Poha"));
			{
				opt.click();
				break;
			}
		}
	}
}
		
		
		
	


