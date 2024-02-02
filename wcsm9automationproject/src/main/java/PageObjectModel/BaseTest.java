package PageObjectModel;


	


	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;



	public class BaseTest extends Flib implements IautoConstant{
	static WebDriver driver;
		
		public void setUp() throws IOException
		{
			Flib flib = new Flib();// read the data from property file .
			
			String browserValue = flib.readDataFromProperty(Prop_Path,"Browser");
			String url = flib.readDataFromProperty(Prop_Path,"Url");
			
			
			if(browserValue.equalsIgnoreCase("chrome"))
			{
			      driver=new ChromeDriver();	
			}
			else if(browserValue.equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(browserValue.equalsIgnoreCase("edge"))
			{
				driver=new EdgeDriver();
			}
			else
			{
				System.out.println("Invalid BrowserValue!!!");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			
		}
		
		
		public void tearDown()
		{
			driver.quit();
		}


	}


