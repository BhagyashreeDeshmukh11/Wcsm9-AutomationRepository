package PopupHandlePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https:www.flipkart.com");
		Thread.sleep(2000);
		WebElement hiddenDivisionPopup =driver.findElement(By.xpath("//span[text()='✕']"));
		hiddenDivisionPopup.click();
	

}
}
