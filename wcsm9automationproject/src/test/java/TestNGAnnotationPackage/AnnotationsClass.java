package TestNGAnnotationPackage;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsClass {
  @Test
  public void annotation_Test_Method() {
  
	  Reporter.log("Test Annotation",true);
  }
	  
  
  @BeforeMethod
  public void annotation_BeforeMethod()
  {
	  Reporter.log("Before Method Annotation",true);
  
  }
  
  @BeforeClass
  public void annotation_BeforeClass()
  {
	  Reporter.log("Before Class Annotation",true);
  }
  
  @BeforeSuite
  public void annotation_BeforeSuite()
  {
	  Reporter.log("Before Suite Annotation",true);
  }
  
  @AfterMethod
  public void annotation_AfterMethod()
  {
	  Reporter.log("After Method Annotation",true);
  }
  @AfterClass
  public void annotation_AfterClass()
  {
	  Reporter.log("After Class Annotation",true); 
  }
  @AfterTest
  public void annotation_AfterTest()
  {
	  Reporter.log("After Test Annotation",true); 
  }
  
  @AfterSuite
  public void annotation_AfterSuite()
  {
	  Reporter.log("After Suite Annotation",true); 
  }
  
  @Test
 
  public void test2() {
	  Reporter.log("test2",true);
  }
  
  
  
  
}
  
