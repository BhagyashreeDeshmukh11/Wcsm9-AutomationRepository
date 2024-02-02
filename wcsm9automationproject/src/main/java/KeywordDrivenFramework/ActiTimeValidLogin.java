    package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Launch the Browser
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		
		//To read the data from property file
		Flib flib=new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readDataFromProperty(Prop_Path,"Username"));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readDataFromProperty(Prop_Path,"Password"));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);		
		bt.closeBrowser();
		Thread.sleep(2000);
	}

}
