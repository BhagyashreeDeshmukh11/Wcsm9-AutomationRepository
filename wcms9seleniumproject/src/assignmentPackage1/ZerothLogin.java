package assignmentPackage1;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.ChromeDriver;
	import org.openqa.selenium.WebDriver;

	public class ZerothLogin {
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=(WebDriver) new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.Zerodha.com/");
			Thread.sleep(2000);
			driver.findElement(By.name("Userid")).sendKeys("abc");
			driver.findElement(By.name("password")).sendKeys("12345");
			Thread.sleep(2000);
			driver.quit();
		}
	}
			



