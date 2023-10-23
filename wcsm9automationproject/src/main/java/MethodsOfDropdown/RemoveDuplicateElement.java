package MethodsOfDropdown;


	import java.time.Duration;
	import java.util.HashSet;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class RemoveDuplicateElement {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("file:///C:/Users/LENOVO/Desktop/wcsm9Webelement/Dropdown.html");
		   //identify dropDown and store in refernce variable
		    WebElement menudropdowp=driver.findElement(By.id("iddd"));
		    
		    //get all the option of menu dropDown
		    Select sel = new Select(menudropdowp);
		    
		    List<WebElement> allops = sel.getOptions();
		    
		    //to eliminate duplicate we use hash set
		        HashSet<String> hs = new HashSet<String>();
		        //read 
		        for(int i=0;i<allops.size();i++)
		         {
		        	 WebElement op = allops.get(i);
		        	 String dropdownOption =op.getText();
		        	 System.out.println(dropdownOption);
		        	 hs.add(dropdownOption);
		         }
		        	Thread.sleep(2000);
		        	
	               for(String opt:hs)
	                {
		               // String menudropdown =menudropdown.getText();
		                Thread.sleep(2000);
		                System.out.println(opt);
	}
		}
	}


