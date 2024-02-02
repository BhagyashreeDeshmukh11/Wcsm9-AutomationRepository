package FramePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneChatBox {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		WebElement frameElement=driver.findElement(By.id("fc_widget"));
		//driver.switchTo().frame(6);// int index
		//driver.switchTo().frame("fc_widget");//string name or id
		driver.switchTo().frame(frameElement);//WebElement FrameElement
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-icon")).click();
		driver.findElement(By.id("chat-fc-name")).sendKeys("Bhagyashree");
		driver.findElement(By.id("chat-fc-email")).sendKeys("deshmukhbhagya123@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("09673938418");
		driver.findElement(By.partialLinkText("Start Chat")).click();
		
		
		
	}

}
