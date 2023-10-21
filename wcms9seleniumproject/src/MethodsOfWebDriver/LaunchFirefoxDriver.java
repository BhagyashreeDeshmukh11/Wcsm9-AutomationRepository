package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxDriver {
	
	public static void main(String[] args) throws InterruptedException {
		//to launch firefox browser we need create obj of FirefoxDriver();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Firefox is open!!!");
		Thread.sleep(2000);
		
		//How to close Firefox Browser
		driver.close();
		System.out.println("Firefox is close!!!");
	}

	
}
