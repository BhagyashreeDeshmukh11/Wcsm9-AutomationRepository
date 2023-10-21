package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		//launch the Chrome Browser
				WebDriver driver=new ChromeDriver();
				//maximize the Chrome Browser
				driver.manage().window().maximize();
				//launch the web application
				driver.get("https://www.flipkart.com/");
				//stop the execution of script for 2 sec
				Thread.sleep(2000);
				//get the title of current webpage
				//String titleOfPage=driver.getTitle();
				//System.out.println("titleOfPage");
				
				System.out.println(driver.getTitle());
				driver.quit();
	}
}
