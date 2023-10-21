package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	
	public static void main(String[] args)throws InterruptedException {
		//launch the Chrome Browser
				WebDriver driver=new ChromeDriver();
				//maximize the Chrome Browser
				driver.manage().window().maximize();
				//launch the web application
				//driver.getCurrentUrl("https://www.facebook.com/");
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
				driver.quit();
				
	}

}
