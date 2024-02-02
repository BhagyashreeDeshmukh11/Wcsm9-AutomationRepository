package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		
		
		Flib flib=new Flib();
		 int rc=flib.rowCount("./src/main/resources/ActiTimeTestData.xlsx","Invalid Creds");
		
		for(int i=1;i<=rc;i++)
		{
			//flib.readDataFromExcel(Excel_Path,"Invalid Creds",i,0);
			//flib.readDataFromExcel(Excel_Path,"Invalid Creds",i,1);
			
			
		
		WebElement usnTb=driver.findElement(By.name("username"));
		usnTb.sendKeys(flib.readDataFromExcel(Excel_Path,"Invalid Creds",i,0));
		Thread.sleep(2000);
		
		WebElement PassTb=driver.findElement(By.name("pwd"));
		PassTb.sendKeys(flib.readDataFromExcel(Excel_Path,"Invalid Creds",i,1));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);	
		driver.findElement(By.name("username")).clear();
		}
		bt.closeBrowser();
		Thread.sleep(2000);

	}

}
