package LocatorsPackage;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class PartialLinkText {
		
		public static void main(String[] args) {
			
			   WebDriver driver=new ChromeDriver();
			   driver.manage().window().maximize();
			   
			   driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsm9webelement/Link.html");
			   
			   // identify link by using partialLinkText
			   driver.findElement(By.partialLinkText("Link")).click();
		}

	}


