package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	
	public static void main(String[] args)throws InterruptedException {
		
		//launch the Chrome Browser
		WebDriver driver=new ChromeDriver();
		//maximize the Chrome Browser
		driver.manage().window().maximize();
		//launch the web application
		driver.get("http://omayo.blogspot.com/");
		//Click on Open a Popup Window link
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		//stop the execution of script for 2 sec
		Thread.sleep(2000);
		driver.close();
		
		
	}
	

}
