package locatorspackage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ClassName1 {
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/search?q=chandler+bing&oq=chandler&aqs=chrome.2.69i57j0i20i131i263i433i512j0i131i433i512j0i20i263i512j46i512j46i131i433i512j0i131i433i512j0i433i512j0i131i433i512j46i131i433i512.18610j0j15&sourceid=chrome&ie=UTF-8");
			Thread.sleep(2000);
			driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.className("srp EIlDfe")).click();
			
		}		


}
		
