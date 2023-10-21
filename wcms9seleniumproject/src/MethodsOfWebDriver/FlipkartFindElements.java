package MethodsOfWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElements {
	
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("laptops");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV']")).click();
		driver.findElement(By.xpath("//div [@class='_3sckoD' and (text()='HP')]")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i5')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		driver.findElement(By.xpath("//div[ (text()='Windows 10')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(2000);
		List<WebElement> allLaptops=driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		List<WebElement> allPrices=driver.findElements(By.xpath(""));
		for (int i=0;i<=allLaptops.size();i++)
		{
			String laptop=allLaptops.get(i).getText();
			Thread.sleep(2000);
			System.out.println(laptop);
		}
		
		
		
		
		
		
	}

}
