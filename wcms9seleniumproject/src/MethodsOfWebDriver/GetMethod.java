package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch the Chrome Browser
		WebDriver driver=new ChromeDriver();
		//maximize the Chrome Browser
		driver.manage().window().maximize();
		//launch the web application
		driver.get("http://omayo.blogspot.com/");
		//stop the execution of script for 2 sec
		Thread.sleep(2000);
		//to quit the method
		driver.quit();
		//close the browser
		driver.close();
		
	}

}
