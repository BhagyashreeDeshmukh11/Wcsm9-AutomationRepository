package MethodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		String parentHandle=driver.getWindowHandle();
		System.out.println("address of parent Browser or Window"+parentHandle);
		Thread.sleep(2000);
		//click on open popup window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		//get the address of parent browser and child browser
		//Set<String> allHandles = driver.getWindowHandles();
		//print the address of browsers use for each loop
		Set<String> AllHandles = driver.getWindowHandles();
		for(String wh:AllHandles)
		{
			System.out.println("parent handle:"+wh+"child handle"+wh);
		if(!parentHandle.equals(wh))
		{
			System.out.println("address of child window:"+wh);
		}
		else
		{
			System.out.println("address of parent window:"+wh);
		}
	}

		
			
		
		
	}

}

