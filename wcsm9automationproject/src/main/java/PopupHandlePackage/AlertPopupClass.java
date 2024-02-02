package PopupHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert=driver.switchTo().alert();
		
		
		Thread.sleep(2000);
		//alert.accept();
		
		//get the text of alert popup
		String textOfAlert=alert.getText();
		System.out.println(textOfAlert);
		//alert.sendKeys("Bhagyashree");
		//dismiss alert popup
			alert.dismiss();
		
		
	}

}
