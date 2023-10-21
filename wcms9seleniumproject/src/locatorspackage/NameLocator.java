package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class NameLocator {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("name 4")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name 1")).click();
		driver.quit();
	}

}
