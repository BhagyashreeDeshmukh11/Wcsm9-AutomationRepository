package MethodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeMethod_GetCssValue_GetrTagNamemethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
		WebElement usnTB=driver.findElement(By.xpath("//button[text()=' Login ']"));
		String attributeValue=usnTB.getAttribute("class");
		System.out.println(attributeValue);
		Thread.sleep(2000);
		
		//get the css property of username textbox i.e color
		String cssValue=usnTB.getCssValue("width");
		System.out.println(cssValue);
		
		//get the tagname of username Text box
		String tag=usnTB.getTagName();
		System.out.println(tag);
		
	}

}
