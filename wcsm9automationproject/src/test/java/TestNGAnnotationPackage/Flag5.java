package TestNGAnnotationPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	@Test(description = "Login Performed!!")
	  public void loginMethod() {
		  
		  Reporter.log("Method1 For Login Page",true);
	  }
	  
	  @Test(description = "UserCreated",dependsOnMethods = "loginMethod")
	  public void createUsersMethod() {
		  Reporter.log("Method2 For Users Page ",true);
	  }
	  
	  @Test(description = "Logout Performed!!",dependsOnMethods = "createUsersMethod")
	  public void logoutMethod() {
		  Reporter.log("Method3 For Logout Page ", true);
	  }
	} 
  
