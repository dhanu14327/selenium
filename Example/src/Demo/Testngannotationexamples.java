package Demo;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngannotationexamples {

	@Test
	public void testMethod1()
	{
		Reporter.log("Execution of testMethod1",true);
	}
	@Test
	public void testMethod2()
	{
		Reporter.log("Execution of testMethod2",true);
	}
	@BeforeMethod
	public void a()
	{
		Reporter.log("Execution of @BeforeMethod",true);
	}
	@AfterMethod
	public void b()
	{
		Reporter.log("Execution of @AfterMethod",true);
	}
	@Test
	public void testMethod3()
	{
		Reporter.log("Execution of testMethod3",true);
	}
}
