package assignmentPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		driver.findElement(By.name("q")).sendKeys("Mobiles",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("div[@class='_4rR01T'])[2]/ancestor::div(@class='_3pLY-C row']/descendant::div[@class='_30jeq3_1_WHN1]")).getText();
		System.out.println("price");
		driver.quit();
		
		

}
}
