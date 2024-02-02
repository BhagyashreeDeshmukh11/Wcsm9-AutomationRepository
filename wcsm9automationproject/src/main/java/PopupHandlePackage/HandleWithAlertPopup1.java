package PopupHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWithAlertPopup1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("alert1")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);

		
		String textOfAlert=alert.getText();
		System.out.println(textOfAlert);
		//alert.dismiss();
		alert.accept();
		

		
	}

}
