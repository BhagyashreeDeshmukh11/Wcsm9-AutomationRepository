package assignmentPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FacebookLogin {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("abc@11gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234");
		Thread.sleep(2000);
		driver.close();
	}
	

}


