package assignmentPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistara {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?gclid=EAIaIQobChMI9LzUzcC4gQMVu8NMAh1gsQpOEAAYASAAEgIcdvD_BwE&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=EAIaIQobChMI9LzUzcC4gQMVu8NMAh1gsQpOEAAYASAAEgIcdvD_BwE:G:s&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&gad=1");
		Thread.sleep(2000);
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select Departure City']")).sendKeys("Pune (PNQ) ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select Arrival City']")).sendKeys("Mumbai (BOM) ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select Passengers and Cabin Class ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='click on to increment passenger count']")).click();
		driver.findElement(By.xpath("//button[@aria-label='click on to increment child count']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='click on to increment child count']")).click();
		Thread.sleep(2000);
		//with absocute x path
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/form/div/div/div/div[3]/div/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/form/div/div/div/div[4]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select Departure Date']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@monthname='Oct']")).click();
	    Thread.sleep(2000);
		//driver.findElement(By.cssSelector("a[data-date='26']")).click();
	    driver.findElement(By.xpath("//a[text()='26' and (@class='ui-state-default')]")).click();
		Thread.sleep(2000);
	    
		//driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div[5]/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[5]/td[4]/a")).click();
		driver.findElement(By.xpath("//a[text()='31' and (@class='ui-state-default')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[3]/div/div[4]/div/div[3]/div/form/div[3]/div[3]/button")).click();
	
		
	
		
	}

}