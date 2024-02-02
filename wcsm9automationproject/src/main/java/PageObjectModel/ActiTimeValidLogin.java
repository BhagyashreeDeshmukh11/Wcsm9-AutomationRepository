package PageObjectModel;



	import java.io.IOException;

	public class ActiTimeValidLogin extends BaseTest {
		
		public static void main(String[] args) throws IOException, InterruptedException {
			
			//to open and close browsers
			BaseTest bt = new BaseTest();
			bt.setUp();
			//get web element from login page pom class
			LoginPage lp = new LoginPage(driver);
			//read data from property file 
			Flib flib = new Flib();
			lp.validLogin(flib.readDataFromProperty(Prop_Path,"Username"),flib.readDataFromProperty(Prop_Path,"Password"));
			Thread.sleep(2000);
			bt.tearDown();
		}

	}


