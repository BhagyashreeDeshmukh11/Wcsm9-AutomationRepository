package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeDriver {

	public static void main(String[] args) throws InterruptedException {
		
		//to launch edge browse we need obj of EdgeDriver();
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("Edge is Open!!!");
		Thread.sleep(2000);
		
		//How to close Edge Browser
		driver.close();
		System.out.println("Edge is Close!!!");
	}
}
