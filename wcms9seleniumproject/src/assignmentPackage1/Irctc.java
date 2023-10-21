package assignmentPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("input[class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("PUNE JN - PUNE (PUNE)");
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("PUNE JN - PUNE (PUNE)");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("MUMBAI CENTRAL - MMCT (MUMBAI)");
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("MUMBAI CENTRAL - MMCT (MUMBAI)");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("div[class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
		driver.findElement(By.xpath("//div[@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("li[aria-label='AC 3 Tier (3A)']")).click();
		driver.findElement(By.xpath("//li[@aria-label='AC 3 Tier (3A)']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("div[class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
		driver.findElement(By.xpath("//div[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("li[aria-label='TATKAL']")).click();
		driver.findElement(By.xpath("//li[@aria-label='TATKAL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ng-tns-c58-10 ng-star-inserted')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Flexible With Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[4]/div/span[2]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@label='Find Trains']")).click();
		
		
	}

}