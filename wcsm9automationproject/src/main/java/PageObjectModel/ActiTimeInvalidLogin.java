package PageObjectModel;

	

	import java.io.IOException;

	public class ActiTimeInvalidLogin  extends BaseTest{
		
		public static void main(String[] args) throws IOException {
			//to open and close browsers
			BaseTest bt = new BaseTest();
			bt.setUp();
			//get the web element from login page  pom class
			LoginPage lp = new LoginPage(driver);
			//read data from excel sheet
			Flib flib = new Flib();
			//read rowCount
			int rc = flib.rowCount(Excel_Path,INVALIDCREDS_SHEET);
			
			for(int i=1;i<=rc;i++)
			{
			    //get the method to perform invalid login from loginpage pom class
				lp.invalidLogin(flib.readDataFromExcel(Excel_Path,INVALIDCREDS_SHEET, i,0),flib.readDataFromExcel(Excel_Path,INVALIDCREDS_SHEET, i,1));		
			}
			bt.tearDown();
			
		}

	}


