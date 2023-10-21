package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	
	public static void main(String[] args) throws InterruptedException{
		//launch the Chrome Browser
		WebDriver driver=new ChromeDriver();
		//maximize the Chrome Browser
		driver.manage().window().maximize();
		driver.getPageSource();
		String loginPageSourceCode=driver.getPageSource();
		System.out.println(loginPageSourceCode);
		Thread.sleep(2000);
		driver.quit();

	}

}
