package MethodsOfDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		//Identify Phone No.
		WebElement dropDown1=driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring  ease-linear transition-all duration-150 w-5/12']"));
		Select sel= new Select(dropDown1);
		
		
		//select the option 
		sel.selectByIndex(3);
		Thread.sleep(2000);
		
		//identify country dropdown
		WebElement dropDown2=driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150']"));
		Select sel1= new Select(dropDown2);
		sel1.selectByValue("India");
		Thread.sleep(2000);
		
		WebElement dropDown3=driver.findElement(By.xpath("//label[text()='State']/following-sibling::select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150']"));
		Select sel2= new Select(dropDown3);
		
		sel2.selectByVisibleText("Maharashtra");
		WebElement dropDown4=driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		Select sel3= new Select(dropDown4);
		
		sel3.selectByVisibleText("Mumbai");
		WebElement dropDown5=driver.findElement(By.xpath("//label[text()='Gender']//following-sibling:select"));
		Select sel4= new Select(dropDown5);
	
		
		
	
		
		
		
		
		
	}

}
