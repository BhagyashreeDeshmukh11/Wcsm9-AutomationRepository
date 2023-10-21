package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod1 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		//take a title of login page
		String loginPageTitle=driver.getTitle();
		System.out.println(loginPageTitle);
		
		//pass the input as admin to username Text Box
		driver.findElement(By.name("username")).sendKeys("admin");
		//pass the input as manager to password text box
		driver.findElement(By.id("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.id("loginButton")).click();
		
		//we are there in home page
		//take a title of home page
		String titleOfHomePage=driver.getTitle();
		
		
	}

}
