package PopupHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Alert prompt=driver.switchTo().alert();
		Thread.sleep(2000);
		prompt.accept();

		String textOfPromptPopup=prompt.getText();
		System.out.println(textOfPromptPopup);


		//prompt.sendKeys("yes");
		
		prompt.dismiss();
		

		
	}

}
