package MethodOfWebElement;

import java.awt.Point;
import java.awt.Rectangle;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class getLocation_GetSize_GetRectMethods {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com");
		//identify email text box
		WebElement emailTextBox=driver.findElement(By.cssSelector("input#email"));
		
		//get the location of email text box
	     org.openqa.selenium.Point loc = emailTextBox.getLocation();
	     int xaxis=(int) loc.getX();
	     int yaxis=(int) loc.getY();
	     
	    
		System.out.println("location of email text box:"+xaxis+":"+yaxis);
	     Dimension size=emailTextBox.getSize();
	     int height=size.getHeight();
	     int width=size.getWidth();
	     System.out.println(emailTextBox.getCssValue("height")+"  "+emailTextBox.getCssValue("width"));
	     
	     System.out.println("Size of email text box "+height+": "+width);
	     
	     //get the location of email text box and get the size of email text box
	     org.openqa.selenium.Rectangle rect=emailTextBox.getRect();
	     
	     System.out.println(rect.getX()+"   "+rect.getY());
	     System.out.println(rect.getHeight()+"   "+rect.getWidth());
	     
	}
}
	                                                                                                                                                                                                                                             
	                                                                                                                                                                                                                                                                        
	     
	     
	     
	     
	      
	     
	     
	     
	     
	     
	     
		
		
		
		
		
		
	
