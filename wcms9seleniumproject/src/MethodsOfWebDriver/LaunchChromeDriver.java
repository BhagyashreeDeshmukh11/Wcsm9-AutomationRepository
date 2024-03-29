package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchChromeDriver {
	
	public static void main(String[] args) throws InterruptedException {
		
		//to launch edge browser we need create obj of EdgeDriver();
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("Edge is Open!!!");
		Thread.sleep(2000);
		
		//How to close Chrome Browser
		driver.close();
		System.out.println("Edge is Close!!!");
		
	}

}
