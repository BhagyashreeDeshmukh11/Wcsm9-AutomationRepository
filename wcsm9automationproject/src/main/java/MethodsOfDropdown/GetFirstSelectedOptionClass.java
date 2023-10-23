package MethodsOfDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/LENOVO/Desktop/wcsm9Webelement/Dropdown1.html");
		
		WebElement dropDown1=driver.findElement(By.id("iddd"));
		Select sel=new Select(dropDown1);
		sel.selectByValue("v3");
		Thread.sleep(2000);
		WebElement firstop=sel.getFirstSelectedOption();
		System.out.println(firstop.getText());
		
		//multiple select dropDown
		driver.navigate().to("file:///C:/Users/LENOVO/Desktop/wcsm9Webelement/Dropdown1.html");
		WebElement dropDown2=driver.findElement(By.id("iddd"));
		Select sel2=new Select(dropDown2);
		Thread.sleep(2000);
		for(int i=0;i<=4;i++)
		{
			sel2.selectByIndex(i);
			
		}
		Thread.sleep(2000);
		System.out.println(sel2.getFirstSelectedOption().getText());
		
		
		
		

		
		
		

		
	}
	

}