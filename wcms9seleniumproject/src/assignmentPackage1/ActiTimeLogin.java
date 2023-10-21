package assignmentPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class ActiTimeLogin {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=(WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=d12h487aie3n1");
		Thread.sleep(2000);
		driver.findElement(By.name("Username")).sendKeys("abc");
		driver.findElement(By.name("password")).sendKeys("1234");
		Thread.sleep(2000);
		driver.close();
	}
	

}




