package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void Metho1d1() {
	  Reporter.log("Method1 from Test2 class!!",true);
  }
  @Test
  public void Method2() {
	  int a=5;
	  int b=1;
	  int res=a/b;
	  Reporter.log("Method2 from Test2 class!!"+res,true);
  }
  
}
