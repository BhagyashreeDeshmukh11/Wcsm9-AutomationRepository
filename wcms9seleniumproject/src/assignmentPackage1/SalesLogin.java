package assignmentPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SalesLogin {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/cx/sales/");
		Thread.sleep(2000);
		driver.findElement(By.name("Username")).sendKeys("qwer");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("Remember Un")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
