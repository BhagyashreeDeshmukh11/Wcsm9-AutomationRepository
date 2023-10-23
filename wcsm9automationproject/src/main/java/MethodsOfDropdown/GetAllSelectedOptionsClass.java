package MethodsOfDropdown;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/LENOVO/Desktop/wcsm9Webelement/Dropdown1.html");
		
		WebElement menudropdown = driver.findElement(By.id("iddd"));
		Select sel = new Select(menudropdown);
		//select multiple options from menu dropDown
		for(int i=0;i<4;i++)
        {
    		sel.selectByIndex(i);
    		

        }
		
		//read only the selected options from menu dropDown
		java.util.List<WebElement> allopts = sel.getAllSelectedOptions();
		for(int i=0; i<allopts.size(); i++)
			{
			String opt = allopts.get(i).getText();
			   Thread.sleep(2000);
	           System.out.println(opt);
	            
			}
		


		
	}
}	

		

	


