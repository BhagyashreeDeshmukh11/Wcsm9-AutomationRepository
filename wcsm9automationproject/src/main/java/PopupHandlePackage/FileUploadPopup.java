package PopupHandlePackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1/login.do");
		
		//perform login operation 
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		//click on settings module
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		
		//click on Logo & Color Scheme link
		driver.findElement(By.partialLinkText("Logo & Color Scheme")).click();
		
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
		Thread.sleep(2000);
		
		WebElement fileButton = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	    
		//perform double click on fileButton which open the file upload popup
		Actions act = new Actions(driver);
		act.doubleClick(fileButton).perform();
		
		//handle file upload pop up
		File file=new File("./autoItPgm/FileUpload.exe");
		String abspath=file.getAbsolutePath();
		Runtime.getRuntime().exec(abspath);
		Thread.sleep(6000);
		Runtime.getRuntime().exec(abspath);
		Thread.sleep(2000);
		driver.quit();
	}

}