package Demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngdependsonexample {
	@Test
	public void signup()
	{
		Reporter.log("Hi I am signing up",true);
	}
	@Test(dependsOnMethods = "signup")
	public void login()
	{
		Reporter.log("Hi I am logging in",true);
	}
	@Test(dependsOnMethods = "login")
	public void task()
	{
		Reporter.log("Hi I am creating a task",true);
	}
	@Test(dependsOnMethods = {"login","task"})
	public void logout()
	{
		Reporter.log("Hi I am logging out",true);
	}
}
