package TakeScreenShotPackage;

	
	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;

	import com.google.common.io.Files;

	public class ScreenShot4 {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			RemoteWebDriver rwd=(RemoteWebDriver)driver;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.instagram.com/");

			File src=rwd.getScreenshotAs(OutputType.FILE);
			File dest=new  File("./ScreenShot/selenium_ss4.png");
			Files.copy(src,dest);

		}

	}

