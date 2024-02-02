package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=2p5ugfpgad8e");
		
		WebElement usnTB=driver.findElement(By.name("username"));
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		usnTB.sendKeys("admin");
		}

	
		
		
	}


