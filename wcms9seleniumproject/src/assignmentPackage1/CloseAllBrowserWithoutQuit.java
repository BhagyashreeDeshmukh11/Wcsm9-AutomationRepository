package assignmentPackage1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CloseAllBrowserWithoutQuit {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://omayo.blogspot.com/");
		String parentHandle=driver.getWindowHandle();
		driver.findElement(By.partialLinkText("Open a popup window"));
		Thread.sleep(2000);
		driver.switchTo().activeElement().findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		Set<String>allHandles=driver.getWindowHandles();
		for(String wh:allHandles)
		{
			if(! parentHandle.equals(wh))
			{
				driver.switchTo().window(wh).close();
			}
			driver.switchTo().window(wh).close();
		}
			
		}

}
