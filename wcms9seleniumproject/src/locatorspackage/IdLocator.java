package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class IdLocator {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/wcsm9Webelement/TextBox.html");
		
		Thread.sleep(2000);
		driver.findElement(By.id("id1")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("id2")).sendKeys("manager");
		Thread.sleep(2000);
		
	}

}
